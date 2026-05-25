package Function_Intern;
import java.util.Scanner;
public class SwapTwoNumberWithThird {
       public void swap(int a, int b){
        System.out.println("Before Swapping");
        System.out.println("a" + a);
        System.out.println("b" +b);
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping");
        System.out.println("a" + a);
        System.out.println("b" + b);

       }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();

       SwapTwoNumberWithThird obj = new SwapTwoNumberWithThird();
          obj.swap(a,b);
          sc.close();
    }
} 


