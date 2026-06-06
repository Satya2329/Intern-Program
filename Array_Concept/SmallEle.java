package Array_Concept;

public class SmallEle {
    public static void main(String[] args) {
        int[] arr = {50,2,5,8,7,9,65,4};
        int SmallElement = arr[0];
        for(int i =0; i<arr.length; i++){
            if(arr[i]<SmallElement){
                SmallElement=arr[i];
            }
        }
        System.out.println("The smallest elemrnt is " + SmallElement);
    }
}
