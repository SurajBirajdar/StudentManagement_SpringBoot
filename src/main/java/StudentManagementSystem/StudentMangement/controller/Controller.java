package StudentManagementSystem.StudentMangement.controller;

import StudentManagementSystem.StudentMangement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public String getAllStudents(Model model) {
        model.addAttribute("student",studentService.getAllStudents());
        model.addAttribute("message","Check");
        System.out.println("Students are" + studentService.getAllStudents());
        return "students";
    }

    /*@GetMapping("/student")
    public List<Student> getAllStudent() {
        System.out.println("Students are: " + studentService.getAllStudents());
        return studentService.getAllStudents();
    }*/




}
