import java.util.HashSet;

public class LongestSubstring {
    public static  int lengthOfLongestSubstring(String s){
        char[] newS = s.toCharArray();
        int count = 0;
        int maxCount = 0;
        HashSet<Character> hs = new HashSet<>();
        for(char letter : newS){
            if(!hs.contains(letter)){
            hs.add(letter);
            count++;
            }else{
                maxCount=Math.max(maxCount,count);
                hs.clear();
                count=0;
            }
        }
        return Math.max(maxCount,count);
    }
    public static void main(String[] args) {
        String s = "pwwkew";

       int count =  lengthOfLongestSubstring(s);
        System.out.println(count);
    }
}
