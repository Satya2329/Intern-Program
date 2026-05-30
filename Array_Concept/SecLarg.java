package Array_Concept;
public class SecLarg {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 8, 7, 9, 41, 42};

        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest " + secondLargest);
    }
}