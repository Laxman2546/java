
public class Reversing {
    public static void reverse(int[] array) {
        System.out.println(array.length);
       for(int i = 0; i < array.length / 2; i++) {
            int j = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = j;
        }
   }

     public static int reverseNum(int num){
         int reversed = 0;
         while (num != 0) {
            int remiander = num % 10;
            reversed = reversed * 10 + remiander;
            num = num / 10;
         }
         return reversed;
   }
   
    public static void main(String[] args) {
        int[] arr = { 1, 32, 28, 9, 12, 18, 5 };
        int num = -321;
        System.out.println(reverseNum(num));
        // reverse(arr);
        // for(int nums : arr){
        //     System.out.println(nums);
        // }
    }    
}
