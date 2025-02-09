import java.util.Scanner;

public class fact {

    /*public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }*/
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int num = sc.nextInt();
    System.out.println("Factorial of " + num + " is: " + factorial(num) );
    sc.close();

    }
}