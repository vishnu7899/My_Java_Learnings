import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to check whether it is prime or not:");
        int n=sc.nextInt();
        System.out.println(isPrime(n));

        sc.close();
    }

    static String isPrime(int num){
        if(num==1||num==2){
            return num+" is prime";
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return num+ " is not prime";
            }
        }
        return num+ " is prime";
    }
    
}
