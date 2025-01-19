import { RouterModule, Routes } from '@angular/router';
import { StudentsListComponent } from './components/students-list/students-list.component';
import { AddStudentComponent } from './components/AddStudent/add-student/add-student.component';
import { UpdateStudentComponent } from './components/update-student/update-student.component';


export const routes: Routes = [
    {path:'student',component:StudentsListComponent},
    {path:'addStudent', component:AddStudentComponent},
    {path:'updateStudent/:id',component:UpdateStudentComponent},
    {path:'',redirectTo:'student',pathMatch:'full'}

];
