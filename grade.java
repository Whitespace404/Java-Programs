package Program5;
import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println("Enter your roll number");
        int rollno = input.nextInt();
        System.out.println("Enter your marks");
        int marks = input.nextInt();

        String grade = "";

        if (marks > 90) {
            grade = "A";
        }
        else if (marks > 70 && marks < 89) {
            grade = "B";
        }
        else if (marks > 50 && marks < 69) {
            grade = "C";
        }
        else if (marks < 50) {
            grade = "D";
        }

        System.out.println("Your name is " + name);
        System.out.println("Your roll number is " + rollno);
        System.out.println("Your grade is " + grade);
        
    }
}
