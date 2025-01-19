package StudentManagementSystem.StudentMangement.service;

import StudentManagementSystem.StudentMangement.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {

    public List<Student> getAllStudents();
    public Student addStudent(Student student);
    public Student getStudentById(int id);
    public Student updateStudentById(int id, Student student);
    public Map<String,Boolean> deleteStudentById(int id);

}
