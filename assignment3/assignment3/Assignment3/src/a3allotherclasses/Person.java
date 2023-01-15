package a3allotherclasses;

public class Person {
    //PERSON & HEART: From the black filled diamond we can see that Heart is a class that can only be used within Person, and is therefore reliant on Person.
    //PERSON & BOOK: Book can be accessed from the Person class, bookshelf and be used by itself, as indicated by the white open diamond.
    //PERSON & BOOKSHELF: Bookshelf can be accessed from Person but Person cannot be accessed by Bookshelf.
    private String name;
    private Book book;
    private Heart heart = new Heart(44, HeartBeat.PITTERPATTER);

    public Person(String name){
        this.name=name;
    }
    public Person(String name, Book book){
        this.name=name;
        this.book=book;
    }
    public String getName(){
        return this.name;
    }
    public Book getBook(){
        return this.book;
    }
    public void setBook(Book book){
        this.book=book;
    }
    public void makeHeartPump(){
        this.heart.oneMinute();
    }
    public String whatBookDoIHave(){
        if (this.book==null){
            String returnVal = this.getName()+ " has no book";
            return returnVal;
        }
        else{
            String returnVal = this.getName()+ " has the book: " + this.getBook().getTitle();
            return returnVal;
        }
    }
    public void putBookOnBookshelf(Bookshelf bookShelf){
        bookShelf.addBookToBookshelf(this.book);
        this.book=null;
    }
    public void retrieveBookFromBookshelf(String title, Bookshelf bShelf) throws Exception{
        this.book=bShelf.retrieveBookFromBookshelf(title);

    }
    
}
