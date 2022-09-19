import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { PlansComponent } from './components/plans/plans.component';
import { ContactusComponent } from './components/contactus/contactus.component';
import { PagenotfoundComponent } from './components/pagenotfound/pagenotfound.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { BikeComponent } from './components/bike/bike.component';
import { BikeInscDetailsComponent } from './components/bike-insc-details/bike-insc-details.component';
import { FormsModule } from '@angular/forms';
import { AdminComponent } from './admin/components/admin/admin.component';
import { AddBikeComponent } from './admin/components/add-bike/add-bike.component';
import { AdminModule } from './admin/admin.module';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    PlansComponent,
    ContactusComponent,
    PagenotfoundComponent,
    NavbarComponent,
    BikeComponent,
    BikeInscDetailsComponent,
    // AdminComponent,
    // AddBikeComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AdminModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
