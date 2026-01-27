public class FirstOccurence {
    public static int strStr(String haystack, String needle) {
        int left =0;
        int right = 0;
        int first = Integer.MAX_VALUE;
        boolean flag= false;
        while(right <= needle.length()-1 && left <= haystack.length()-1){
            if(haystack.charAt(left) == needle.charAt(right)){
                first = Math.min(first,left);
                flag = true;
                left++;
                right++;
            }
            else if(haystack.charAt(left) != needle.charAt(right) && flag){
                return -1;
            }else{
                left++;
            }
        }
        return first==Integer.MAX_VALUE ? -1 : first ;
    }
    public static void main(String[] args) {
            String haystack = "leetcode";
            String needle = "leet";
            int res = strStr(haystack,  needle);
            System.out.println(res+"iam res");
    }
}
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0; // Edge case

        int left = 0;
        int right = 0;
        int hayLen = haystack.length();
        int neeLen = needle.length();

        while (left < hayLen) {
            if (haystack.charAt(left) == needle.charAt(right)) {
                left++;
                right++;

                // FOUND IT! Return immediately.
                // We use left - right because left has advanced past the end of the match
                if (right == neeLen) {
                    return left - right;
                }
            } else {
                // Mismatch: Backtrack left to the character after where we started the current match attempt
                left = left - right + 1;
                right = 0;
            }
        }

        return -1;
    }
}