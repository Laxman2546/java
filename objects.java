
import static com.lakshman.Greet.greeting;

 class nani {
    String name;
    int age;
    static int population = 0;

    nani(String name, int age) {
        this.name=name;
        this.age = age;
        nani.population += 1;
    }
}


public class objects {
    public static void main(String[] args) {
        nani obj1 = new nani("lakshman", 25);
        nani obj2 = new nani("arun", 30);
        System.out.println(obj1.name + obj1.age);
        System.out.println(obj2.name + obj2.age);
        System.out.println(nani.population);
        greeting();
    }
    
}
