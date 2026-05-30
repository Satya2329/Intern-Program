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
