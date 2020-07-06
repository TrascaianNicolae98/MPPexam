import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {RouterModule} from '@angular/router';
import { AnimalsComponent } from './animals/animals.component';
import { OwnersComponent } from './owners/owners.component';
import { HomeComponent } from './home/home.component';
import {HttpClientModule} from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatCheckboxModule} from '@angular/material/checkbox';
import { OwnerDetailComponent } from './owner-detail/owner-detail.component';

@NgModule({
  declarations: [
    AppComponent,
    AnimalsComponent,
    OwnersComponent,
    HomeComponent,
    OwnerDetailComponent
  ],
  imports: [

    BrowserModule,
    HttpClientModule,
    RouterModule,
    RouterModule.forRoot(
      [{path: 'animalcontest', component: HomeComponent},
        {path: 'animalcontest/contest-participants', component: OwnersComponent},
        {path: 'animalcontest/contest-participants/details/:id', component: OwnerDetailComponent}]),
    BrowserAnimationsModule,
    MatCheckboxModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
