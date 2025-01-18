package StudentManagementSystem.StudentMangement.serviceImplementation;

import StudentManagementSystem.StudentMangement.entity.Student;
import StudentManagementSystem.StudentMangement.repository.StudentRepository;
import StudentManagementSystem.StudentMangement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImplementation implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
