import java.util.Stack;

/*
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 */

public class UseCasePalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker App");
        System.out.println("Version: 12.0");
        System.out.println("System Initialized Successfully");

        String input = "level";

        // Choose Strategy dynamically
        PalindromeStrategy strategy = new StackStrategy();

        PalindromeContext context = new PalindromeContext(strategy);

        boolean result = context.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

/* ===============================
   Strategy Interface
=================================*/
interface PalindromeStrategy {
    boolean check(String input);
}

/* ===============================
   Stack Strategy Implementation
=================================*/
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

/* ===============================
   Context Class
=================================*/
class PalindromeContext {

    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String input) {
        return strategy.check(input);
    }
}