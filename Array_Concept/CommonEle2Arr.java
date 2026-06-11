package Array_Concept;
import java.util.HashSet;

public class CommonEle2Arr {
    public static void main(String[] args) {
        
        int[] array1 = {1, 2, 5, 5, 8, 9, 3};
        int[] array2 = {1, 0, 11, 5, 3, 5, 10};

        System.out.println("Array 1: " + java.util.Arrays.toString(array1));
        System.out.println("Array 2: " + java.util.Arrays.toString(array2));
        
        printCommonElements(array1, array2);
    }

    public static void printCommonElements(int[] arr1, int[] arr2) {
        // Create a HashSet to store elements of the first array
        HashSet<Integer> set = new HashSet<>();
        
   
        for (int num : arr1) {
            set.add(num);
        }

        
        HashSet<Integer> printed = new HashSet<>();

        for (int num : arr2) {
            if (set.contains(num) && !printed.contains(num)) {
                System.out.print(num + " ");
                printed.add(num); 
            }
        }
    }
}