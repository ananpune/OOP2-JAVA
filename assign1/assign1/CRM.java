package assign1;

public class CRM {
   private Customer [] customers = new Customer [20];
   private int numCustomers;

   public void addCustomer(Customer customerToAdd)throws Exception {
       int lengthReal = customers.length-1;
       if(customers[lengthReal]!=null){
           throw new Exception("CRM FULL");
       }
       for(int floor =0;floor<customers.length-1; floor++){
           if (customers[floor]==null){
               customers[floor]=customerToAdd;
               this.numCustomers++;
               break;
           }
       }
       numCustomers++;
   }
   public String getAllCustomerEmails(){
    String result="";
    for(int floor =0;floor<customers.length-1; floor++){
        if (this.customers[floor]!=null){
            result+=this.customers[floor].getMail()+ "; ";
        }
        else{
            break;
        }   
    }
    return result;
   }
   public void printBirthdayCards(BirthdayMonth bMonth){
       for (int floor = 0;floor<this.customers.length-1; floor++){
           if(this.customers[floor] == null){
               break;
           }
           if(this.customers[floor].getbdayMonth()==bMonth){
               System.out.print("Dear "+this.customers[floor].getFName()+" "+this.customers[floor].getLName()+"\n" + "\n");
               System.out.print("Happy Birthday! In honour of your birthday this month, we are happy to give you this coupon for $2 off on any order over $100,000."+"\n" + "\n");
               System.out.print("Best Regards, "+ "\n");
               System.out.print("Puneet Anand"+ "\n");
               System.out.println("------------------------");
           }
        
           }
               
           }

    

   }





    

