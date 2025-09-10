package arraysprac;

class Solution {
    
    public int findPeakElement(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return 0;
        }
        
        int start = 0;
        int end = n - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int left = (mid == 0) ? Integer.MIN_VALUE : arr[mid - 1];
            int right = (mid == n - 1) ? Integer.MIN_VALUE : arr[mid + 1];
            
            if (arr[mid] >= left && arr[mid] >= right) {
                return mid;
            } else if (arr[mid] < right) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
}
public class Peakindex{

    public static void main(String[] args){
        int[] arr={1 ,2, 4 ,5, 7, 8 ,3};
        int minNumber = Math.max(120,15);
        System.out.println(minNumber + "this is min");
        Solution sol = new Solution();
        System.out.println(sol.findPeakElement(arr));
        
    }
}



