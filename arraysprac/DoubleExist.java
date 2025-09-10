package arraysprac;

public class DoubleExist {
public static void main(String[] args) {
        int[] num = { -2,0,10,-19,4,-4,-8 };
    for (int i = 0; i < num.length; i++) {
        for (int j =0; j < num.length; j++) {
            if (i != j && num[i] * 2 == num[j]) {
                System.out.println("true"+num[i]+num[j] + j);
            }
        }
    } 
}
}
