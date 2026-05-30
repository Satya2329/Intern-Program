<<<<<<< HEAD
package Function_Intern;

import java.util.Scanner;

public class perfect {
    static boolean isPerfect(int num) {

        int sum = 0;

    
        for (int i = 1; i < num; i++) {

            if (num % i == 0) {
                sum = sum + i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPerfect(num)) {
            System.out.println(num + " is a Perfect number");
        } else {
            System.out.println(num + " is not a Perfect number");
        }

        sc.close();
    }
=======
package Function_Intern;

import java.util.Scanner;

public class perfect {
    static boolean isPerfect(int num) {

        int sum = 0;

    
        for (int i = 1; i < num; i++) {

            if (num % i == 0) {
                sum = sum + i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPerfect(num)) {
            System.out.println(num + " is a Perfect number");
        } else {
            System.out.println(num + " is not a Perfect number");
        }

        sc.close();
    }
>>>>>>> c77ca4d18f631d52a3fa6341c5508469a7f3924f
}