import { Component, OnInit } from '@angular/core';
import { BikeinsuranceService } from 'src/app/services/bikeinsurance.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent implements OnInit {
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

  brands:string[] =[];
  // constructor(private _bikeinsuranceService:BikeinsuranceService) { }

  // ngOnInit(): void {
  //   this._bikeinsuranceService.getByBrand().subscribe({
  //     next:(data)=>{
  //       this.brands=data;
  //     }
  //   })
  // }

}
