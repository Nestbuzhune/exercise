class SavingsAccount  extends Account{
    private double interestRate;

    public SavingsAccount(double accountbalance,double interestRate) {
        super(accountbalance);
        this.interestRate=interestRate;
       
    }
    double calculateInterest() {
        return this.getBalance()*(this.interestRate /100);
    }
   
   
}