public class UseCasePalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker App");
        System.out.println("Version: 9.0");
        System.out.println("System Initialized Successfully");

        String input = "madam";

        boolean isPalindrome = checkPalindrome(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    public static boolean checkPalindrome(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return checkPalindrome(str, start + 1, end - 1);
    }
}