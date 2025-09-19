package opps;

class A {
    public void show() {
        System.out.println("iam in am");
    }
}

class C extends A {
     public void show3() {
        System.out.println("iam in am");
    }
}
class B extends A {
    public void show2() {
        System.out.println("iam b class");
    }
}


public class objects {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.show();
        obj1.show2();
    }   
}
