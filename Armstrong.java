public class Armstrong {
    public static void main(String[] args) {
        int n = 153;
        int original = n;
        String number = Integer.toString(n);
        int length = number.length();
        int sum = 0;
        while(n > 0){
            int temp = n %10;
            sum += (int) Math.pow(temp,length);
            n /= 10;
        }

        if(original == sum){
            System.out.println("true");;
        }else{

        System.out.println("false");
        }
    }
}
