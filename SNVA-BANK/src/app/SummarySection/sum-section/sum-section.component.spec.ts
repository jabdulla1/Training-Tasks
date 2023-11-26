import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SumSectionComponent } from './sum-section.component';

describe('SumSectionComponent', () => {
  let component: SumSectionComponent;
  let fixture: ComponentFixture<SumSectionComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [SumSectionComponent]
    });
    fixture = TestBed.createComponent(SumSectionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
