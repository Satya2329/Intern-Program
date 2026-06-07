package Array_Concept;

import java.util.Arrays;

public class SumEven {
    public static void main(String[] args) {
        int[] numbers = {142, 537, 864, 901, 23};
        
        System.out.println("Original Array: " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            int originalNumber = numbers[i];
            int sumOfEvens = getEvenDigitSum(originalNumber);
            
            System.out.println("The sum of even digits in " + originalNumber + " is: " + sumOfEvens);
        }
    }

    public static int getEvenDigitSum(int num) {
        int sum = 0;
        num = Math.abs(num);
        while (num > 0) {
            int digit = num % 10; 
            
            if (digit % 2 == 0) { 
                sum += digit;     
            }
            
            num = num / 10;      
        }
        
        return sum;
    }
}