public class Findmissing {
    private static int FindingMissingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length+1;
        for(int num:nums){
            sum+= num;
        }
        int total= n * (n+1) /2;
        int ans =  total-sum;
    return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 9, 5, 6, 4, 8};
        int num = FindingMissingNumber(nums);
        System.out.println(num);
    }


}
