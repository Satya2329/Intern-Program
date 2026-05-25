package Function_Intern;
import java.util.Scanner;

public class EvenOdd {
    public int checkNo(int num){
        if(num % 2 == 0){
            System.out.println("Even No.");
        }else{
            System.out.println("Odd No.");
        }
      return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the value os num");
        int num = sc.nextInt();
        EvenOdd a = new EvenOdd();
        a.checkNo(num);
        sc.close();
    }
    
}
