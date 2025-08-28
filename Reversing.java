
public class Reversing {
    public static void reverse(int[] array) {
        System.out.println(array.length);
       for(int i = 0; i < array.length / 2; i++) {
            int j = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = j;
        }
   }

   
    public static void main(String[] args) {
        int[] arr = { 1, 32, 28, 9, 12, 18, 5 };
        reverse(arr);
        for(int nums : arr){
            System.out.println(nums);
        }
    }    
}
