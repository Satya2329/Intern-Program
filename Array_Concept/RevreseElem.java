package Array_Concept;

public class RevreseElem{
    public static void main(String[] args) {
        int arr[] = {123, 45, 908, 7, 560};
        
        System.out.println("Original Array: ");
        printArray(arr);

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int reverse = 0;
            
            while (num > 0) {
                int lastDigit = num % 10;
                reverse = (reverse * 10) + lastDigit;
                num = num / 10;
            }
            
            arr[i] = reverse;
        }

        System.out.println("\nArray after reversing each element: ");
        printArray(arr);
    }

    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}