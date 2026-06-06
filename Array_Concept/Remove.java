package Array_Concept;

import java.util.Arrays;

public class Remove {
    public static void main(String args[]){
        int arr[] = {1,2,3,45,1,2,3,78};
        Arrays.sort(arr);
        int j=0;    

        for(int i=0; i<arr.length-1;i++){
            if(arr[i]  != arr[i+1]){
                arr[j] =arr[i];
                j++;
            }
        }
        arr[j]=arr[arr.length-1];
        j++;
        
        for(int i=0;i<j;i++){
            System.out.println(arr[i]);
        }
    }
}
