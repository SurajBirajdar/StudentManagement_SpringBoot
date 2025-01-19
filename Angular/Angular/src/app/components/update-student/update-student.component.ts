import { Component } from '@angular/core';
import { StudentsService } from '../../service/students.service';
import { ActivatedRoute, Router } from '@angular/router';
import { StudentsClass } from '../../classFolder/students-class';
import { AddStudentComponent } from '../AddStudent/add-student/add-student.component';
import { FormsModule } from '@angular/forms';
import id from '@angular/common/locales/id';

@Component({
  selector: 'app-update-student',
  imports: [FormsModule],
  templateUrl: './update-student.component.html',
  styleUrl: './update-student.component.css'
})
export class UpdateStudentComponent {
  id:number = 0;
  student:StudentsClass= new StudentsClass();
  constructor(private studentService:StudentsService, private route:ActivatedRoute, private router:Router){}

  ngOnInit():void {
    this.id = this.route.snapshot.params['id'];
    this.studentService.getStudentById(this.id).subscribe(data => {
        this.student = data;
    });
  }

  onUpdate() {
    this.studentService.updateStudent(this.id,this.student).subscribe(data =>{
      this.student = data;
    });
    this.routeToStudentsPage();
  }

  routeToStudentsPage() {
    this.router.navigate(['/student']);
  }


  


}
