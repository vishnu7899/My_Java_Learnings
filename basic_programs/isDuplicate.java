import java.util.Arrays;

public class isDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 4, 5};

        System.out.println("Given array: "+ Arrays.toString(arr));

        // Remove duplicates and convert back to an array
        int[] distinctArr = Arrays.stream(arr).distinct().toArray();

        // Print the array with distinct elements
        System.out.println("Array with distinct elements: " + Arrays.toString(distinctArr));
        boolean hasDuplicates = hasDuplicates(arr);
        System.out.println("Array has duplicates: " + hasDuplicates);
    }
    public static boolean hasDuplicates(int[] arr) {
        int[] distinctArr = Arrays.stream(arr).distinct().toArray();
        int n = arr.length;
        if(n<distinctArr.length){
            return false;
        }
        return true;
    }
}