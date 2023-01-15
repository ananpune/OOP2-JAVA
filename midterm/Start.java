public class Start {

    public static void main(String[] args) {
        
   CreditCard[] ccList = new CreditCard[3];
   
   ccList[0] = new Visa("Rich", 1999.99, 2000);
   ccList[1] = new Visa("Lori", 100.22, 1500);
   ccList[2] = new VisaGold("Aiko", 900.43, 1000);
   System.out.println("The following people are over their limit:");
   if (ccList[0].getBalance() > ccList[0].getCreditLimit()){
       System.out.println(ccList[0].getName());
   }
   if (ccList[1].getBalance() > ccList[1].getCreditLimit()){
    System.out.println(ccList[1].getName());
    }
   if (ccList[2].getBalance() > ccList[2].getCreditLimit()){
    System.out.println(ccList[2].getName());
   }

   System.out.println();
   System.out.println("Accounts Report:");
   for(int i=0;i<ccList.length; i++){
       System.out.print("Card belongs to: ");
       System.out.print(ccList[i].getName() + "\n");
       System.out.print("Current Balance owing: ");
       System.out.print(ccList[i].getBalance() + "\n");
       System.out.print("Bonus Points: ");
       System.out.print(ccList[i].calcBonusPoints() + "\n");
       System.out.print("Making Purchase for $100: ");
       System.out.print(ccList[i].addPurchase(100.00) + "\n");
       System.out.print("Paying off credit card" + "\n");
       ccList[i].makePayment(ccList[i].getBalance());
       System.out.print("New Balance: " + ccList[i].getBalance() + "\n");
   }


}
}
