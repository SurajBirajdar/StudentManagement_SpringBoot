package StudentManagementSystem.StudentMangement.serviceImplementation;

import StudentManagementSystem.StudentMangement.entity.Student;
import StudentManagementSystem.StudentMangement.exception.ResourceNotFoundException;
import StudentManagementSystem.StudentMangement.repository.StudentRepository;
import StudentManagementSystem.StudentMangement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ServiceImplementation implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(int id) {
        return studentRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Student with Id "+id+" not found"));
    }

    @Override
    public Student updateStudentById(int id, Student studentDetails) {
        Student student = getStudentById(id);
        student.setFirstName(studentDetails.getFirstName());
        student.setLastName(studentDetails.getLastName());
        student.setEmail(studentDetails.getEmail());
        student = addStudent(student);
        return student;
    }

    @Override
    public Map<String,Boolean> deleteStudentById(int id) {
        Student student = getStudentById(id);
        studentRepository.delete(student);
        Map<String,Boolean> response = new HashMap<>();
        response.put("Deleted",Boolean.TRUE);
        //String message = "Student with ID: " + id + " deleted successfully";
        return response;
    }

}
