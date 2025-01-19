import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { StudentsListComponent } from './components/students-list/students-list.component';
import { FormsModule, NgModel } from '@angular/forms';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,RouterLink,FormsModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Angular';
}
