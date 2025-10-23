public class Librarian extends User{
    String employeeNumber;

    public Librarian(){

    }

    public  Librarian(String name, String contactInfo, String employeeNumber){
        super(name,contactInfo);
        this.employeeNumber=employeeNumber;
    }

    public Librarian(Librarian l){
        super(l.getName(), l.getContactInfo());
        this.employeeNumber= l.employeeNumber;
    }

    @Override
    public void displayDashboard(){
        System.out.println("member name: "+getName()+" contact: "+getContactInfo()+ " employeeNumber: "+employeeNumber );
    }

    @Override
    public boolean canBorrowBooks(){
        return true;
    }

//    void addBook(Book book){
//
//    }
//
//    void removeBook(Book book){
//
//    }

}
