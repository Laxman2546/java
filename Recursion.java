public class Recursion {
    public static int fib(int idx) {
        if (idx < 2) {
            return idx;
        }
        
        return fib(idx - 1) + fib(idx - 2); 
    }
    public static void main(String[] args) {
       int n = 5;
       for(int i=0;i<n;i++){
        System.out.println(fib(i));
       }
    }
    
}
