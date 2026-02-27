import java.util.Deque;
import java.util.ArrayDeque;

public class UseCasePalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker App");
        System.out.println("Version: 7.0");
        System.out.println("System Initialized Successfully");

        String input = "refer";

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}