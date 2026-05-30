<<<<<<< HEAD
package Function_Intern;

import java.util.Scanner;

public class Factorial {

    static int factorial(int num) {

        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = factorial(num);

        System.out.println("Factorial of " + num + " is " + result);

        sc.close();
    }
=======
package Function_Intern;

import java.util.Scanner;

public class Factorial {

    static int factorial(int num) {

        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = factorial(num);

        System.out.println("Factorial of " + num + " is " + result);

        sc.close();
    }
>>>>>>> c77ca4d18f631d52a3fa6341c5508469a7f3924f
}