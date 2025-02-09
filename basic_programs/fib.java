import java.util.*;
public class fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of digits to be printed: ");
        int n = sc.nextInt();

        int first_digit=0;
        int second_digit=1;
        int next_digit=0;
        
        for(int i=1;i<=n;i++){
        System.out.print(first_digit+ " ");
         next_digit=first_digit+second_digit;
         first_digit= second_digit;
         second_digit=next_digit;    
        
        }
        System.out.println();
        System.out.println("Sum "+next_digit);
        sc.close();
    }
}
