import java.util.*;

public class while_loop_arithmetic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int choice;
        
        do {
            System.out.println("******MENU*******");
            System.out.println("Addition       (1)");
            System.out.println("Subtraction    (2)");
            System.out.println("Multiplication (3)");
            System.out.println("Division       (4)");
            System.out.println("Exit           (5)");
            System.out.println("******MENU*******");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println(n1 + n2);
                    break;
                case 2:
                    System.out.println(n1 - n2);
                    break;
                case 3:
                    System.out.println(n1 * n2);
                    break;
                case 4:
                    double answer = (double) n1 / (double) n2;
                    System.out.println(answer);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Not a valid choice");
                    break;
            }
        }
        while (choice != 5);
    }
}
