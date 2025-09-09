package arraysprac;
public class Moveseroe {
    public static void main(String[] args) {
        
        int[] arr = { 1, 0, 1, 2, 1, 0, 5 };
    
        moveZeros(arr);
        for (int num : arr) {
            System.out.print(num);
        }
    }

    public static void moveZeros(int[] arr) {
        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[left++] = arr[i];
            }
        }
            while (left < arr.length) {
                arr[left++] = 0;   
            }

    }

}

