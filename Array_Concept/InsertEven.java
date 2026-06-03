package Array_Concept;

import java.util.Scanner;
import java.util.Arrays; // Imported to print the final array nicely

public class InsertEven {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < arr.length; ) {
            System.out.print("Enter an even number for position " + i + ": ");
            int a = sc.nextInt();
            
            if (a % 2 == 0) {
                arr[i] = a; // Save the even number into the array
                System.out.println("Added" + arr[i]);
                i++;        
            } else {
                // If the number is odd, 'i' does not increment, so the loop retries the same position
                System.out.println("Invalid input " + a );
            }
        }
        
        System.out.println("Final Array  " + Arrays.toString(arr));
        sc.close();
    }    
}