import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddBikeComponent } from './components/add-bike/add-bike.component';
import { AdminComponent } from './components/admin/admin.component';
import { DeleteBikeComponent } from './components/delete-bike/delete-bike.component';
import { UpdateBikeComponent } from './components/update-bike/update-bike.component';

const routes: Routes = [
  {path:'admin',component:AdminComponent,

  children:[
    {path:'addBike',component:AddBikeComponent},
    {path:'deleteBike',component:DeleteBikeComponent},
    {path:'updateBike',component:UpdateBikeComponent}

  ]

  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AdminRoutingModule { }
