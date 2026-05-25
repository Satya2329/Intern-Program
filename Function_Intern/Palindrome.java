package Function_Intern;

import java.util.Scanner;

public class Palindrome {
    static int reverseNumber(int num) {
        int reverse = 0;
        while (num > 0) {

            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        return reverse;
    }
    static boolean isPalindrome(int num) {
        int reversed = reverseNumber(num);
        return num == reversed;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a Palindrome number");
        } else {
            System.out.println(num + " is not a Palindrome number");
        }
        sc.close();
    }
}
