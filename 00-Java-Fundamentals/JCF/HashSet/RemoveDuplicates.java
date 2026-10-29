
/* Remove duplicates from an array while preserving the original order. */
import java.util.HashSet;
import java.util.ArrayList;

public class RemoveDuplicates {
    public static ArrayList<Integer> removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> originalOrder = new ArrayList<>();
        for (int num : arr) {
            if (set.add(num)) {
                originalOrder.add(num);
            }
        }
        return originalOrder;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 2, 4, 3, 2, 1 };
        System.out.println(removeDuplicates(nums));
    }

}
