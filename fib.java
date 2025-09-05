import java.util.ArrayList;

public class fib {
    public static int fibna(int n) {
        if (n < 2) {
            return n;
        }
        return fibna(n - 1) + fibna(n - 2);

    }

    public static ArrayList<Integer> fibu(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0 ; i<=n;i++){
            int fibNumber = fibna(i);
            result.add(fibNumber);
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 5;
   
        System.out.println(fibu(n));
    }
}
