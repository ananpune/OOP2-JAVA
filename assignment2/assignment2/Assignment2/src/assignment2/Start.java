package assignment2;


public class Start {
    public static void main (String [] args)
    {
        LinkedList list = new LinkedList();
        list.addCustomer(new Customer("Barny Gumble", 5));
        list.addCustomer(new Customer("Comic Book Guy", 5));
        list.addCustomer(new Customer("Agnus Skinner", 3));
        list.addCustomer(new Customer("Bleeding Gums Murphy", 5));
        list.addCustomer(new Customer("Crusty the Clown", 4));
        list.addCustomer(new Customer("Carl Carlson", 4));
        list.addCustomer(new Customer("Lenny Leonard", 4));
        list.addCustomer(new Customer("Waylon Smithers", 7));
        list.addCustomer(new Customer("Moe Szyslak", 4));
        list.addCustomer(new Customer ("Rainer Wolfcastle",7));
        //System.out.println(list.getSize());
        System.out.println(list.toString());
        list.printBirthdayCardsForSpecifiedMonth(5);
        list.reverse();
    }
}
