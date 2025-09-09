package arraysprac;
public class Findnum {
     public static int findNumbers(int[] nums) {
        int countEven = 0;
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            int countDigits = 0;
            while (number != 0) {
                int digit = number % 10;
                countDigits++;
                number = number / 10;
            }
            if(countDigits % 2 == 0){
                countEven++;
            }
        }
        return countEven;
    }
    

    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums));
    }

}
