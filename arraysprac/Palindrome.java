package arraysprac;

public class Palindrome{
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("dady");
        System.out.println(str);
        String userName = "NAni";
        double num = 5;
        // String reversed = "";
        // for (int i = 0; i < str.length(); i++) {
            
        //     reversed = str.charAt(i) + reversed;
        // }
        
        // System.out.println(reversed);

        double.toString(num);

        // optimized way 

        

        String reverse = new StringBuilder(userName).toString();
      System.out.println(reverse);
        
        int left = 0;
        int right = userName.length() - 1;
        Boolean isPalindrome = true;
        while (left < right) {
            if (userName.charAt(left) != userName.charAt(right)) {
                isPalindrome = false;
                break;
            } else {
                left++;
                right--;
            }

        }
        System.out.println(isPalindrome);

    }
}