import java.util.HashMap;
import java.util.HashSet;

public class Isomorphic {
    public static boolean isIsomporphic(String s1,String s2){
        HashMap<Character,Character> hm=new HashMap<>();
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<s1.length();i++){
            char c1 = s1.charAt(i),c2=s2.charAt(i);
            if(hm.containsKey(c1)){
                if(hm.get(c1) !=c2){
                    return false;
                }
            }else{
                if(hs.contains(c2)) return false;
                hm.put(c1,c2);
                hs.add(c2);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "paper";
        String s2 = "title";
        boolean res = isIsomporphic(s1,s2);
        System.out.println(res);
    }
}
