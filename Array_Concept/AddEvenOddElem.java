package Array_Concept;

public class AddEvenOddElem {
    public static void main(String[] args) {
        
    int arr[]= {1,2,3,4,5,6,7,8,9};
    int sum1=0;
    int sum2=0;
    for(int i=0; i<arr.length;i++){
       if(arr[i]%2==0){
        sum1 = sum1 + arr[i];
       }else{
        sum2 = sum2 + arr[i];
       }
    }
    System.out.println("Addition of even number" + " " + sum1);
    System.out.println("Addition of odd number" + " " + sum2);
}
}