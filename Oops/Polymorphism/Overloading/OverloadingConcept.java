package Oops.Polymorphism.Overloading;

class Calculator{
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public int add(int n1, int n2){
        return n1+n2;
    }
    public double add(double n1, int n2){
        return n1+n2;
    }
}
public class OverloadingConcept {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int r=c.add(5, 6);
        int s=c.add(4,8,1);
        System.out.println(s);
        System.out.println(r);
}
}
