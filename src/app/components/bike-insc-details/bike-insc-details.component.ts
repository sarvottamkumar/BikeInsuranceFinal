import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Bike } from 'src/app/models/bike';
import { BikeinsuranceService } from 'src/app/services/bikeinsurance.service';

@Component({
  selector: 'app-bike-insc-details',
  templateUrl: './bike-insc-details.component.html',
  styleUrls: ['./bike-insc-details.component.scss']
})
export class BikeInscDetailsComponent implements OnInit {
 

bikeId:number=0;
 bike!:Bike;
 bikes:Bike[]=[]
  constructor(private _bikeinsuranceService:BikeinsuranceService,
              private _activatedRoute:ActivatedRoute   ) { }

  ngOnInit(): void {
    this._bikeinsuranceService.getAll().subscribe({
      next:(data)=>{
        this.bikes=data
      }
    })

    this._activatedRoute.paramMap.subscribe((map)=>{
      // pass the key
      let pid = map.get("bikeId");
      if(pid)
        this.bikeId = parseInt(pid);
    });
    
    this._bikeinsuranceService.getById(this.bikeId).subscribe({
      next:(data)=>{
        this.bike =data;
      }
    })
  }

}
