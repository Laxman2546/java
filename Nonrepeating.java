import java.util.HashMap;

public class Nonrepeating {
    public static void main(String[] args) {
        String word = "aabbcdde";
        char[] letters = word.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char letter : letters){
           hm.put(letter,hm.getOrDefault(letter,0) + 1 );
        }
        for(int i=0;i<word.length();i++){
            if(hm.get(word.charAt(i)) == 1){
                System.out.println(i);
            }
        }
    }
}
