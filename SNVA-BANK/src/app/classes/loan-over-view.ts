import { User } from "./user";

export class LoanOverView {
/*

Loan Structure Characteristics

While this is not an exhaustive list, important considerations around loan structure 
include the following:

loan amount, which is generally a function of the loan-to-value (LTV).
LOAN AMOUNT

interest rate, as well as whether it should be a fixed rate or a variable (floating) rate.
INSTEREST RATE
FIXED OR VARIABLE

Is it operating (revolving) credit, or will the loan be structured as term financing?
CREDIT

Will the loan be reducing (amortizing), or will it be interest-only? If reducing, will the payments be periodic, or will it be structured as a “bullet” repayment?
REDUCING OR INSTREST ONLY

WHEN ARE THE PAYMENT TO BE PAID: PERIODIC OR STRUCURED AS BULLET REPAY

Is the loan secured or unsecured?
SECURED OR UNSECURED

Will security charges be first ranking (senior), or will the loan be “subordinated” (i.e., first vs. second mortgage) behind another loan or lender?
SECURITY CHARGES: FIRST RANKING OR SUBORDINATED

How frequently will the borrower be expected to provide financial reporting to the lender, and what quality should that reporting be (i.e., review engagement, audit engagement, etc.)?
FREQUENTACE PROVIDE REPORT AND QUALITY

Will there be any specific financial or non-financial loan covenants that the borrower must comply with?
ARE THERE LOAN CONEVANTS

Will there be any type of secondary (indirect) security taken (ie. government guarantee programs, personal guarantees by owners, etc.)?

    */ 
   constructor(
   public Id: number,
   public user: User,
   public LoanAmount: number,
   public IntrestRate: number,
   public IsIntrestRateFloated: boolean,
   public Credit: number,
   public IsReducingOfIntreast: boolean,
   public PayBackDate: Date,
   public IsPayBackPeriodicOrStrucured: boolean,
   public IsPayBackSecruedOrUnsecrued: boolean,
   public IsSecurityCharRankingOrSubordinated: boolean,
  
   ){}


}
