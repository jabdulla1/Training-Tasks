import { User } from "./user";

export class TransHistory {

    constructor(
        public Id: number,
        public UserData: User, 
        public PostingDate: Date,
        public Description: string,
        public Type: string,
        public Amount: number,
        public AvailableBal: number
    ){  }
    

}
