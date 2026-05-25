package Function_Intern;

public class SwapTwoNumber {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println();

        System.out.println("After Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
