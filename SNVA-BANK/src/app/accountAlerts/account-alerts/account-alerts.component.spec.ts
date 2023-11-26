import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AccountAlertsComponent } from './account-alerts.component';

describe('AccountAlertsComponent', () => {
  let component: AccountAlertsComponent;
  let fixture: ComponentFixture<AccountAlertsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AccountAlertsComponent]
    });
    fixture = TestBed.createComponent(AccountAlertsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
