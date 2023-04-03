class CheckingAccount extends Account{
    private double fee;

    public CheckingAccount(double accountbalance,double fee) {
        super(accountbalance);
        this.fee=fee;
        
    }
    @Override
    void credit (double amount){
       super.credit(amount);
       this.accountbalance-=this.fee;
    }
    @Override
    boolean debit (double amount){
        boolean success =super.debit(amount);
        if (success){
            this.accountbalance-=this.fee;
        }
        return success;
    }

}