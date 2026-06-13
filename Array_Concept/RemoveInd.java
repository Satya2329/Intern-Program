package Array_Concept;

import java.util.Arrays;

public class RemoveInd {
    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50, 60};
        int targetIndex = 3; 

        int[] resultArray = removeElementBefore(originalArray, targetIndex);

        System.out.println(Arrays.toString(resultArray));
    }

    public static int[] removeElementBefore(int[] array, int index) {
        if (array == null || array.length == 0) {
            return array;
        }

        if (index <= 0 || index >= array.length) {
            return array; 
        }

        int removeIndex = index - 1;
        int[] newArray = new int[array.length - 1];
        int newArrayIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == removeIndex) {
                continue; 
            }
            newArray[newArrayIndex] = array[i];
            newArrayIndex++;
        }

        return newArray;
    }
}