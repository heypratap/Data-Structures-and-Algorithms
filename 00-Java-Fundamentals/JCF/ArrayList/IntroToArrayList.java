import java.util.ArrayList;
/**
 * IntroToArrayList
 */
public class IntroToArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Add element to ArrayList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);
        System.out.println(list); // [10,20,30]

        // Get element from any index 
        int getElemnt = list.get(1);
        System.out.println(getElemnt); // 20

        // Update element at any position of our choice 
        list.set(3,40);
        System.out.println(list); // [10,20,30,40]

        // Return the size/length of the ArrayList
        System.out.println(list.size()); // 4 

        // Chcks if an element exist or not
        System.out.println(list.contains(50)); // false

        // Remove the element 
        System.out.println(list.remove(2)); // it will remove 30
        System.out.println(list); // [10,20,40]


        // Traverse an ArrayList using normal for loop
        for(int i =0; i< list.size() ; i++){
            System.out.println(list.get(i)); // 10 20 40
        }

        // Traverse an ArrayList using "enhanced for loop"
        for(int num : list){
            System.out.println(num); // 10 20 40
        }



    }
}