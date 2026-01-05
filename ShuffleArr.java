import java.util.Arrays;

public class ShuffleArr {
    public static int[] shuffle(int[] nums, int n) {
        // TODO: Implement your solution here
        int length = nums.length;
        int[] shuffledArr = new int[length];
        int k=0;
        int left = 0;
        int right = n;
        while(left!=n && right != length){
            shuffledArr[k++] = nums[left++];
            shuffledArr[k++] = nums[right++];
        }
        return shuffledArr;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,5,4,1,7};
        int n = 3;
        int[] result = shuffle(nums,n);
        System.out.println(Arrays.toString(result));
    }
}
