package Array_Concept;

import java.util.Scanner;

public class BinarySearch {
    public static int performBinarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (target < arr[mid]) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] sortedNumbers = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        
        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();

        int resultIndex = performBinarySearch(sortedNumbers, target);

        if (resultIndex != -1) {
            System.out.println("Element found at index: " + resultIndex);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}
