package Array_Concept;
import java.util.HashSet;
import java.util.Arrays;

public class Distinct {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 2, 1};
        int[] array2 = {4, 5, 6, 7, 8, 6};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        
        printDistinctElements(array1, array2);
    }

    public static void printDistinctElements(int[] arr1, int[] arr2) {
       
        HashSet<Integer> distinctSet = new HashSet<>();

        for (int num : arr1) {
            distinctSet.add(num);
        }

        for (int num : arr2) {
            distinctSet.add(num);
        }

       
        System.out.println("Distinct elements present in both arrays:");
        for (int num : distinctSet) {
            System.out.print(num + " ");
        }
        System.out.println(); // For a clean newline
    }
}