package Array_Concept;

public class SecondSmall {
    public static void main(String[] args) {
        int arr[] = {1,2,33,4,5,6,7,8,9};
        int SmallEle=arr[0];
        int SecondSmall=Integer.MAX_VALUE;;
        for(int i=0; i<arr.length;i++){
            if(arr[i] < SmallEle){
                SmallEle=arr[i];
            }
        }
        for(int i=0; i<arr.length;i++){
            if(arr[i]<SecondSmall && arr[i]!=SmallEle){
                SecondSmall=arr[i];
            }
        }
        System.out.println("The second small element is " + SecondSmall);
    }
}
