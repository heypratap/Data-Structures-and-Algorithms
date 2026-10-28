/* Given an integer array, return true if any value appears at least twice, otherwise return false. */

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        System.out.println(containsDuplicate(nums)); // true
    }

}
