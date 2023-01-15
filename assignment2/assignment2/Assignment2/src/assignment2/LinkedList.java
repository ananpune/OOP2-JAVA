package assignment2;
import java.util.Stack;

public class LinkedList {

    private Node head=null;
    private int linkedListSize =0;

    public void addCustomer(Customer customerToAdd){
        Node pivot= this.head;
        Node newNode = new Node(customerToAdd, this.head);
        //checking if the head itself is null and if the customer within head comes after the customer that needs to be added
        if(this.head == null || this.head.getPayLoad().isAlphabeticallyAfter(customerToAdd)){
            //just set the head to the NewNode
            this.head=newNode;
        }
        else{
            //moving pivot over while checking that the next node's payload is before our customerToAdd
            while((pivot.getNextNode()!=null) && (pivot.getNextNode().getPayLoad().isAlphabeticallyBefore(newNode.getPayLoad()))){
                pivot = pivot.getNextNode();
            }
            //set everything after the newNode to the nextNode of the pivot
            newNode.setNextNode(pivot.getNextNode());    
            //the pivot's next node will be our charactertoAdd Node
            pivot.setNextNode(newNode);          
        }
        //increment size
        linkedListSize++;  
       
    }

    public int getSize(){
        //size function for testing
        return this.linkedListSize;
    }

    public String toString(){
        //similar to mod3 yourturn3
        //String to hold our return val
        String returnVal="List of All Customers: " +"\n";
        //making a new pivot to use for this function
        Node pivot=new Node (this.head.getPayLoad(), this.head.getNextNode());

        //while the pivot isn't empty/null, keep adding the name of the payload(customer name)
        while(pivot!= null){
            returnVal+="         "+ pivot.getPayLoad().getName() + "\n";
            //shift pivot
            pivot = pivot.getNextNode();
            
        }
        return returnVal;
    }
    public void printBirthdayCardsForSpecifiedMonth(int birthdayMonth){
        //establishing a pivot once again
        Node pivot=new Node (this.head.getPayLoad(), this.head.getNextNode());
        while(pivot.getNextNode()!=null){
            //check for matching birthday months
            if (pivot.getPayLoad().getBirthdayMonth() == birthdayMonth){
                System.out.print("Happy Birthday "+pivot.getPayLoad().getName() +"\n");
                System.out.print("Please accept our coupon for $10 off of your next purchase of more than $100,000" + "\n");
                System.out.println();
                pivot = pivot.getNextNode();
            }
            else{
                pivot = pivot.getNextNode();

        }
        
        }
    }
    public void reverse(){
        Stack <Node> stack = new Stack<Node>();
        Node pivot=new Node(this.head.getPayLoad(), this.head.getNextNode());
        while(pivot!=null){
            //push everything one by one onto stack
            stack.push(pivot);
            pivot=pivot.getNextNode();
            
        }
        System.out.print("Bonus Question - The names in reverse:" +"\n");
        //print out every pop
        while(!stack.isEmpty()){
            System.out.print("             " + stack.pop().getPayLoad().getName());
            System.out.println();

        }
    }
}


