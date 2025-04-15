import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

//    @Test
//    public void getStudentTest(){
//        StudentService studentService = new StudentService();
//
//        Student student = new Student(1L, "Name");
//
//        List<Student> listOfStudents = studentService.getStudentList();
//        studentService.addStudent(student);
//
//        boolean actualResult = listOfStudents.isEmpty();
//
//        //assertTrue(actualResult);
////        assertTrue(()->actualResult);
//
//        assertTrue(()->actualResult, "it isn't empty");
//    }
//
//    @Test
//    public void getStudentTestUsingAssertFalse(){
//        StudentService studentService = new StudentService();
//
//        List<Student> studentList = studentService.getStudentList();
//        Student student = new Student(1L, "");
//        studentService.addStudent(student);
//        boolean actualResult = studentList.isEmpty();
//
//        assertFalse(actualResult, "a");
//        assertFalse(actualResult, ()->"a");
//        assertFalse(()->actualResult, "a");
//    }
//
//    @Test
//    public void getStudentByIdTestUsingAssertNull(){
//        StudentService studentService = new StudentService();
//        Student student = new Student(1L, "");
//
//       studentService.addStudent(student);
//        Student actualObject = studentService.getStudentById(1L);
//
//        //assertNull(actualObject);
//
//        assertNull(actualObject, "student object isn't null");
//    }
//
//    @Test
//    public void getStudentByIdTestUsingAssertNotNull(){
//        StudentService studentService = new StudentService();
//
//        Student student = new Student(1L, "ab");
//
//        //studentService.addStudent(student);
//        Student actualRes = studentService.getStdById(1L);
//        assertNotNull(actualRes, ()->"aa");
//    }
//
//    @Test
//    public void testUsingAssertEquals(){
//        Student student = new Student(1L, "name");
//
//        StudentService studentService = new StudentService();
//
//       // assertNotNull(studentService);
//        studentService.addStudent(student);
//        Student actualResult = studentService.getStdById(1L);
//        assertNotNull(actualResult, "student can't be null");
//        assertEquals(1L, actualResult.getId());
//        assertEquals(1L, actualResult.getId(), "id isn't 2");
//        assertEquals(.1f,(float) actualResult.getId(), .8f, "id isn't equals 0.1 with xeta payi 0.8");
//    }
//
//    @Test
//    public void testUsingAssertNotEquals(){
//        Student student = new Student(1L, "name", "a");
//        StudentService studentService = new StudentService();
//        studentService.addStudent(student);
//
//        assertNotEquals(new Student(1L, "name", "a"), studentService.getStudentById(1L));
//     //   assertNotEquals(0.2, (double)studentService.getStudentById(1L).getId() -1.6, .8, ()->"id cant be equals to -0.6 - 1");
//    }
//
    @Test
    public void getStudentsByDepartmentTest(){
        StudentService studentService = new StudentService();
        Student student = new Student(1L, "name1", "A");
        Student student1 = new Student(2L, "name2", "A");
        Student student2 = new Student(3L, "name3", "B");
        Student student3 = new Student(4L, "name4", "B");
        studentService.addStudent(student);
        studentService.addStudent(student1);
        studentService.addStudent(student2);
        studentService.addStudent(student3);

        Student[] actualResul =  studentService.getStudentsByDepartment("A");
        //Array in eyni olmasi:
        //1. onun uzunlugu
        //2. elementlerin eyni olmasi
        //3. elementlerin eyni sirada olmasi
        // Yeni tam gorunus olaraq oxsar olmalidi. Objectler ferqli yerlere point elesede olar?

        assertArrayEquals(actualResul, new Student[]{student, student1});
    }

    @Test
    public void getStudentAsListByDepartmentTest(){
        StudentService studentService = new StudentService();
        Student student = new Student(1L, "name1", "A");
        Student student1 = new Student(2L, "name2", "A");
        Student student2 = new Student(3L, "name3", "B");
        Student student3 = new Student(4L, "name4", "B");
        studentService.addStudent(student);
        studentService.addStudent(student1);
        studentService.addStudent(student2);
        studentService.addStudent(student3);

        List<Student> studentList = studentService.getStudentAsListByDepartment("A");
        assertIterableEquals(List.of(student, student1), studentList);
    }

    @Test
    public void getStudentByNameTest(){
        StudentService studentService = new StudentService();
        Student student = new Student(1L, "name1", "A");
        Student student1 = new Student(2L, "name2", "A");
        Student student2 = new Student(3L, "name3", "B");
        Student student3 = new Student(4L, "name4", "B");
        studentService.addStudent(student);
        studentService.addStudent(student1);
        studentService.addStudent(student2);
        studentService.addStudent(student3);


        assertThrows(RuntimeException.class, ()->{
            studentService.getStudentByName("name1");
        }, "this should throw an exception of studentnotfound or its super type");
    }

}