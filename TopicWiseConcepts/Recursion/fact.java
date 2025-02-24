package TopicWiseConcepts.Recursion;

public class fact {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of: " +num+ " is: "+factorial(num));
    }
    static int factorial(int n){
        
        if(n==0){
            return 1;
        }
        else{
            return (n*factorial(n-1));
        }
    }
}
