import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { BikeComponent } from 'src/app/components/bike/bike.component';
import { Bike } from 'src/app/models/bike';
import { BikeinsuranceService } from 'src/app/services/bikeinsurance.service';

@Component({
  selector: 'app-add-bike',
  templateUrl: './add-bike.component.html',
  styleUrls: ['./add-bike.component.scss']
})
export class AddBikeComponent implements OnInit {

    bike: Bike = {
      bikeName: '',
      bikeNumber: '',
      ownerName: '',
      nominee: '',
      brand: '',
      bikeId: 0,
      //insurance: undefined
    }

    brands:string[] =[];
  constructor(private _bikeinsuranceService:BikeinsuranceService) { }

  ngOnInit(): void {
    this._bikeinsuranceService.getByBrands().subscribe({
      next:(data)=>{
        this.brands = data;
      }
    })
  }

  onSubmit=(addForm:NgForm)=>{
    console.log(addForm.value);
    console.log(this.bike);
    this._bikeinsuranceService.addBike(this.bike).subscribe({
      next:(data)=>{
        console.log(data);
      }
    })

  }
}
