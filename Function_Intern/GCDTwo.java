<<<<<<< HEAD
package Function_Intern;

import java.util.Scanner;
public class GCDTwo{
    static int findGCD(int a, int b) {
        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = findGCD(a, b);

        System.out.println("GCD of " + a + " and " + b + " is " + result);

        sc.close();
    }
}
=======
package Function_Intern;

import java.util.Scanner;

public class GCDTwo{

    // Function to find GCD
    static int findGCD(int a, int b) {

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = findGCD(a, b);

        System.out.println("GCD of " + a + " and " + b + " is " + result);

        sc.close();
    }
}
>>>>>>> c77ca4d18f631d52a3fa6341c5508469a7f3924f
