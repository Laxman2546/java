
import java.util.HashSet;

public class Duplicates {
    
    public static int removeDuplicate(int[] arr){
        HashSet<Integer> hm = new HashSet<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if(!hm.contains(arr[i])) {
                hm.add(arr[i]);
                arr[count++] = arr[i];
            }
        }
        return count;

    }
    
    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println( removeDuplicate(arr));
        for (int nums : arr) {
            System.out.println(nums);
        }

    }
}