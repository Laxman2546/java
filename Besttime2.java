public class Besttime2 {
    public static void main(String[] args) {
        int profit = 0;
        int arr[] = {7, 1, 5, 3, 6, 4};
        int i =0;
        int n = arr.length;
        int lMax = arr[0];
        int lMin= arr[0];
        while(i<n-1){
            while (i<n-1 && arr[i] >= arr[i+1]){
                i++;
            }
            lMin = arr[i];
            while (i<n-1 && arr[i] <= arr[i+1]){
                i++;
            }
            lMax = arr[i];
            profit +=(lMax-lMin);
        }
        System.out.println(profit);
    }
}
