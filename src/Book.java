import java.util.List;

public abstract class Book implements Lendable{
    String isbn;
    String title;
    String author;
    boolean isAvailable;

    //when a new book is created, intially it is going to be available
    public Book(){
        isAvailable=true;
    }
    //parameterized constructor
    public Book(String isbn, String title, String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
        this.isAvailable=true;
    }
    //copy constructor
    public Book(Book book){
        this.isbn=book.isbn;
        this.title=book.title;
        this.author=book.author;
        this.isAvailable=book.isAvailable;
    }

    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn){
        this.isbn=isbn;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author=author;
    }

    public void setAvailable(boolean isAvailable){
        this.isAvailable=isAvailable;
    }

    @Override
    public boolean lend(User user) {
        if(isAvailable && user.canBorrowBooks()){
            isAvailable=false;
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(User user) {
        isAvailable=true;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    //Abstract method
    abstract void displayBookDetails();
}
