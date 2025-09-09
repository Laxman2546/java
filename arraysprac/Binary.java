package arraysprac;
public class Binary{

    public static int BinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start+(end - start)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                    start = mid+1;
            }else{
                    end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {25,50,75,100,125,150};
        int target = 150;
        System.out.println(BinarySearch(arr,target));
    }
}


