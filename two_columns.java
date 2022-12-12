/* Write a program to print numbers 1 to 10 and
10 to 1 in two columns. */

public class two_columns {
    public static void main(String args[]) {
        for (int a=10, b=1; b<=10; a--, b++) {
            System.out.println(a + " " + b);
        }
    }
}
