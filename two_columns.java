/* Write a program to print numbers 1 to 9 and
9 to 1 in two columns. */

public class two_columns {
    public static void main(String args[]) {
        for (int a=9, b=1; b<=9; a--, b++) {
            System.out.println(a + " " + b);
        }
    }
}
