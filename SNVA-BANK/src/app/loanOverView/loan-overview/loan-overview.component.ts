import { Component, OnInit } from '@angular/core';
import { LoanOverView } from 'src/app/classes/loan-over-view';
import { User } from 'src/app/classes/user';

@Component({
  selector: 'app-loan-overview',
  templateUrl: './loan-overview.component.html',
  styleUrls: ['./loan-overview.component.css']
})
export class LoanOverviewComponent implements OnInit{
 
/* 
  public LoanAmount: number,
   public IntrestRate: number,
   public IsIntrestRateFloated: boolean,
   public Credit: number,
   public IsReducingOfIntreast: boolean,
   public PayBackDate: Date,
   public IsPayBackPeriodicOrStrucured: boolean,
   public IsPayBackSecruedOrUnsecrued: boolean,
   public IsSecurityCharRankingOrSubordinated: boolean,
   public AreThereLoansConvants: boolean
  */  

  loanOver!: LoanOverView;
  isFloated!: string;
  isReducing!: string;
  isPeriodicOrStrucured!: string;
  isSecruedOrUnsecured!: string;
  isChargesFristOrSubordinated!: string;

  constructor(){
    this.loanOver = new LoanOverView(1, new User(1, "asldkjj@adk.com", "asd"), 100_000, .10, true, 740, true, new Date("2025-01-16"), true, true, true);
    //this.loanOver = loanOverA;
  }


  ngOnInit(): void {
    this.IsItFloated();
    this.IsItReducing();
    this.IsPeriodicOrStrucured();
    this.IsSecruedOrUnsecured();
    this.IsChargesFristOrSubordinated();
  }

 IsItFloated()
 {
  if(this.loanOver.IsIntrestRateFloated){
    this.isFloated= " YES ";
  } else{
    this.isFloated= " NO  ";
  }
 }

 IsItReducing(){
  if(this.loanOver.IsReducingOfIntreast){
    this.isReducing= " YES ";
  } else{
    this.isReducing= " NO  ";
  }
 }
  
 IsPeriodicOrStrucured(){
  if(this.loanOver.IsPayBackPeriodicOrStrucured){
    this.isPeriodicOrStrucured= " PERIODIC ";
  } else{
    this.isPeriodicOrStrucured= " STRUCTURED  ";
  }
 }

 IsSecruedOrUnsecured(){
  if(this.loanOver.IsPayBackSecruedOrUnsecrued){
    this.isSecruedOrUnsecured= " SECRUED ";
  }else{
    this.isSecruedOrUnsecured =" UNSECRUED ";
  }
 }

 IsChargesFristOrSubordinated(){
  if(this.loanOver.IsSecurityCharRankingOrSubordinated){
    this.isChargesFristOrSubordinated= " FIRST ";
  }
 else{
    this.isChargesFristOrSubordinated= " SUBORINATED ";
 }
}


}
