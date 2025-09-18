import java.util.*;

public class Longestprefix {

    public static String longestPrefix(String[] arr) {
        String prefix = arr[0];
        for(int i=0;i<arr.length;i++){
            while(arr[i].indexOf(prefix) !=0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
    public static void main (String args[]){
        String arr[] = { "lakshman", "laksh", "lakshmi" };
       System.out.println( longestPrefix(arr));
    }
}
