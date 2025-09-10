public class LargestNumber {
    public static String conveString(int[] arr) {
        String hell = "hello";
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length-1; i >=0; i--) {
            sb.append(arr[i]);
        }

        System.out.println(sb.toString());
        return sb.toString();
    }  
    public static void main(String[] args) {
        int arr[] = { 12,15,25 };
        conveString(arr);
        
    }
}
