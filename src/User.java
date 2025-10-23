public abstract class User {
    private int idCounter=1;
    private final String userId;
    private String name;
    private String contactInfo;

    public User(){
        this.userId= this.generateUniqueId();
    }

    public User(String name,String contactInfo){
        this();
        this.name=name;
        this.contactInfo=contactInfo;
    }

    public User(User u){
        this.userId=u.userId;
        this.name=u.name;
        this.contactInfo=u.contactInfo;
    }

    private final String generateUniqueId(){
        return String.valueOf(idCounter++);
    }

    public String getUserId(){
        return this.userId;
    }

    public String getName(){
        return this.name;
    }

    void setName(String name){
        this.name=name;
    }

    public String getContactInfo(){
        return this.contactInfo;
    }

    void setContactInfo(String contactInfo){
        this.contactInfo=contactInfo;
    }

    public int getTotalUser() {
        return idCounter;
    }

    abstract public void displayDashboard();
    abstract public boolean canBorrowBooks();
}
