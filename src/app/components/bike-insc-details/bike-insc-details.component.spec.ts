import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BikeInscDetailsComponent } from './bike-insc-details.component';

describe('BikeInscDetailsComponent', () => {
  let component: BikeInscDetailsComponent;
  let fixture: ComponentFixture<BikeInscDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BikeInscDetailsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BikeInscDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
