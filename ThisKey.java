class Name{
    String userName;
    int age;

    public Name(String userName,int age){
        this.userName=userName;
        this.age=age;
        displayName();
    }
    public void displayName(){
        System.out.println(userName);
    }

}

class student extends Name{
    String collegeName;
    public student(String userName,int age,String collegeName){
        super(userName,age);
        this.userName=userName;
        this.age=age;
        this.collegeName=collegeName;
        System.out.println(userName);
        System.out.println(age);
        System.out.println(collegeName);
    }
}
public class ThisKey{
    public static void main(String[] args) {
        Name user1 = new Name("lakshman",25);
        student student1 = new student("lakshman",25,"mrits");
        
    }
}