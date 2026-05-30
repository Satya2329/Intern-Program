<<<<<<< HEAD
package Function_Intern;

import java.util.Scanner;

public class Spy {

    // Function to check Spy number
    static boolean isSpy(int num) {

        int sum = 0;
        int product = 1;

        while (num > 0) {

            int digit = num % 10;

            sum = sum + digit;       
            product = product * digit; 

            num = num / 10;
        }

        return sum == product;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isSpy(num)) {
            System.out.println(num + " is a Spy number");
        } else {
            System.out.println(num + " is not a Spy number");
        }

        sc.close();
    }
}
=======
package Function_Intern;

import java.util.Scanner;

public class Spy {

    // Function to check Spy number
    static boolean isSpy(int num) {

        int sum = 0;
        int product = 1;

        while (num > 0) {

            int digit = num % 10;

            sum = sum + digit;       
            product = product * digit; 

            num = num / 10;
        }

        return sum == product;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isSpy(num)) {
            System.out.println(num + " is a Spy number");
        } else {
            System.out.println(num + " is not a Spy number");
        }

        sc.close();
    }
}
>>>>>>> c77ca4d18f631d52a3fa6341c5508469a7f3924f
