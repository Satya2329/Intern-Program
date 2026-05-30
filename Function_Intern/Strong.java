<<<<<<< HEAD
package Function_Intern;

import java.util.Scanner;

public class Strong {
    static int factorial(int num) {
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
    
    static boolean isStrong(int num) {

        int original = num;
        int sum = 0;

        while (num > 0) {

            int digit = num % 10;

            sum = sum + factorial(digit);

            num = num / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isStrong(num)) {
            System.out.println(num + " is a Strong number");
        } else {
            System.out.println(num + " is not a Strong number");
        }

        sc.close();
    }
}
=======
package Function_Intern;

import java.util.Scanner;

public class Strong {
    static int factorial(int num) {
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
    
    static boolean isStrong(int num) {

        int original = num;
        int sum = 0;

        while (num > 0) {

            int digit = num % 10;

            sum = sum + factorial(digit);

            num = num / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isStrong(num)) {
            System.out.println(num + " is a Strong number");
        } else {
            System.out.println(num + " is not a Strong number");
        }

        sc.close();
    }
}
>>>>>>> c77ca4d18f631d52a3fa6341c5508469a7f3924f
