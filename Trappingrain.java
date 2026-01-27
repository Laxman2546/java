public class Trappingrain {
    public static int trap(int[] height) {
        int left= 0;
        int right = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int res =0;
        while(left < right){
            leftMax = Math.max(leftMax,height[left]);
            rightMax = Math.max(rightMax,height[right]);
            if(leftMax < rightMax){
                res += (leftMax-height[left]);
                left++;
            }else{
                res += (rightMax-height[right]);
                right--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] heights = {4,2,0,3,2,5};
        int trapped = trap(heights);
        System.out.println(trapped);
    }
}
