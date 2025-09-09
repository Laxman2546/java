package arraysprac;
public class Bubble {
    public static void main(String[] args) {
        int[] arr = { 7, 1 , 5, 8, 3, 9, 6 };
        bubbleSort(arr);
        for (int num : arr) {
            System.out.print(num);
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(i+"this is i");
            for (int j = 0; j <  arr.length-i- 1; j++) {
                System.out.println(j+"this is j");
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                }
         }
        
        }

   } 
}
