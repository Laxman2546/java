public class Rotate {
   
    public static void rotateN(int[] arr, int k) {
        int times =  k % arr.length;
        for(int i = 0 ;i < times;i++){
            rotateArr(arr);
        }
   
    }
    public static void rotateArr(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i <arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length-1] = temp;
        
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 8, 6 };
        int k = 4;
        rotateN(arr,k);
        for(int nums : arr){
            System.out.println(nums);
        }
    }
}
