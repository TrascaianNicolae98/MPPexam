import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Owners} from './Model/Owners';
import {Owner} from './Model/Owner';

@Injectable({
  providedIn: 'root'
})
export class OwnersService {

  url: string;
  private httpOptions = {headers: new HttpHeaders({'Content-Type': 'application/json'})};

  constructor(private http: HttpClient) {
    this.url = "http://localhost:8080/api/";
  }

  // tslint:disable-next-line:typedef
  getOwners(){
    return this.http.get<Owners>(this.url+"getOwners",this.httpOptions);
  }

  // tslint:disable-next-line:typedef
  getOwnerById(id ?: number){
    return this.http.post<Owner>(this.url+"getOwnerDetail",JSON.stringify(id),this.httpOptions);
  }
}
