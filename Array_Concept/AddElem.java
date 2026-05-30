package Array_Concept;

public class AddElem{
    public static void main(String[] args) {
        int arr[] = {1,2,4,9,8,6};
        int sum  =0;
        for(int i=0; i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}