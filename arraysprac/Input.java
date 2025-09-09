package arraysprac;
import java.util.*;

public class Input {

    // Function to print hello
    public static void main(String[] args) {
        double number = Math.PI;
        printHello();
    }

    
    
    static void printHello() {

        // Your code here
        Scanner a = new Scanner(System.in);
      int intInput = a.nextInt();
      System.out.println(intInput);
        Scanner b = new Scanner(System.in);
     float floatInput = b.nextFloat();
     System.out.println(floatInput);
         Scanner c = new Scanner(System.in);
       long longInput = c.nextLong();
       System.out.println(longInput);
           Scanner d = new Scanner(System.in);
        byte byteInput = d.nextByte();
            System.out.println(byteInput);
         Scanner s = new Scanner(System.in);
    String stringInput = s.nextLine();
        System.out.println(stringInput);

    }
}
