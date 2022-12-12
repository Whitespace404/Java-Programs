/* Write a program to find the sum of 
first 50 even numbers */

public class even_sum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 50; i+=2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
