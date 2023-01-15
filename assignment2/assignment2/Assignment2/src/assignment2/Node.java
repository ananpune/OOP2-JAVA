package assignment2;

public class Node {

    //payload and next node for our node class which holds a customer type
    private Node nextNode = null;
    private Customer payload;

    public Node(Customer pLoad, Node next){

        //constructor makes things a bit easier
        this.payload=pLoad;
        this.nextNode=next;
    }

    public void setNextNode(Node newNode){
        //setting next Node
        this.nextNode = newNode;
    }

    public void setPayLoad(Customer pL){
        //setting the payload
        this.payload = pL;
    }
    public Node getNextNode(){
        //retrieving the next Node
        return this.nextNode;
    }
    public Customer getPayLoad(){
        //retrieving the payload of type Customer
        return this.payload;
    }


    
}
