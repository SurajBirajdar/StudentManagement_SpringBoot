import { Component } from '@angular/core';
import { StudentsService } from '../../service/students.service';
import { StudentsClass } from '../../classFolder/students-class';
import { Router } from '@angular/router';

@Component({
  selector: 'app-students-list',
  imports: [],
  templateUrl: './students-list.component.html',
  styleUrl: './students-list.component.css'
})
export class StudentsListComponent {
  students:StudentsClass[]=[];
  constructor(private studentService:StudentsService, private route:Router){}
  ngOnInit() {
    this.get();
  }
  get() {
    this.studentService.getStudents().subscribe(data=> {
      this.students=data;
    })
  }

  updateStudent(id: number) {
    this.route.navigate(["updateStudent",id]);
  }

  deleteStudent(id: number) {
    this.studentService.deleteStudent(id).subscribe(data=>{
      this.get();
    })
  }

}
