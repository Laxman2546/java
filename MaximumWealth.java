public class MaximumWealth {
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        int sum =0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                    sum = sum + accounts[i][j];
            }
            maxSum = Math.max(maxSum,sum);
            sum = 0;
        }
        System.out.println(maxSum);
    }
}
