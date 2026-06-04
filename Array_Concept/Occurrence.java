package Array_Concept;

import java.util.HashMap; //This imports the HashMap class from Java's built-in utility package.
import java.util.Map;

public class Occurrence {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 2, 8, 3, 2, 5, 9};

        checkOccurrence(numbers);
    }

    public static void checkOccurrence(int[] arr) {
        HashMap<Integer, Integer> elementCountMap = new HashMap<>();

        for (int element : arr) {
            if (elementCountMap.containsKey(element)) {
                elementCountMap.put(element, elementCountMap.get(element) + 1);
            } else {
                elementCountMap.put(element, 1);
            }
        }
        
        System.out.println("Element occurrences in the array:");
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " time(s)");
        }
    }
}
