import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoanOverviewComponent } from './loan-overview.component';

describe('LoanOverviewComponent', () => {
  let component: LoanOverviewComponent;
  let fixture: ComponentFixture<LoanOverviewComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [LoanOverviewComponent]
    });
    fixture = TestBed.createComponent(LoanOverviewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
