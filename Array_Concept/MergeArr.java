package Array_Concept;
import java.util.Arrays;
public class MergeArr {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9,10};
        int totalLengthArr = arr1.length + arr2.length;
        int[] resultArr = new int[totalLengthArr];
        for(int i=0; i<arr1.length;i++){
          resultArr[i] = arr1[i];
        }
        for(int i =0; i<arr2.length; i++){
            resultArr[arr1.length + i] = arr2[i];
        }
        System.out.println("The final merged array is " + Arrays.toString(resultArr));
    }
}
