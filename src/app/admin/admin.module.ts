import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AdminRoutingModule } from './admin-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { AdminComponent } from './components/admin/admin.component';
import { AddBikeComponent } from './components/add-bike/add-bike.component';
import { DeleteBikeComponent } from './components/delete-bike/delete-bike.component';
import { UpdateBikeComponent } from './components/update-bike/update-bike.component';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
  AdminComponent,
  AddBikeComponent,
  DeleteBikeComponent,
  UpdateBikeComponent
  ],
  imports: [
    CommonModule,
    AdminRoutingModule,
    FormsModule,
    HttpClientModule

  ]
})
export class AdminModule { }
