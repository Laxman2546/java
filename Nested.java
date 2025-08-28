
public class Nested {
    public static void main(String[] args) {
        int[] num = { 1, 32, 28, 9,12,18,5};
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length -i- 1; j++) {
                System.out.println(j + "This is j value");
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }

            }
        }
       for(int nums : num){
        System.out.print(nums+" ");
       } 
    }
}
