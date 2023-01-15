package a3allotherclasses;


public class Bookshelf {

    private Book[] books = new Book[10];

    public void addBookToBookshelf(Book book){
        for(int i = 0; i<books.length; i++){
            if(books[i]==null){
                books[i]=book;
                break;
            }
            else{
                continue;
            }
        }

    }
    public Book retrieveBookFromBookshelf(String title) throws Exception{
        Book bookReturn = null;
        for(int i = 0; i<books.length; i++){
            if (books[i].getTitle()==title){
                bookReturn = books[i];
                books[i]=null;
                break;
            }
        }
        if(bookReturn == null){
            throw new Exception("Book not found on shelf");
        }
        return bookReturn;
    }
    public int howManyBooks(){
        int counter =0;
        for(int i = 0; i<books.length; i++){
            if(books[i]!=null){
                counter++;
            }   
        }
        return counter;
    }
    public void displayBooks(){
        int counter = 0;
        String returnVal="";
        returnVal += "Displaying Bookshelf: ";
        for(int i = 0; i<books.length; i++){
            if(books[i]!=null){
                returnVal+=books[i].getTitle() + ", ";
            }
            else{
                counter++;
            }
        }
        
        
        if (counter == this.books.length){
            System.out.print("Displaying Bookshelf: Bookshelf empty" + "\n");
        }
        else{
            System.out.println(returnVal);
        }
       
        
    }
    
}
