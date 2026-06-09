package Array_Concept;

import java.util.Arrays;

public class AddIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int elem=5;
        int index=3;

        int[] newArr = new int[arr.length+1];

        for(int i=0; i<newArr.length; i++){
            if(i<index){
                newArr[i]=arr[i];
            }else if(i==index){
                newArr[i] = elem;
            }else {
                newArr[i] = arr[i-1];
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
