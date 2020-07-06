import { Component, OnInit } from '@angular/core';
import {Animals} from '../Model/Animals';
import {AnimalsService} from '../animals.service';
import {Router} from '@angular/router';
import {Owners} from '../Model/Owners';
import {OwnersService} from '../owners.service';

@Component({
  selector: 'app-owners',
  templateUrl: './owners.component.html',
  styleUrls: ['./owners.component.css']
})
export class OwnersComponent implements OnInit {
  listOfOwners: Owners = new Owners();
  canShow = false;
  constructor(private serv: OwnersService, private router: Router) { }


  ngOnInit(): void {
    this.showOwners();
  }

  // tslint:disable-next-line:typedef
  showOwners(){
    this.serv.getOwners().subscribe(data=>{
      this.listOfOwners.listOfOwners = data["owners"]
    });
    this.canShow = true;
  }

}
