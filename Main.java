import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums  = {1,2,3,4,5,6,7};
        int k =3;

        RotateArray ra = new RotateArray();
        ra.rotatedArray(nums,k);
        System.out.println(Arrays.toString(nums));
    }
}
