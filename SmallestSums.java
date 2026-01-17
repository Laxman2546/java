//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//import java.util.PriorityQueue;
//
//public class SmallestSums{
//    public static List<List<Integer>> kSmallestPairs(int[] nums1,int[]nums2,int k){
//        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return 0;
//            }
//        });
//        for(int num:nums1){
//            pq.add(num);
//        }
//        for(int num:nums2){
//            pq.add(num);
//        }
//        while(!pq.isEmpty()){
//            int largest = pq.poll();
//            ls.add(new ArrayList<>(largest));
//        }
//        return ls;
//    }
//    public static void main(String[] args) {
//        int[] nums1 = {1,7,11};
//        int[] nums2 = {2,4,6};
//        int k = 3;
//       List res =  kSmallestPairs(nums1,nums2,k);
//        System.out.println(res);
//    }
//
//}