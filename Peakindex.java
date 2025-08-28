class Solution {
    public int peakElement(int[] arr) {
        int start = 1;
        int end = arr.length - 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid - 1] <= arr[mid] && arr[mid] >= arr[mid + 1]) {
                return 1; // found a peak
            } else if (arr[mid] < arr[mid - 1]) {
                end = mid - 1; // move left
            } else {
                start = mid + 1; // move right
            }
        }
        return 0; // no peak found in the middle range
    }
}
public class Peakindex{

    public static void main(String[] args){
        int[] arr={1 ,2, 4 ,5, 7, 8 ,3};
        int minNumber = Math.max(120,15);
        System.out.println(minNumber + "this is min");
        Solution sol = new Solution();
        System.out.println(sol.peakElement(arr));
        
    }
}



