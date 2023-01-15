package assign1;

public class Start {
    
    public static void main(String[] args) {
       

        Customer cust1 = new Customer("Puneet", "Anand", BirthdayMonth.OCT,"ananpune@sheridancollege.ca" );
        //making sure the increment is working 
        System.out.println(cust1.customerID);
        Customer cust2 = new Customer("Matt", "Blair", BirthdayMonth.FEB,"blairmat@sheridancollege.ca" );
        //making sure the increment is working 
        System.out.println(cust2.customerID);
        Customer cust3 = new Customer("John", "Smith", BirthdayMonth.JAN,"johnsmith@sheridancollege.ca" );
        Customer cust4 = new Customer("Bob", "Ross", BirthdayMonth.APR,"bobross@sheridancollege.ca" );
        Customer cust5 = new Customer("Chocolate", "Chip", BirthdayMonth.OCT,"chocolatechip@cookies.ca" );
        //making sure the increment is working 
        System.out.println(cust3.customerID);
        System.out.println(cust4.customerID);
        System.out.println(cust5.customerID);
        //checking that mail worked
        System.out.println(cust5.getMail());

        //ragged array

        Customer[][] customerList={
            {cust1,cust2,cust3},
            {cust4,cust5}
        };


        //printing out first and last names
        for(int rows =0; rows < customerList.length; rows++){
                for (int inner = 0;inner<customerList[rows].length;inner++){
                    System.out.print(customerList[rows][inner].getFName() + " "+customerList[rows][inner].getLName() + ", ");
                }
                System.out.print("\n");

        
            }
      
            CRM newCRM = new CRM();
            try{
            newCRM.addCustomer(cust1);
            newCRM.addCustomer(cust2);
            newCRM.addCustomer(cust3);
            newCRM.addCustomer(cust4);
            newCRM.addCustomer(cust5);
            }
            catch (Exception e){
                System.err.println("Full CRM");
            }
            System.out.println(newCRM.getAllCustomerEmails());
            System.out.print("\n");
            newCRM.printBirthdayCards(BirthdayMonth.OCT);
           

     

        
        



            
        }













    
    
}