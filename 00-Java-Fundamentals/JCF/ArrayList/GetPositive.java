import java.util.ArrayList;

/* Function that return only positive number from an array of integer */

public class GetPositive {
    public static ArrayList<Integer> getPositive(int[] arr) {
        ArrayList<Integer> positiveValue = new ArrayList<>();
        for (int num : arr) {
            if (num > 0) {
                positiveValue.add(num);
            }
        }
        return positiveValue;

    }

    public static void main(String[] args) {
        int[] arr = { -2, 5, 0, 8, -1, 3 };

        System.out.println(getPositive(arr));
        // [5, 8, 3]
    }
}
