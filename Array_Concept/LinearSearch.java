package Array_Concept;

import java.util.Scanner;

public class LinearSearch {

    public static int performLinearSearch(int[] arr, int target) {
        
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] == target) {
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] numbers = {12, 45, 67, 89, 23, 91, 34};
        
        System.out.print("Enter the number you want to search for: ");
        int target = scanner.nextInt();

        
        int resultIndex = performLinearSearch(numbers, target);

        
        if (resultIndex != -1) {
            System.out.println("Element found at index: " + resultIndex);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}