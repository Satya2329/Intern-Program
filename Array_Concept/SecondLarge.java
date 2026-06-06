package Array_Concept;

public class SecondLarge {
    public static void main(String[] args) {
        int arr[] = {1,5,8,96,3,4,85};
        int largest=arr[0];
        int SecondLarge=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest=arr[i];
            }
        }
        for(int i=0; i<arr.length;i++){
            if(arr[i] > SecondLarge && arr[i]!= largest){
                SecondLarge = arr[i];
            }
        }
        System.out.println(SecondLarge);
    }
}
