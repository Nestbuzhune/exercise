 public class Account{
    double accountbalance;

    public Account(double accountbalance) {
        if (accountbalance >=0.0){
            this.accountbalance = accountbalance;
        }
        else {
            this.accountbalance =0.0;
            System.out.println("The initial balance was invalid");
        }
        }
        void credit (double amount){
            this.accountbalance+=amount;
        }
        boolean debit (double amount){
            if (amount>this.accountbalance){
                System.out.println("Debit amount exceeded account balance");
                return false;
            }
            else{
                this.accountbalance -= amount;
                return true;
            }
            }
            double getBalance(){
                return this.accountbalance;
            }
        
        }
       

     