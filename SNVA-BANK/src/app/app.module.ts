import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TransHistoryComponent } from './transactionHistory/trans-history/trans-history.component';
import { SumSectionComponent } from './SummarySection/sum-section/sum-section.component';
import { LoanOverviewComponent } from './loanOverView/loan-overview/loan-overview.component';
import { AccountAlertsComponent } from './accountAlerts/account-alerts/account-alerts.component';
import { LogInPageComponent } from './loginPage/log-in-page/log-in-page.component';
import { HomePageComponent } from './homePage/home-page/home-page.component';
import { PaginationComponent } from './pagination/pagination.component';

@NgModule({
  declarations: [
    AppComponent,
    TransHistoryComponent,
    SumSectionComponent,
    LoanOverviewComponent,
    AccountAlertsComponent,
    LogInPageComponent,
    HomePageComponent,
    PaginationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
