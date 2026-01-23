import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static  int removeDuplicates2(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
    public static  int removeDuplicates(int[] nums) {
    int left = 0;
    int right = 0;
    int idx = 0;
    for(int i =0;i<nums.length;i++){
        if(left == right){
            nums[idx++] = nums[right];
            left++;
        }
        if(left < nums.length  && nums[left] == nums[right]){
            left++;
        }else{
            right = left;
        }
    }
    return  idx;
    }
    public static void main(String[] args) {
        int[] duplicates = {1,1,2};
        int num = removeDuplicates2(duplicates);
        System.out.println(Arrays.toString(duplicates));
        System.out.println(num);
    }
}
