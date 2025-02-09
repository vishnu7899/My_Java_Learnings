import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
      int num=sc.nextInt();
      int rev=0;
        System.out.println("Before Reverse :"+num);
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("Reverse of the number is "+rev);
        sc.close();

}
}
