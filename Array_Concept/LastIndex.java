package Array_Concept;
import java.util.Arrays;
import java.util.Scanner;
public class LastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENetr the size of the array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array element");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
        System.out.println("Your array is " + Arrays.toString(arr));
        int LastIndex = arr.length-1;
        System.out.println(LastIndex);
        if(n> 0){
         System.out.println(arr[LastIndex]);
        }else{
            System.out.println("The array is empty ");
        }
        sc.close();
    }    
    

}
