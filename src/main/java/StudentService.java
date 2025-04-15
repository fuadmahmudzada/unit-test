import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentService {
    private static final Logger log = LogManager.getLogger(StudentService.class);
    private List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList(){
        log.debug(()-> "as");
        return this.studentList;
    }


    public void addStudent(Student student){
        studentList.add(student);
    }

    public Student getStudentById(Long id){
        return studentList.stream().
                filter((student -> student.getId() == id)).
                findFirst().
                orElse(null);
    }

























    public Student getStdById(Long id){
        return studentList.stream()
                .filter(student -> student.getId()==id)
                .findFirst()
                .orElse(null);
    }



    public Student[] getStudentsByDepartment(String department){
        return studentList.stream()
                .filter(student -> student.getDepartment()
                        .equals(department))
                .toArray(Student[]::new);

    }













    public List<Student> getStudentAsListByDepartment(String department){
        return studentList.stream()
                .filter(student -> student.getDepartment()==department)
                .collect(Collectors.toList());
    }

    public Student getStudentByName(String name){
        return studentList.stream().filter(student -> student.getName().equals(name))
                .findFirst().orElseThrow(()->new StudentNotFoundException("couldn't found"));
    }


}
