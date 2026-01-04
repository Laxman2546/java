public class BreakAmount {
    public static void main(String[] args) {
    int amount = 2550;
    int[][] breakedAmount ={
            {1000,1},{

            }
        };
    int k=0;
    while(amount > 0){
       int temp = amount%10;
        System.out.println(temp);

        amount /= 10;
    }

    }



}
