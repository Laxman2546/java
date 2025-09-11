
public class Duplicates {
    
     public static int removeDuplicates(int[] arr) {
        int count = 0;
        for(int i=0;i <arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = { 12,5,8,9,5,6,8,5,8,5};
        int count = removeDuplicates(arr);
        
        System.out.print(count);
    }
    
}