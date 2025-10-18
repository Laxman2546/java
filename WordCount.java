import java.util.*;

class WordCount {
    public static int counter(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }

    public static int noofWords(String Words) {
        String[] word = Words.trim().split("\\s+");
        return word.length;
    } 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your word:");
        String word = scanner.nextLine();
        int noCharcters = counter(word);
        int noWords = noofWords(word);
        System.out.println("Character Count:"+ noCharcters);
        System.out.println("Words Count:"+ noWords);
    }
}

//compile command: javac WordCount.java
//run command: java WordCount