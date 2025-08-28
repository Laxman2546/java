
import java.util.Arrays;

public class Cyclic {
    public static void cyclicSort(int[] arr) {
        int i = 0;
       while (i < arr.length) {
        int correct = arr[i]- 1;
        if (arr[i] < arr.length && arr[i] != arr[correct]) {
            int temp = arr[i];
            arr[i] = arr[correct];
            arr[correct] = temp;
        }else {
            i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 25, 52, 42, 35, 28 };
        cyclicSort(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
} 