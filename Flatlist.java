import java.util.ArrayList;
import java.util.Arrays;

public class Flatlist {
    public static  int[]   FlattenANestedList(int[][] nested){
//        ArrayList<Integer> flatten = new ArrayList<>();
        int[] flatten = new int[26];
        return flatten;

    }
 public  static void main(String[] args) {
    int[][] nested = {{1,2,},{3,4}};
    int[] result = FlattenANestedList(nested);
     System.out.println(Arrays.toString(result));
    }
}

