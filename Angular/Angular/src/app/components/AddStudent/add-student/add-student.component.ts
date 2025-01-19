import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { StudentsClass } from '../../../classFolder/students-class';
import { StudentsService } from '../../../service/students.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-student',
  imports: [FormsModule],
  templateUrl: './add-student.component.html',
  styleUrl: './add-student.component.css'
})
export class AddStudentComponent {
student: StudentsClass=new StudentsClass();
constructor(private studentService:StudentsService, private route:Router){}
onSubmit() {
console.log(this.student);
  this.addStudent();
}

addStudent() {
  this.studentService.addStudent(this.student).subscribe();
  this.routeToStudentsPage();
}

routeToStudentsPage() {
  this.route.navigate(['/student']);
}

}
