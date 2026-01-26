import java.lang.reflect.Array;
import java.util.Arrays;

public class ProductexceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int totalMult = 1;
        for(int num : nums){
            totalMult *= num;
        }
        for(int i=0;i<ans.length;i++){
            ans[i] = totalMult/nums[i];
        }
        return  ans;
    }
    public static int[] productExceptSelf2(int[] nums) {
        int[] ans = new int[nums.length];
        int[] preFix = new int[nums.length];
        int[] sufFix = new int[nums.length];
        preFix[0] = 1;
        sufFix[nums.length-1] = 1;
        for(int i=1;i<nums.length;i++){
            preFix[i] = nums[i-1] * preFix[i-1];
        }
        for(int j=nums.length-2;j>=0;j--){
            sufFix[j] = nums[j+1] * sufFix[j+1];
        }
        System.out.println(Arrays.toString(sufFix)+"suffix");
        System.out.println(Arrays.toString(preFix)+"prefix");
        for(int i=0;i<nums.length;i++){
            ans[i] = sufFix[i] * preFix[i];
        }
        return  ans;
    }

    public static void main(String[] args) {
       int[] nums = {1,2,3,4};
       int[] ans = productExceptSelf2(nums);
        System.out.println(Arrays.toString(ans));
    }


}
