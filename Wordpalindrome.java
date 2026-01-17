public class Wordpalindrome {
    public static  boolean isPalindrome(String s){
        String nwe = s.replaceAll(",","");
        String removeSpace = nwe.replaceAll(" ","");
        String removeColon = removeSpace.replaceAll(":","").toLowerCase();
        int start = 0;
        int end  = removeColon.length()-1;
        while(start <= end){
            if(removeColon.charAt(start) != removeColon.charAt(end)){
                return false;
            }else {
                start++;
                end--;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String s= "A man, a plan, a canal: Panama";
        boolean ispalin = isPalindrome(s);
        System.out.println(ispalin);
    }
}
