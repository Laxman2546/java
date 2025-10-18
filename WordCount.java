import java.util.*;

class WordCount {
    public static int counter(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            word.charAt(i);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your word: ");
        String word = scanner.next();
        int noWords = counter(word);
        System.out.println(noWords);
    }
}