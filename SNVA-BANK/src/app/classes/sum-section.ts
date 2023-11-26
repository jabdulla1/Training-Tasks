import { User } from "./user";
export class SumSection {

    /*
    Summary Section:

Display the total assets, liabilities, and net worth.
Use visual elements such as charts or graphs to represent the 
distribution of assets and liabilities.

Assets=Liabilities+CC+BRE+R−E−D
where:
CC=Contributed Capital, capital provided by
the original stockholders (also known as Paid-In Capital)
BRE=Beginning Retained Earnings, earnings not
distributed to stockholders from the previous period
R=Revenue, what’s generated from the ongoing
operation of the company
E=Expenses, costs incurred to run operations of
the business
D=Dividends, earnings distributed to the stockholders
of the company
​
Definition of net assets
How to work out net assets
Step 1: Add up assets
Step 2: Add up liabilities
Step 3: Calculate net assets
Step 4: Create a balance sheet to check

     */

constructor(
    public Id: number,
    public UserData: User, 
    public PostingDate: Date,
    public Assests: number,
    public Liabilities: number,
    public Debt: number,
    public NetWorth: number,
    public AvailableBal: number
){  }


}
