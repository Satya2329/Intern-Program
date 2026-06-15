package Array_Concept;

import java.util.Arrays;

public class DecendingSort {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 7, 1, 3};
        int temp = 0;
        
        System.out.println("Original array: " + Arrays.toString(numbers));
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        
        System.out.println("Sorted array (Descending): " + Arrays.toString(numbers));
    }
}