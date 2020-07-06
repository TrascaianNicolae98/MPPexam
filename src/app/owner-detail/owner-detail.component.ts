import { Component, OnInit } from '@angular/core';
import {Owner} from '../Model/Owner';
import {ActivatedRoute} from '@angular/router';
import {HttpHeaders} from '@angular/common/http';
import {OwnersService} from '../owners.service';

@Component({
  selector: 'app-owner-detail',
  templateUrl: './owner-detail.component.html',
  styleUrls: ['./owner-detail.component.css']
})
export class OwnerDetailComponent implements OnInit {
  owner: Owner = new Owner();
  id: number;
  canShow = false;
  constructor(private serv: OwnersService,private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.getOwnerById();
  }

  // tslint:disable-next-line:typedef
  getOwnerById(){
    debugger
    this.id = +this.route.snapshot.paramMap.get('id');
    this.serv.getOwnerById(this.id).subscribe(data=>{
      this.owner = data["owner"];
    });
    this.canShow = true;
  }

}
