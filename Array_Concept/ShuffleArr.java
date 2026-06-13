package Array_Concept;

import java.util.Arrays;

public class ShuffleArr {
    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Original Array: " + Arrays.toString(numbers));

        
        shuffleArray(numbers);

        System.out.println("Shuffled Array: " + Arrays.toString(numbers));
    }

    public static void shuffleArray(int[] array) {
       
        for (int i = array.length - 1; i > 0; i--) {
            
           
            int j = (int) (Math.random() * (i + 1));

            
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
