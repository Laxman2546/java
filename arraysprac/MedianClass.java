package arraysprac;

import java.util.Arrays;

public class MedianClass {

    public static int[] mergedArr(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];

        int i = 0; 
        int j=0;
        while (i < arr1.length || j<arr2.length){
            if(arr1[i] > arr2[j] && i <arr1.length){
                newArr[i] =arr1[i];
            }else if(arr1[i] < arr2[j] && j <arr1.length){
                newArr[i] =arr2[j];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 5, 6 };
        int[] arr2 = { 3, 4 };
        int[] newest = mergedArr(arr1, arr2);
        System.out.println(Arrays.toString(newest));
    }

}
