package arraysprac;
import java.util.Arrays;

public class Sorting3 {
    public static void sortArr(int[] arr) {
        int i=0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] != arr[correct] && arr[i] < arr.length) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        } 
    }
    
    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 4, 2};
         sortArr(arr);
      System.out.println(Arrays.toString(arr));
    }

}
