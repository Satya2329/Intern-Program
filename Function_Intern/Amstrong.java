package Function_Intern;

import java.util.Scanner;

public class Amstrong {

    // Function to count digits
    static int countDigits(int num) {

        int count = 0;

        if (num == 0) return 1;

        while (num > 0) {
            num = num / 10;
            count++;
        }

        return count;
    }

    static boolean isArmstrong(int num) {

        int original = num;
        int digits = countDigits(num);
        int sum = 0;

        while (num > 0) {

            int digit = num % 10;
            int power = 1;
            for (int i = 1; i <= digits; i++) {
                power = power * digit;
            }

            sum = sum + power;
            num = num / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }

        sc.close();
    }
}
