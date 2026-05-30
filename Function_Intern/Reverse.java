<<<<<<< HEAD
package Function_Intern;
import java.util.Scanner;
public class Reverse {

    static int reverseNumber(int num) {

        int reverse = 0;

        while (num > 0) {

            int digit = num % 10;          
            reverse = reverse * 10 + digit; 
            num = num / 10;             
        }

        return reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = reverseNumber(num);

        System.out.println("Reversed number = " + result);

        sc.close();
    }
}
=======
package Function_Intern;
import java.util.Scanner;
public class Reverse {

    static int reverseNumber(int num) {

        int reverse = 0;

        while (num > 0) {

            int digit = num % 10;          
            reverse = reverse * 10 + digit; 
            num = num / 10;             
        }

        return reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = reverseNumber(num);

        System.out.println("Reversed number = " + result);

        sc.close();
    }
}
>>>>>>> c77ca4d18f631d52a3fa6341c5508469a7f3924f
