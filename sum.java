// Write a program to print to find the sum of the
// first ten non zero numbers.

public class sum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i+=1) {
            sum += i;
        }
        System.out.println(sum);
    }
}
