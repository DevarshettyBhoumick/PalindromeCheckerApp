public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Declare and initialize the input string.
        String input = "noon";

        // Create a Stack using the fully qualified name to avoid imports.
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push each character of the string into the stack.
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially.
        boolean isPalindrome = true;

        // Iterate again through original string.
        for (char c : input.toCharArray()) {
            // Pop and compare with the current character
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display the result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
