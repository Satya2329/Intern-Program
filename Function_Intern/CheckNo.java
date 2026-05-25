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
