package TopicWiseConcepts.Arrays;

import java.util.Scanner;

public class ArrayConcept {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of the Array:");
       int size = sc.nextInt();
       int numbers[] = new int[size];
        //Taking inputs from the user
       for(int i=0; i<size; i++) {
           numbers[i] = sc.nextInt();
       }
       //print the numbers in array
       System.out.print("Array elements are: ");
       for(int i=0; i<numbers.length; i++) {
           System.out.print(numbers[i]+" ");
       }
       sc.close();
   }

}
