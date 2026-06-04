package Array_Concept;

public class LargeEle {
    public static void main(String[] args) {
        int arr1[] = {1,2,5,9,8,7,12,58,23};
        int largest=arr1[0];
        for(int i=0;i<arr1.length;i++){
          if(arr1[i] > largest){
            largest=arr1[i];
            
          }
        }
        System.out.println(largest);
    }
}
