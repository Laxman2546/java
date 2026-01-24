public class Besttime {
    public static int maxProfit(int[] nums){
        int profit = 0;
        int minNum  = nums[0];
        for(int i=0;i<nums.length;i++){
            minNum = Math.min(minNum,nums[i]);
            profit=Math.max(profit,nums[i]-minNum);
        }
        return profit;
    }
    public static void main(String[] args) {
        int nums[] = {7,1,5,3,6,4}; //7,1,5,3,6,4 7,6,4,3,1
        int profit = maxProfit(nums);
        System.out.println(profit+"iam profit");
    }
}
