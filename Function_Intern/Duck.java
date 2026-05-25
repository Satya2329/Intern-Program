package Function_Intern;

import java.util.Scanner;

public class Duck {

    // Function to check Duck number
    static boolean isDuck(int num) {

        while (num > 0) {

            int digit = num % 10;

            if (digit == 0) {
                return true;   // found zero → Duck number
            }

            num = num / 10;
        }

        return false; // no zero found
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isDuck(num)) {
            System.out.println(num + " is a Duck number");
        } else {
            System.out.println(num + " is not a Duck number");
        }

        sc.close();
    }
}
