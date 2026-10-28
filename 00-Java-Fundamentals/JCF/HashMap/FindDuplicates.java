
/* Given an integer array, return all numbers that appear more than once. */

import java.util.ArrayList;
import java.util.HashMap;

public class FindDuplicates {
    public static ArrayList<Integer> findDuplicates(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> duplicates = new ArrayList<>();

        for (HashMap.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }

        }
        return duplicates;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 4, 1, 5 };
        System.out.println(findDuplicates(arr));
    }
}
