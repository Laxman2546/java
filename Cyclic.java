
import java.util.ArrayList;

public class Cyclic {

    public static ArrayList<Integer> checkDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
       int i=0;
       while (i < arr.length) {
           if (arr[i] != i + 1 && !result.contains(arr[i])) {
               result.add(arr[i]);
           }
           i++;
       }
       return result;
    }


    public static ArrayList<Integer> cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i]>=1 && arr[i] < arr.length && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        return checkDuplicates(arr);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,2,3};
     System.out.println(cyclicSort(arr));
       
    }
} 