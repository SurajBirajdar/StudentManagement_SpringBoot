import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { StudentsClass } from '../classFolder/students-class';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StudentsService {
  private url = "http://localhost:8080/student";
  constructor(private httpClient:HttpClient) { }
  getStudents():Observable<StudentsClass[]> {
    return this.httpClient.get<StudentsClass[]>(`${this.url}`);
  }
}
