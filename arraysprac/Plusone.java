package arraysprac;

import java.util.Arrays;

public class Plusone{
    public static int[] addOne(int[] arr) {
        int n = arr.length;
        int carry = 1;
        for (int i = n - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            arr[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry == 1) {
            
            int[] newArr = new int[n+1];
            newArr[0] = 1;
            return  newArr;
        }
        return arr;
        
   }
   
    public static void main(String[] args) {
        int arr[] = {9,9,9,9};
        int[] newArr = addOne(arr);
        System.out.println(Arrays.toString(newArr));
    }
}