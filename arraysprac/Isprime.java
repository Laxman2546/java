package arraysprac;
public class Isprime {
    public static boolean  checkPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }


        return true;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(checkPrime(n));
    }

}
