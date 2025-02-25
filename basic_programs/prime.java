public class prime {
    public static void main(String[] args) {

        System.out.println(isPrime(1));
    }

    static boolean isPrime(int num){
        if(num==1||num==2){
            return true;
        }
        for(int i=2;i<num;i++){
            if(num%2==i){
                return false;
            }
        }
        return true;
    }
}
