import java.util.ArrayList;

/* Return all even numbers from an array. */

public class EvenNumber {
    public static ArrayList<Integer> evenNumber(int[] arr) {
        ArrayList<Integer> evenNum = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0) {
                evenNum.add(num);
            }
        }
        return evenNum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(evenNumber(arr));
        // [2,4,6,8,10]
    }
}
