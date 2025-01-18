import { Component } from '@angular/core';
import { StudentsService } from '../../service/students.service';
import { StudentsClass } from '../../classFolder/students-class';

@Component({
  selector: 'app-students-list',
  imports: [],
  templateUrl: './students-list.component.html',
  styleUrl: './students-list.component.css'
})
export class StudentsListComponent {
  students:StudentsClass[]=[];
  constructor(private studentService:StudentsService){}
  ngOnInit() {
    this.get();
  }
  get() {
    this.studentService.getStudents().subscribe(data=> {
      this.students=data;
    })
  }

}
