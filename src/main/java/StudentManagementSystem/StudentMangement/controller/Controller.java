package StudentManagementSystem.StudentMangement.controller;

import StudentManagementSystem.StudentMangement.entity.Student;
import StudentManagementSystem.StudentMangement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Controller {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public String getAllStudents(Model model) {
        model.addAttribute("student",studentService.getAllStudents());
        System.out.println("Students are" + studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/student")
    public List<Student> getAllStudent() {
        System.out.println("Students are: " + studentService.getAllStudents());
        return studentService.getAllStudents();
    }






}
