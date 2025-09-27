/**
 * Hands-On Practice: Jump Statements (Break and Continue)
 *
 * LEARNING OBJECTIVES:
 * 1. Understand break statement usage and behavior
 * 2. Learn continue statement for skipping iterations
 * 3. Practice controlling loop flow with jump statements
 *
 * INSTRUCTIONS:
 * 1. Complete all TODO exercises below
 * 2. Run the program to test your solutions
 * 3. Observe how break and continue affect loop execution
 */

public class JumpStatementsPractice {
    public static void main(String[] args) {
        System.out.println("=== JUMP STATEMENTS EXERCISES ===\n");

        // TODO 1: Break on Condition
        // Write a for loop from 1 to 20, but break when number equals 8
        System.out.println("TODO 1: Break when number equals 8");
        // Your code here:
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
            if (i == 8) {
                break;
            }
        }

        System.out.println();

        // TODO 2: Continue on Even Numbers
        // Write a for loop from 1 to 10, but continue (skip) even numbers
        System.out.println("TODO 2: Skip even numbers (print only odd)");
        // Your code here:
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println();

        // TODO 3: Find First Negative
        // Write a loop to find first negative number and break
        System.out.println("TODO 3: Find first negative number");
        int[] numbers = {5, 8, 12, -3, 7, -1, 9};
        // Your code here:
        for (int i = 0; i <= numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.println(numbers[i]);
                break;
            }
        }

        System.out.println();

        // TODO 4: Skip Multiples of 3
        // Write a for loop from 1 to 15, skip numbers divisible by 3
        System.out.println("TODO 4: Skip multiples of 3");
        // Your code here:
        for (int i = 1; i <= 15; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println();

        // TODO 5: Break on Target Sum
        // Write a loop to add numbers until sum reaches or exceeds 50
        System.out.println("TODO 5: Add until sum >= 50");
        int[] values = {10, 15, 8, 12, 20, 7, 5};
        int sum = 0;
        // Your code here:
        for (int i = 0; i <= values.length; i++) {
            sum += values[i];
            if (sum >= 50) {
                break;
            }
        }

        System.out.println("Final sum: " + sum);
        System.out.println();

        // TODO 6: Continue on Vowels
        // Write a loop to print only consonants from "programming"
        System.out.println("TODO 6: Print only consonants from 'programming'");
        String word = "programming";
        // Your code here:
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                continue;
            }
            System.out.print(c);
        }

        System.out.println();
        System.out.println();

        // TODO 7: Nested Loop with Break
        // Write nested loops to find first pair (i,j) where i*j > 15
        System.out.println("TODO 7: Find first pair where i*j > 15");
        boolean found = false;
        // Your code here:
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i * j > 15) {
                    System.out.println("i = " + i + ", j = " + j + " -> " + (i * j));
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        System.out.println();

        // TODO 8: Continue on Short Strings
        // Write a loop to print only strings with length >= 5
        System.out.println("TODO 8: Print only long strings (length >= 5)");
        String[] words = {"Hi", "Hello", "Java", "Programming", "Code", "Loop"};
        // Your code here:
        for  (int i = 0; i < words.length; i++) {
            if (words.length < 5) {
                continue;
            }

            System.out.println(word);

            if (words.length >= 5) {
                break;
            }
        }

        System.out.println();

        // TODO 9: Break on Search Target
        // Write a loop to search for "target" and break when found
        System.out.println("TODO 9: Search for 'Java' and break");
        String[] languages = {"Python", "C++", "Java", "JavaScript", "Go"};
        int index = -1;
        // Your code here:
        for (int i = 0; i < languages.length; i++) {
            if (languages[i].equals("Java")) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Found 'Java' at index: " + index);
        }
        System.out.println();

        // TODO 10: Skip Zero Values
        // Write a loop to calculate average, skipping zero values
        System.out.println("TODO 10: Calculate average (skip zeros)");
        int[] scores = {85, 0, 92, 78, 0, 96, 87};
        int total = 0;
        int count = 0;
        // Your code here:
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] == 0) {
                continue;
            }
            total += scores[i];
            count++;
        }

        double average = (count > 0) ? (double) total / count : 0;
        System.out.println("Average (excluding zeros): " + average);
        System.out.println();

        // TODO 11: Labeled Break
        // Write nested loops with labeled break to exit outer loop
        System.out.println("TODO 11: Labeled break example");
        // Your code here:
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
                if (i * j > 4) {
                    break outerLoop;
                }
            }
        }

        System.out.println();

        // TODO 12: Continue with Condition
        // Write a loop to print numbers 1-20, but skip numbers divisible by both 2 and 3
        System.out.println("TODO 12: Skip numbers divisible by both 2 and 3");
        // Your code here:
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println();

        // TODO 13: Early Termination
        // Write a while loop that breaks when user input would be "quit"
        // Simulate with array: {"start", "continue", "process", "quit", "end"}
        System.out.println("TODO 13: Process until 'quit' command");
        String[] commands = {"start", "continue", "process", "quit", "end"};
        // Your code here:
        int iteration = 0;
        while (iteration < commands.length) {
            if (commands[iteration].equals("quit")) {
                System.out.println("Quitting...");
                break;
            }

            System.out.println(commands[iteration]);
            iteration++;
        }

        System.out.println();

        // TODO 14: Complex Skip Logic
        // Write a loop from 1 to 30:
        // - Skip numbers divisible by 5
        // - Break if number > 25
        // - Print remaining numbers
        System.out.println("TODO 14: Complex skip and break logic");
        // Your code here:
        for (int i = 1; i <= 30; i++) {
            if (i > 25) {
                break;
            }
            if (i % 5 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}

/**
 * SYNTAX REMINDER:
 * ===============
 * break;      // Exit the current loop immediately
 * continue;   // Skip rest of current iteration, go to next
 *
 * LABELED STATEMENTS:
 * outerLoop: for (...) {
 *     innerLoop: for (...) {
 *         break outerLoop;    // breaks out of outer loop
 *         continue outerLoop; // continues outer loop
 *     }
 * }
 *
 * BREAK STATEMENT:
 * - Immediately exits the current loop
 * - Control goes to first statement after loop
 * - Works with for, while, do-while, and switch
 * - In nested loops, breaks only the innermost loop
 *
 * CONTINUE STATEMENT:
 * - Skips remaining code in current iteration
 * - Goes directly to next iteration
 * - In for loops, increment still executes
 * - In while/do-while, goes back to condition check
 *
 * COMMON USE CASES:
 * Break:
 * - Early termination when target found
 * - Exit on error conditions
 * - Limit processing time/iterations
 *
 * Continue:
 * - Skip invalid/unwanted data
 * - Filter processing
 * - Skip iterations based on conditions
 *
 * BEST PRACTICES:
 * - Use sparingly for cleaner code
 * - Consider refactoring complex break/continue logic
 * - Document why early exit is necessary
 * - Be careful with nested loops and labeled breaks
 */
