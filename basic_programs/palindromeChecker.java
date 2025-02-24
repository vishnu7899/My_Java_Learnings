public class palindromeChecker {
    public static boolean isPalindrome(String s) {

        //Two pointer Technique

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }

    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(isPalindrome(s)); // Output: true
        
    }
}