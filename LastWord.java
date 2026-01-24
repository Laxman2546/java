public class LastWord {
    public static  int lengthOfLastWord(String s){
        int count = 0;
        for(int i=s.length()-1;i>=0 ;i--){
            if(s.charAt(i) != ' '){
                count++;
            }else if(count > 0 && s.charAt(i) == ' '){
                break;
            }
        }
        return  count;
    }
    public static void main(String[] args) {
        String name = "   fly me   to   the moon  ";
        int length = lengthOfLastWord(name);
        System.out.println(length);
    }
}
