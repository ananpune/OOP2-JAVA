package assignment2;

public class Customer {
    private int customerID;
    private static int nextCustomerID;
    private String name;
    private int birthdayMonth;
    
    public Customer(String name, int birthdayMonth) {
        this.name = name;
        this.birthdayMonth = birthdayMonth;
     
        this.customerID = nextCustomerID;
        nextCustomerID++;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBirthdayMonth() {
        return birthdayMonth;
    }

    public void setBirthdayMonth(int birthdayMonth) {
        this.birthdayMonth = birthdayMonth;
    }

    public boolean isAlphabeticallyBefore (Customer customer)
    {
        return this.name.compareTo(customer.name) < 0;
    }
    public boolean isAlphabeticallyAfter (Customer customer)
    {
        return this.name.compareTo(customer.name) >= 0;
    }
}
