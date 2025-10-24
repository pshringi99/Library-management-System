public class Member extends User {
    private int borrowedBookCount;
    private final static int MAX_BORROW_LIMIT = 5;

    public Member(int borrowedBookCount){
        super();
        this.borrowedBookCount=borrowedBookCount;
    }

    public Member(String name, String contactInfo,int borrowedBookCount){
        super(name, contactInfo);
        this.borrowedBookCount=borrowedBookCount;
    }

    public Member(Member m){
        super(m.getName(),m.getContactInfo());
        this.borrowedBookCount= m.borrowedBookCount;
    }

    @Override
    public void displayDashboard() {
        System.out.println("name: " + this.getName() + " contact: " + this.getContactInfo() + " borrowed books: "
                + this.borrowedBookCount);
    }

    @Override
    public boolean canBorrowBooks(){
        if(borrowedBookCount<MAX_BORROW_LIMIT){
            return true;
        }
        return false;
    }
}
