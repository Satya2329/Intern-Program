package Array_Concept;

import java.util.HashMap;//This imports the HashMap class from Java's built-in utility package.
import java.util.Map;

public class MaxOccurrence {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 2, 8, 3, 2, 5, 9, 3, 3};

       PMaxOccurrence(numbers);
    }

    public static void PMaxOccurrence(int[] arr) {
        HashMap<Integer, Integer> elementCountMap = new HashMap<>();

        for (int element : arr) {
            if (elementCountMap.containsKey(element)) {
                elementCountMap.put(element, elementCountMap.get(element) + 1);
            } else {
                elementCountMap.put(element, 1);
            }
        }

        
        int maxElement = arr[0]; 
        int maxCount = 0;       

       
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxElement = entry.getKey();
            }
        }

        
        System.out.println("The element with the maximum occurrence is: " + maxElement);
        System.out.println("It appears " + maxCount + " times.");
    }
}
