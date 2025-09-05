
import java.util.ArrayList;

public class RangeNumbers{
    public static void main(String[] args) {
        int[] arr = { 1,5,55,5,8,5,68,8,8,552, 2,2,2,2,2,2,2,2,2,2,3, 4, 5 };
        int target = 2;
        System.out.println(binarySearch(arr, target));
        System.out.println(binarySearch2(arr, target));
        int start = binarySearch(arr, target);
        int end = binarySearch2(arr, target);
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(start);
        ans.add(end);
        int [] ans2 = {start,end};
    }

    public static int binarySearch(int[] arr ,int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
    public static int binarySearch2(int[] arr ,int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}