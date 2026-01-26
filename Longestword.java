import java.lang.reflect.Array;
import java.util.Arrays;

public class Longestword {
    public static  String longestWord(String input){
        if(input.length() <2){
            return input;
        }
        String word = "";
        int counter = 0;
        int st = 0;
        int end = 0;
        int maxSt = 0;
        int maxEnd = 0;
        int prevCounter = 0;
        while (end <= input.length()-1){
            if(input.charAt(end) != ' '){
                counter++;
                end++;
            }else{
                prevCounter = counter;
                counter=0;
                st=end;
                end++;
            }
            if(counter > prevCounter){
                maxSt = st;
                maxEnd = end;
            }

        }

        word = input.substring(maxSt,maxEnd).replace(" ", "");
        return word;
    }
    public  static  String longWord(String input){
        String word = "";
        int maxWordLength=0;
        String[] singleWord = input.split(" ");
        for(String words : singleWord){
            if(words.length() > maxWordLength){
                maxWordLength = Math.max(maxWordLength,words.length());
                word = words;
            }
        }
        return word;
    }
    public static void main(String[] args) {
        String Input = "Hello World";
        String word = longestWord(Input);
        String lonngWord = longWord(Input);
        System.out.println(lonngWord);
    }
}
