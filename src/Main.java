//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem libraryManagementSystem = new LibraryManagementSystem();

        User user1=new Librarian("Pradhyuman","9928017898","101");
        User user2= new Member("Shubham","2322292",169);
        libraryManagementSystem.registerUser(user1);
        libraryManagementSystem.registerUser(user2);
//        libraryManagementSystem.printDetails();

        System.out.println();

        Book book1 = new TextBook("978-3-16-148410-0", "Effective Java", "Joshua Bloch", "Programming", 3);
        Book book2 = new NovelBook("978-0-13-468609-7", "The Catcher in the Rye", "J.D. Salinger", "Fiction");
        Book book3 = new TextBook("978-0-13-468609-9", "Clean Code", "Robert C. Martin", "Programming", 5);
        libraryManagementSystem.addBook(book1);
        libraryManagementSystem.addBook(book2);
        libraryManagementSystem.addBook(book3);
        libraryManagementSystem.printDetails();
    }
}