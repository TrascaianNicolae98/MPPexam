import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Owners} from './Model/Owners';

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
}
