
/* Introduction to HashSet */
// Stores unique values only

import java.util.HashSet;

public class IntroToHashSet {
    public static void main(String[] args) {

        // HashSet Sntax
        HashSet<Integer> set = new HashSet<>();

        // Add elements
        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println(set); // [20, 10, 30]

        // Checks whether an element exists , return true if exist else false
        System.out.println(set.contains(30)); // true

        // Removes an element
        set.remove(10);
        System.out.println(set); // [20, 30]

        // Returns the number of unique elements
        System.out.println(set.size()); // 2

        // Checks whether the set is empty
        System.out.println(set.isEmpty()); // false

    }

}
