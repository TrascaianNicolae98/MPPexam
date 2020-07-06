import { Component, OnInit } from '@angular/core';
import {Animals} from '../Model/Animals';
import {Router} from '@angular/router';
import {AnimalsService} from '../animals.service';

@Component({
  selector: 'app-animals',
  templateUrl: './animals.component.html',
  styleUrls: ['./animals.component.css']
})
export class AnimalsComponent implements OnInit {
  listOfAnimals: Animals = new Animals();
  canShow = false;
  constructor(private serv: AnimalsService, private router: Router) { }


  ngOnInit(): void {
  }

  // tslint:disable-next-line:typedef
  showAnimals(){
    this.serv.getAnimals().subscribe(data=>{
      this.listOfAnimals.listOfAnimals = data["animals"]
    });
    this.canShow = true;
  }

}
