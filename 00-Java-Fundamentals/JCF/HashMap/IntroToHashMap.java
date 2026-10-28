import java.util.HashMap; // imported HashMap class 
/*
Introduction to HashMap
*/
public class IntroToHashMap {
    public static void main(String[] args) {
        // HashMap creation syntax
        HashMap<Integer, String> map = new HashMap<>();

        // Adds a mapping or updates an existing key
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "JavaScript");
        // Print whole map
        System.out.println(map); // {1=Java, 2=Python, 3=JavaScript}

        // Updates an existing key-value pair
        map.put(2, "Rust");
        System.out.println(map); // {1=Java, 2=Rust, 3=JavaScript}

        // Return value of the key or null if doesn't exist
        System.out.println(map.get(3)); // JavaScript

        // Return value if exist or fallback if doesn't exist
        System.out.println(map.getOrDefault(4, "Nahi hai")); // here "Nahi hai" is a fallback message!

        // Return true if key exists or false if not
        System.out.println(map.containsKey(5)); // false
        System.out.println(map.containsKey(2)); // true

        // Remove the existing Key-value pair
        map.remove(3);
        System.out.println(map); // {1=Java, 2=Rust}

    }

}
