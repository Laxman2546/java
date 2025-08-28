public class Adding{
public static void sumDigits(int num){
    System.out.println(num);
    int sum = 0;
    while(num > 0){
            int newNum = num % 10;
            sum +=newNum;
            num = num/10;
    }
    System.out.println(sum);
}

public static void countDigits(int num){
    System.out.println(num);
    int sum = 0;
    while(num > 0){
            int newNum = num % 10;
            sum +=newNum;
            num = num/10;
    }
    System.out.println(sum);
}



public static void main(String[] args) {
        int num = 12;
        // sumDigits(num);
        countDigits(num);
    }
}