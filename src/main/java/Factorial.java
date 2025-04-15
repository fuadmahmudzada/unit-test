public class Factorial {

    public int factorial(int factorial){
        int f = factorial-1;
        for(; f>1; f--){
            factorial*=f;
        }
        return factorial;
    }

}
