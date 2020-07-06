import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Animals} from './Model/Animals';

@Injectable({
  providedIn: 'root'
})
export class AnimalsService {
  url: string;
  private httpOptions = {headers: new HttpHeaders({'Content-Type': 'application/json'})};

  constructor(private http: HttpClient) {
    this.url = "http://localhost:8080/api/";
  }

  // tslint:disable-next-line:typedef
  getAnimals(){
    return this.http.get<Animals>(this.url+"getAnimals",this.httpOptions);
  }
}
