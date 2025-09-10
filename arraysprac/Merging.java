package arraysprac;


public class Merging {
        public static int[] mergedArr(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];

        int i = 0; 
        int j = 0;
        int n = arr1.length;
        int m = arr2.length;
        
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                newArr[k++] = arr1[i++];
            } else {
                newArr[k++] = arr2[j++];
            }

        }
        while (i < n) newArr[k++] = arr1[i++];
        while (j < m) newArr[k++] = arr2[j++];

        return newArr;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2 };
        int[] arr2 = {  };
        int[] newest = mergedArr(arr1, arr2);
        int length = newest.length;
        System.out.println(length);
         if(length % 2 == 0){
             int mid1 = (length / 2) - 1;
             int mid2 = length / 2;
        System.out.println((double) (newest[mid1]+newest[mid2])/2+"hello");

    } else {
        int mid = length / 2;
        System.out.println((double) newest[mid]+"hello");
        }
    }

}
