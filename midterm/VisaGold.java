public class VisaGold extends CreditCard {

  

    public VisaGold(String name, double balance, double creditLimit){
        super(name, balance, creditLimit);
      
    }
    public double getCreditLimit(){
        return this.creditLimit();
    }
    public double calcBonusPoints(){
        return this.balance * 0.01;
    }
    
}
