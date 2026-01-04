public class SumDigits {
    public static void main(String[] args) {
        int n =1203;
        int sum = 0;
//        while (n>0){
//            int temp = n %10;
//            sum += temp;
//            n = n/10;
//        }
        String number = Integer.toString(n);
        for(int i=0;i<number.length();i++){
            if(number.charAt(i) == 0){
                System.out.println(false);
                break;
            }
        }
System.out.println(true);
        System.out.println(sum);
    }
}
