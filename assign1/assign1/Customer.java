package assign1;

public class Customer {
    //instance variables needed for Customer
    private String firstName;
    private String lastName;
    private BirthdayMonth birthdayMonth;
    private String emailAddress;
    //I left this one not private to access 
    int customerID;
    static int nextAvailableID=0;

    public Customer(String fName, String lName, BirthdayMonth bMonth, String emailA){
        //setting our instance variables + setting and incrementing the nextAvailableID

        this.firstName = fName;
        this.lastName = lName;
        this.birthdayMonth=bMonth;
        this.customerID = nextAvailableID;
        nextAvailableID += 1;
        this.emailAddress=emailA;


    }
    //getters

    public String getFName(){
        return this.firstName;
    }
    public String getLName(){
        return this.lastName;
    }
    public BirthdayMonth getbdayMonth(){
        return this.birthdayMonth;
    }
    public String getMail(){
        return this.emailAddress;
    }
}
