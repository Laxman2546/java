
import java.util.HashSet;

public class common {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 4 };
        int[] nums2 = { 2, 3, 4 };
        getCommon(nums1, nums2);
    }

    public static int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> hm = new HashSet<>();
        
        for (int i : nums1) {
            hm.add(i);
        }
        for (int num : nums2) {
            if (hm.contains(num)) {
                return num;
            }
        }

        return -1;
    }
}
