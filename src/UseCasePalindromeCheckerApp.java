import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class UseCasePalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker App");
        System.out.println("Version: 6.0");
        System.out.println("System Initialized Successfully");

        String input = "civic";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}