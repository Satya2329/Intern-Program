package Array_Concept;
public class PrimeNumArr {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 7, 10, 13, 15, 19, 21, 23, 29};

        System.out.println("Prime numbers present in the array:");
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        
        return true;
    }
}