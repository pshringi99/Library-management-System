import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    List<Book> bookInventory;
    List<User> registeredUsers;

    public LibraryManagementSystem(){
        bookInventory=new ArrayList<>();
        registeredUsers=new ArrayList<>();
    }

    public void addBook(Book book){
        bookInventory.add(book);
    }

    public void registerUser(User user){
        registeredUsers.add(user);
    }

    public void printDetails(){
        System.out.println("Books: ");
        for (Book book:bookInventory){
            System.out.println("Author: "+book.author+" Title: "+book.title);
        }
        System.out.println("Users: ");
        for(User user:registeredUsers){
            System.out.println("Name: "+user.getName()+ " Contact number: "+user.getContactInfo()+" employee number: "+user.getUserId());
        }
    }

    public List<Book> searchBooks(String criteria){
        List<Book>searchFilter=new ArrayList<>();
        for (Book book:bookInventory) {
            if(book.author.contains(criteria) || book.title.contains(criteria)){
                searchFilter.add(book);
            }
        }
        return searchFilter;
    }
}
