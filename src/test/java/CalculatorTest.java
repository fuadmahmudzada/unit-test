import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator Operations Test")
class CalculatorTest {

    @Test
    @DisplayName("Test Addition of Two Numbers")
    @Disabled("Disabled until bug fixed")
    void add() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);

        assertEquals(3, result);
    }

    @Test
    @DisplayName("Test Subtraction of Two Numbers")
    public void subtractTest(){
        Calculator calculator = new Calculator();
        int result = calculator.subtract(4, 3);

        assertEquals(1, result, "result should equal 1");
    }
    @DisplayName("Test Multiplication of Two Numbers")
    @Test
    @Disabled("Disabled until bug gets fixed")
    public void multiplyTest(){
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 3);

        assertEquals(6, result);
    }

    @Test
    @DisplayName("test Division of Two Numbers. Dividing by 0 test is also included")
    public void divideTest(){
        Calculator calculator = new Calculator();
        int a =1;
        int b =0;
        if(b==0){
            assertThrows(ArithmeticException.class, ()->{
                calculator.divide(a, b);
            });
        }else{
            assertEquals(0, calculator.divide(a, b));
        }

    }

}