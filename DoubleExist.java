
public class DoubleExist {
public static void main(String[] args) {
    int[] num = { -2,0,10,-19,4,6,-8 };
    for (int i = 0; i < num.length; i++) {
        for (int j =0; j < num.length; j++) {
            if (num[i] * 2 == num[j] && num[i] != num[j] && num[j] != i) {
                System.out.println("true"+num[i]+num[j] + j);
            } else {
                //
            }
        }
        System.out.println(" ");
    } 
}
}
