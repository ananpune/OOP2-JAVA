public abstract class CreditCard implements CCFunctions {
    private String name;
    protected double balance;
    private double creditLimit;

    public CreditCard(String name, double balance, double creditLimit){
        this.name=name;
        this.balance=balance; 
        this.creditLimit = creditLimit;
    }
    public String getName(){
        return this.name;
    }
    public double getBalance(){
        return this.balance;
    }
    public double creditLimit(){
        return this.creditLimit;
    }
    @Override
    public String addPurchase(double cost){
        String returnVal;
        if(((this.balance + cost) > this.creditLimit)){
            returnVal = "Purchase Declined - Over Credit Limit";
        }
        else{
            this.balance += cost;
            returnVal = "Purchased Approved!";
        }
        return returnVal;

    }
    @Override
    public void makePayment(double payment){
        this.balance -= payment;
    }

    public abstract double calcBonusPoints();



    
}
