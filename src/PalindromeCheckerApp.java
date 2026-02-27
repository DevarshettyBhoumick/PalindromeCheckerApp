public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Define the input string to validate
        String input = "civic";

        // Create a Queue to store characters in FIFO order using a LinkedList
        java.util.Queue<Character> queue = new java.util.LinkedList<>();

        // Create a Stack to store characters in LIFO order
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);  // Enqueue operation
            stack.push(c); // Push operation
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare characters until the queue becomes empty
        while (!queue.isEmpty()) {
            // Compare the front of the queue (FIFO) with the top of the stack (LIFO)
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        // Display the result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
