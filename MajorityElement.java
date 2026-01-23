public class MajorityElement {



    public  static int majorityElement(int[] nums) {
        int majority = nums[0];
        int counter = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == majority){
                counter++;
            }else if(nums[i] != majority && counter > 0){
                counter--;
            }else{
                majority = nums[i];
            }
        }
        return majority;
    }
    public static void main(String[] args) {

        int[] nums = {3,2,3};
        int number = majorityElement(nums);
        System.out.println(number);
    }


}
