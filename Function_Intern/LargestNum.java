package Function_Intern;
import java.util.Scanner;
public class LargestNum {
    public void CheckNo(int a,int b,int c){
        if(a>b && a>c){
            System.out.println("a is greater");
        }else if(b>a && b>c){
            System.out.println("b is greater");
        }else if(c>b && c>a){
            System.out.println("c is greater");
        }else{
            System.out.println("Invalid Number");
        }
        return ;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("Enter the value of c");
        int c = sc.nextInt();
        LargestNum obj = new LargestNum();
        obj.CheckNo( a , b, c);
        sc.close();
    }
    
}
