public class swapping {
    public static void main(String[] args) {

        int a=10,b=20;
        System.out.println("Before swapping a="+a+" b="+b);
      /*a=a+b;
        b=a-b;  //1st method
        a=a-b;*/


      /*int temp=a;
        a=b;    //2nd method
        b=temp;*/

      /*a=a^b;
        b=a^b;
        a=a^b; */ //3rd method

       /*  a=a*b;
        b=a/b;
        a=a/b;*/ //4th method
       
        b=a+b-(a=b); //5th method
        
        System.out.println("After swapping a="+a+" b="+b);
}
}
