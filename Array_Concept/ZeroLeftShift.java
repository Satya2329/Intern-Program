package Array_Concept;
import java.util.Arrays;

public class ZeroLeftShift {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 0, 12, 0, 5, 6};
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        shiftZerosLeft(arr);
        
        System.out.println("After Shifting Zeros Left: " + Arrays.toString(arr));
    }

    public static void shiftZerosLeft(int[] arr) {
        int nonZeroPos = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[nonZeroPos] = arr[i];
                nonZeroPos--; 
            }
        }
        while (nonZeroPos >= 0) {
            arr[nonZeroPos] = 0;
            nonZeroPos--;
        }
    }
}