package Array_Concept;

import java.util.Arrays;

public class RemoveElem {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int index=2;

        int[] newArr = new int[arr.length-1];

        for(int i=0; i< arr.length;i++){
            if(i<index){
            newArr[i] = arr[i];    
            } else if (i== index){
                continue;
            }else {
                newArr[i-1] = arr[i];
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
