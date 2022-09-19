import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Bike } from 'src/app/models/bike';
import { BikeinsuranceService } from 'src/app/services/bikeinsurance.service';

@Component({
  selector: 'app-bike',
  templateUrl: './bike.component.html',
  styleUrls: ['./bike.component.scss']
})
export class BikeComponent implements OnInit {

  bikes:Bike[]=[]

  bikeObs$!:Observable<Bike[]>

  brands:string=''

  constructor(private _bikeinsuranceService:BikeinsuranceService,
    private _router:Router,
    private _activatedRoute:ActivatedRoute) { }

  ngOnInit(): void {
    this._activatedRoute.paramMap.subscribe(map=>{
      let brand =map.get("brand");
      console.log(`${brand}`);
      if(brand){
        this.brands = brand;

    // this._bikeinsuranceService.getPlansByType(this.brands).subscribe({
    //   next:(data)=>{
    //     console.log(`${data}`);
    //     this.bikes = data;
    //   },
    //   complete:()=>console.log(`completed`)
    // });
  }
  });
  this.bikeObs$ = this._bikeinsuranceService.getAll();
  }

  show =(bikeId:number)=>{
    console.log(`id is ${bikeId}`);
    this._router.navigate(["/app-bike-insc-details",bikeId]);
  }

}
