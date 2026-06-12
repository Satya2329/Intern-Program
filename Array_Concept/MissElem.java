package Array_Concept;

public class MissElem {
    
    public static int findMissingNumber(int[] nums, int n) {
        
        int expectedSum = n * (n + 1) / 2;
        
        
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        
        
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
       
        int[] arr = {1, 2, 4, 5}; 
        int n = 5; 

        int missingNumber = findMissingNumber(arr, n);
        
        System.out.println("The missing number is: " + missingNumber);
    }
}
