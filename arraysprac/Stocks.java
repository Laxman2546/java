package arraysprac;
class Stocks {
    int stockBuySell(int arr[]) {
        // code here
     if (arr == null || arr.length == 0) return 0;
        int bestBuy = arr[0];
        int maxProfit = 0;
        for(int i=1;i<arr.length;i++){
           
        if(arr[i] > bestBuy){
            maxProfit = Math.max(maxProfit,arr[i]-bestBuy);
        }
           bestBuy = Math.min(bestBuy,arr[i]);
        }
        return maxProfit;
    }
}
