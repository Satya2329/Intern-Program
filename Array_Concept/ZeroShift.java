package Array_Concept;
import java.util.Arrays;

public class ZeroShift {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 0, 12, 0, 5, 6};
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        shiftZeros(arr);
        
        System.out.println("After Shifting Zeros: " + Arrays.toString(arr));
    }

    public static void shiftZeros(int[] arr) {
        int nonZeroPos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroPos] = arr[i];
                nonZeroPos++;
            }
        }

        while (nonZeroPos < arr.length) {
            arr[nonZeroPos] = 0;
            nonZeroPos++;
        }
    }
}