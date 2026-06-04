package Array_Concept;

import java.util.HashMap;
import java.util.Map;

public class MinOccurrence {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 2, 8, 3, 2, 5, 9, 3, 3};

        
        printMinOccurrence(numbers);
    }

    public static void printMinOccurrence(int[] arr) {
        HashMap<Integer, Integer> elementCountMap = new HashMap<>();

        for (int element : arr) {
            if (elementCountMap.containsKey(element)) {
                elementCountMap.put(element, elementCountMap.get(element) + 1);
            } else {
                elementCountMap.put(element, 1);
            }
        }

        
        int minElement = arr[0]; 
        int minCount = Integer.MAX_VALUE;        

        // Step 4: Loop through the Map to find the highest count
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            if (entry.getValue() < minCount) {
                minCount = entry.getValue();
                minElement = entry.getKey();
            }
        }

        // Step 5: Print the final result
        System.out.println("The element with the minimum occurrence is: " + minElement);
        System.out.println("It appears " + minCount + " times.");
    }
}
