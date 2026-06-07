package Array_Concept;

import java.util.Arrays;

public class TwoArrAdd {
    public static void main(String[] args) {
        int[] arr1= {1,2,4,5,6,7};
        int[] arr2= {5,6,8,9,7,5};

        if(arr1.length != arr2.length){
            System.out.println("Array out of length");
            return;
        }

        int[] resultArr = new int[arr2.length];
        for(int i=0; i<arr2.length; i++){
            resultArr[i] = arr1[i] + arr2[i];
        }
        System.out.println("Sum of the array element" + Arrays.toString(resultArr));
    }
}
