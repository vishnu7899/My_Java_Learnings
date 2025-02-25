public class palindromeChecker {
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(isPalindrome(s)); // Output: true
    }
    static boolean isPalindrome(String s) {

        //Two pointer Technique
        s.toLowerCase();
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
}