package string;
import java.util.*;
public class RearrangeName {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a name containing three words
        System.out.println("Enter a name containing three words: ");
        String input = scanner.nextLine();

        // Call the method to rearrange the name and get the result
        String rearrangedName = rearrangeName(input);

        // Display the rearranged name
        System.out.println("Rearranged name: " + rearrangedName);

        // Close the scanner
        scanner.close();
    }

    // Method to rearrange the name
    public static String rearrangeName(String name) {
        // Split the name into words
        String[] words = name.split(" ");

        // Check if the input has exactly three words
        if (words.length != 3) {
            return "Error: The input must contain exactly three words.";
        }

        // Rearrange the name: surname first, followed by the first and middle names
        String surnameFirst = words[2] + " " + words[0] + " " + words[1];

        // Return the rearranged name
        return surnameFirst;

	}

}
