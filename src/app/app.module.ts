import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {RouterModule} from '@angular/router';
import { AnimalsComponent } from './animals/animals.component';
import { OwnersComponent } from './owners/owners.component';
import { HomeComponent } from './home/home.component';
import {HttpClientModule} from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    AnimalsComponent,
    OwnersComponent,
    HomeComponent
  ],
  imports: [

    BrowserModule,
    HttpClientModule,
    RouterModule,
    RouterModule.forRoot(
      [{path: 'animalcontest', component: HomeComponent},
        {path: 'animalcontest/contest-participants', component: OwnersComponent}]),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
