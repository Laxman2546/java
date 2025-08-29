import java.util.ArrayList;
import java.util.Collections;
public class Leaders {
    public static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int end = arr.length;
        int largest = arr[arr.length - 1];
        result.add(largest);
        for (int i = end-2; i >= 0; i--) {
            if (arr[i] > largest) {
                largest = arr[i];
                result.add(largest);
            }
        }
        Collections.reverse(result);
        return result;
        
    }
    public static void  main(String[] args){
        int[] arr = { 16, 17, 4, 3, 4, 5 };
        ArrayList<Integer> result = leaders(arr);
        System.out.println(result);
    }
}
