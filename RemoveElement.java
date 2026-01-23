import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
     int k = 0;
        for(int num :nums){
            if(num != val){
                nums[k++] = num;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int [] nums = {3,2,2,3,3};
        int val = 3;

        int removed = removeElement(nums,val);
        System.out.println(Arrays.toString(nums));
        System.out.println(removed);
    }
}
