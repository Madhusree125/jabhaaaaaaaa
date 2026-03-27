import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.util.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Split the string into an array of words based on spaces
        String[] words = input.split(" ");

        System.out.print("Reversed string: ");

        // Loop through the array from the last index down to 0
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            
            // Add a space between words, but not after the last word
            if (i > 0) {
                System.out.print(" ");
            }
        }
        
        System.out.println(); // New line for clean output
        scanner.close();
    }
}
