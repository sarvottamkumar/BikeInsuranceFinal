import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BikeInscDetailsComponent } from './components/bike-insc-details/bike-insc-details.component';
import { BikeComponent } from './components/bike/bike.component';
import { ContactusComponent } from './components/contactus/contactus.component';
import { HomeComponent } from './components/home/home.component';
import { PagenotfoundComponent } from './components/pagenotfound/pagenotfound.component';
import { PlansComponent } from './components/plans/plans.component';

const routes: Routes = [

  { path:'home',component:HomeComponent},


  {path:'plan',component:BikeComponent},

  { path: 'app-bike-insc-details/:bikeId',component:BikeInscDetailsComponent},

  { path:'contactus',component:ContactusComponent},
  

  { path:'',redirectTo:'/',pathMatch:'full'},
  
  { path:'**',component:PagenotfoundComponent},


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
