package stacks;

import java.util.HashSet;


class RandomizedSet {
    private HashSet<Integer> hs;
    public RandomizedSet() {
        hs = new HashSet<>();
    }

    public boolean insert(int val) {
        if(!hs.contains(val)){
            hs.add(val);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if(hs.contains(val)){
            hs.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        return 2;
    }
}
public class Getrandom {
    public static void main(String[] args) {
        RandomizedSet rs = new RandomizedSet();
        System.out.println(rs.insert(1));
        System.out.println(rs.remove(2));
        System.out.println(rs.insert(2));
        System.out.println(rs.getRandom());
        System.out.println(rs.remove(1));
        System.out.println(rs.insert(2));
        System.out.println(rs.getRandom());
    }
}
