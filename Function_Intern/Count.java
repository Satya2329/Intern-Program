<<<<<<< HEAD
package Function_Intern;

import java.util.Scanner;

public class Count {

    // Function to count digits
    static int countDigits(int num) {

        int count = 0;
        if (num == 0) {
            return 1;
        }

        while (num > 0) {

            num = num / 10;  
            count++; 
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = countDigits(num);

        System.out.println("Number of digits = " + result);

        sc.close();
    }
}
=======
package Function_Intern;

import java.util.Scanner;

public class Count {

    // Function to count digits
    static int countDigits(int num) {

        int count = 0;
        if (num == 0) {
            return 1;
        }

        while (num > 0) {

            num = num / 10;  
            count++; 
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = countDigits(num);

        System.out.println("Number of digits = " + result);

        sc.close();
    }
}
>>>>>>> c77ca4d18f631d52a3fa6341c5508469a7f3924f
