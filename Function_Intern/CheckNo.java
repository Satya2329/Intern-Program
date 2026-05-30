<<<<<<< HEAD
package Function_Intern;

import java.util.Scanner;

public class CheckNo {
    public int checkNumber(int num){
        if(num > 0){
            System.out.println("Number is Positive");
        } else if(num < 0){
            System.out.println("Number is Negative");
        }else {
            System.out.println("Number is 0");
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enetr a num");
        int num= sc.nextInt();
       
        CheckNo obj= new CheckNo();
        obj.checkNumber(num);
        sc.close();
    }
}
=======
package Function_Intern;

import java.util.Scanner;

public class CheckNo {
    public int checkNumber(int num){
        if(num > 0){
            System.out.println("Number is Positive");
        } else if(num < 0){
            System.out.println("Number is Negative");
        }else {
            System.out.println("Number is 0");
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enetr a num");
        int num= sc.nextInt();
       
        CheckNo obj= new CheckNo();
        obj.checkNumber(num);
        sc.close();
    }
}
>>>>>>> c77ca4d18f631d52a3fa6341c5508469a7f3924f
