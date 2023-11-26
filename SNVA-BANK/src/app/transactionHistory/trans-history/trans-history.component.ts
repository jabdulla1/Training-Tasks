import { Component, OnInit } from '@angular/core';
import { TransHistory } from 'src/app/classes/trans-history';
import { User } from 'src/app/classes/user';

@Component({
  selector: 'app-trans-history',
  templateUrl: './trans-history.component.html',
  styleUrls: ['./trans-history.component.css']
})
export class TransHistoryComponent implements OnInit{
  itemsPerPage =5;
  currentPage =1;

  TableData: TransHistory[]= [];
  Data!: TransHistory;
  AvailableBalance!: number;

  constructor(){

  }
  
  ngOnInit(): void {
    this.AvailableBalance=0;
    this.loadTable();
  }

get paginatedData(){
  const start = (this.currentPage -1) * (this.itemsPerPage);
  const end = start + this.itemsPerPage;

  return this.TableData.slice(start, end);
}

  changePage(page: number){
    //alert(page);
    this.currentPage = page;
  }

  loadTable(){
/*
        public Id: number,
        public UserData: User, 
        public PostingDate: Date,
        public Description: string,
        public Type: string,
        public Amount: number,
        public AvailableBal: number

        id: number,
        userEmail: string,
        userPassword: string
*/


    

    this.Data = new TransHistory(1, new User(1, "asldkjj@adk.com", "asd"), new Date("2023-11-22"), "PURCHASE DARUSSALAAM", "Virtual Card", -21, 60);
    this.AvailableBalance = this.Data.AvailableBal;
    this.TableData.push(this.Data);
    this.Data = new TransHistory(1, new User(1, "asldkjj@adk.com", "asd"), new Date("2023-11-21"), "Primetime Aldis", "Debit", -16, 82);
    this.TableData.push(this.Data);
    this.Data = new TransHistory(1, new User(1, "asldkjj@adk.com", "asd"), new Date("2023-11-20"), "Zelle payment", "Transfer", -100, 97);
    this.TableData.push(this.Data);
    this.Data = new TransHistory(1, new User(1, "asldkjj@adk.com", "asd"), new Date("2023-11-20"), "Zelle payment", "Debit", -50, 197);
    this.TableData.push(this.Data);
    this.Data = new TransHistory(1, new User(1, "asldkjj@adk.com", "asd"), new Date("2023-11-20"), "GOOGLE", "Deposit", 15, 247);
    this.TableData.push(this.Data);
    this.Data = new TransHistory(1, new User(1, "asldkjj@adk.com", "asd"), new Date("2023-11-20"), "Zelle payment", "Transfer", 50, 232);
    this.TableData.push(this.Data);
    this.Data = new TransHistory(1, new User(1, "asldkjj@adk.com", "asd"), new Date("2023-11-20"), "Zelle payment", "Transfer", 50, 182);
    this.TableData.push(this.Data);
    this.Data = new TransHistory(1, new User(1, "asldkjj@adk.com", "asd"), new Date("2023-11-20"), "GOOGLE", "Deposit", 77, 132);
    this.TableData.push(this.Data);
    this.Data = new TransHistory(1, new User(1, "asldkjj@adk.com", "asd"), new Date("2023-11-17"), "GOOGLE", "Debit", -77, 55);
    this.TableData.push(this.Data);
    this.Data = new TransHistory(1, new User(1, "asldkjj@adk.com", "asd"), new Date("2023-11-16"), "GOOGLE", "Debit", -1, 132);
    this.TableData.push(this.Data);
    this.Data = new TransHistory(1, new User(1, "asldkjj@adk.com", "asd"), new Date("2023-11-16"), "GOOGLE", "Debit", -15, 132);
    this.TableData.push(this.Data);
    this.Data = new TransHistory(1, new User(1, "asldkjj@adk.com", "asd"), new Date("2023-11-16"), "Zelle payment", "Transfer", 100, 148);
    this.TableData.push(this.Data);
    this.Data = new TransHistory(1, new User(1, "asldkjj@adk.com", "asd"), new Date("2023-11-15"), "GOOGLE", "Debit", -11, 48);
    this.TableData.push(this.Data);
    this.Data = new TransHistory(1, new User(1, "asldkjj@adk.com", "asd"), new Date("2023-11-14"), "Zelle payment", "Transfer", 100, 59);
    this.TableData.push(this.Data);
    this.Data = new TransHistory(1, new User(1, "asldkjj@adk.com", "asd"), new Date("2023-10-26"), "Maintenance Fee", "Bank Charge", -12, -41);
    this.TableData.push(this.Data);
    this.Data = new TransHistory(1, new User(1, "asldkjj@adk.com", "asd"), new Date("2023-10-23"), "FEE FOR ACTIVITY", "Bank Charge", -10, -29);
    this.TableData.push(this.Data);
    this.Data = new TransHistory(1, new User(1, "asldkjj@adk.com", "asd"), new Date("2023-10-23"), "PURCHASE DARUSSALAAM", "Virtual Card", -21, -19);
    this.TableData.push(this.Data);
    this.Data = new TransHistory(1, new User(1, "asldkjj@adk.com", "asd"), new Date("2023-10-20"), "GOOGLE", "Debit", -16, 2);
    this.TableData.push(this.Data);
    this.Data = new TransHistory(1, new User(1, "asldkjj@adk.com", "asd"), new Date("2023-10-19"), "Food Aldis", "Debit", -50, 18);
    this.TableData.push(this.Data);
    this.Data = new TransHistory(1, new User(1, "asldkjj@adk.com", "asd"), new Date("2023-10-19"), "Zelle payment", "Transfer", 150, 168);
    this.TableData.push(this.Data);
    this.Data = new TransHistory(1, new User(1, "asldkjj@adk.com", "asd"), new Date("2023-10-06"), "Gas", "Debit", -10, -82);
    this.TableData.push(this.Data);
    this.Data = new TransHistory(1, new User(1, "asldkjj@adk.com", "asd"), new Date("2023-10-06"), "Food Aldis", "Debit", 50, 100);
    this.TableData.push(this.Data);

    //console.log("size of TransHistory arrray: "+ this.TableData.length);
  }
  


}
