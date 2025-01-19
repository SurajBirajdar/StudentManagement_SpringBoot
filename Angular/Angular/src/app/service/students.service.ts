import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { StudentsClass } from '../classFolder/students-class';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StudentsService {
  private url = "http://localhost:8080/student";
  private addStudentUrl = "http://localhost:8080/addStudent";
  private updateStudentUrl = "http://localhost:8080/student/update";
  private deleteStudentUrl = "http://localhost:8080/student/delete";
  constructor(private httpClient:HttpClient) { }
  getStudents():Observable<StudentsClass[]> {
    return this.httpClient.get<StudentsClass[]>(`${this.url}`);
  }

  addStudent(student:StudentsClass):Observable<object> {
    return this.httpClient.post(`${this.addStudentUrl}`, student);
  }

  getStudentById(id:number):Observable<StudentsClass>{
    return this.httpClient.get<StudentsClass>(`${this.url}/${id}`);
  }

  updateStudent(id:number, student:StudentsClass):Observable<StudentsClass> {
    return this.httpClient.put<StudentsClass>(`${this.updateStudentUrl}/${id}`,student);
  }

  deleteStudent(id:number):Observable<object> {
    return this.httpClient.delete<StudentsClass>(`${this.deleteStudentUrl}/${id}`);
  }


}
