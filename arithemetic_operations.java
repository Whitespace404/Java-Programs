package Program1;
import java.util.Scanner;

public class arithmetic_operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("Enter a number");
        n1 = sc.nextInt();
        System.out.println("Enter another number");
        n2 =sc.nextInt();

        int result;
        result = n1 + n2;
        System.out.println("The sum is " + result);
        result = n1 - n2;
        System.out.println("The difference is " + result);
        result = n1 * n2;
        System.out.println("The product is " + result);
        result = n1 / n2;
        System.out.println("The quotient is " + result);
        result = n1 % n2;
        System.out.println("The remainder is " + result);
    }
}
