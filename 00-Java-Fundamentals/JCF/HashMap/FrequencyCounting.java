import java.util.HashMap;

/* Given an integer array, count how many times each number appears. */
public class FrequencyCounting {
    public static HashMap<Integer, Integer> frequencyCounting(int[] arr) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        return freq;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 1, 2 };
        System.out.println(frequencyCounting(arr));
    }

}
