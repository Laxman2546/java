
import java.util.Arrays;

public class BubbleRcursion {

        public static void bubbleSort(int[] arr,int n){
            if (n == 1) {
                System.out.println(n);
            }
            int count = 0;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    count++;
                }
            }
            if (count == 0) {
                return;
                
            }
            bubbleSort(arr, n-1);
            
        }
       public static void main(String[] args) {
           int arr[] = { 5,2,3,1,4 };
           int n = arr.length;
           bubbleSort(arr, n);
           System.out.println(Arrays.toString(arr));
       
    }
}
