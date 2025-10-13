package opps;
class Person{
    private String Name;
    
    public void setName(String newName){
        Name = newName; 
    }
    public void displayName(){
        System.out.println(Name);
    }
}

public class Priva{
    public static void main(String[] args){
        Person p1 = new Person();
        p1.setName("Lakshman");
        p1.displayName();
    }
}