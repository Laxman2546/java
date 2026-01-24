public class ValidPalindrome {
    public static boolean isPalindrome(String s){

        if(s.length()<2){
            return true;
        }
        String colon = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(colon);

        System.out.println(colon.length());
        int left= 0;
        int right = colon.length()-1;
        while (left <right){
            if(colon.charAt(left) != colon.charAt(right)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean is = isPalindrome(s);
        System.out.println(is);
    }
}
