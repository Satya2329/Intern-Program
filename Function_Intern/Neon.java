package Function_Intern;

import java.util.Scanner;

public class Neon {
    static boolean isNeon(int num) {

        int square = num * num;
        int sum = 0;

        while (square > 0) {

            int digit = square % 10;  
            sum = sum + digit;       
            square = square / 10;     
        }

        return sum == num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isNeon(num)) {
            System.out.println(num + " is a Neon number");
        } else {
            System.out.println(num + " is not a Neon number");
        }

        sc.close();
    }
}
