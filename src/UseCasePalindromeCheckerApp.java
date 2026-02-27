public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        long start1 = System.nanoTime();
        boolean result1 = iterativeCheck(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean result2 = recursiveCheck(input, 0, input.length() - 1);
        long end2 = System.nanoTime();

        System.out.println("Input : " + input);
        System.out.println("Iterative Result : " + result1);
        System.out.println("Iterative Time   : " + (end1 - start1) + " ns");
        System.out.println("Recursive Result : " + result2);
        System.out.println("Recursive Time   : " + (end2 - start2) + " ns");
    }

    private static boolean iterativeCheck(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private static boolean recursiveCheck(String input, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (input.charAt(start) != input.charAt(end)) {
            return false;
        }
        return recursiveCheck(input, start + 1, end - 1);
    }
}