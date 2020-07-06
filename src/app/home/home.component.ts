import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }
  // tslint:disable-next-line:typedef
  goToAnimals() {
    this.router.navigate(['animalcontest/contest-participants']);
  }

  // tslint:disable-next-line:typedef
  goToOwners() {
    this.router.navigate(['animalcontest/contest-participants']);
  }
}
