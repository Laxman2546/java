import java.util.Arrays;

public class Maximize {
    public static void main(String[] args) {
        int arr[] = {3,5,4,2,4,6};
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        int max = 0;
        while(left < right){
            max = Math.max(max,arr[left++] + arr[right--]);
        }
        System.out.println(max);
    }
}
