package TopicWiseConcepts.Recursion;

public class fibbo {
    public static void main(String[] args) {
       int Recursion =  fib(5);

        System.out.println(Recursion);
    }

    static int fib(int n){
        if(n<=1){
            return n;
        }
        
        return (fib(n-1) + fib(n-2));
        
    }
}
   

