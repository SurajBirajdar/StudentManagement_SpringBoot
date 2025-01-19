package StudentManagementSystem.StudentMangement.controller;

import StudentManagementSystem.StudentMangement.entity.Student;
import StudentManagementSystem.StudentMangement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @PostMapping("/addStudent")
    public ResponseEntity<Student> addStudent(@RequestBody Student studentDetails) {
    Student student = studentService.addStudent(studentDetails);
    return ResponseEntity.ok(student);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudentByID(@PathVariable int id) {
        Student student =  studentService.getStudentById(id);
        return ResponseEntity.ok(student);
    }

    @PutMapping("/student/update/{id}")
    public ResponseEntity<Student> updateStudentByID(@PathVariable int id, @RequestBody Student studentDetails) {
        Student student = studentService.updateStudentById(id,studentDetails);
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("/student/delete/{id}")
    public Map<String, Boolean> deleteStudentByID(@PathVariable int id) {
        Map<String,Boolean> response = studentService.deleteStudentById(id);
        return response;
    }






}
