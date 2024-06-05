package string;
import java.util.*;
public class DisplayInitials {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a name containing three words
	        System.out.println("Enter a name containing three words: ");
	        String input = scanner.nextLine();

	        // Call the method to get the initials and get the result
	        String initials = getInitials(input);

	        // Display the initials
	        System.out.println("Initials: " + initials);

	        // Close the scanner
	        scanner.close();
	    }

	    // Method to get initials from a name
	    public static String getInitials(String name) {
	        // Split the name into words
	        String[] words = name.split(" ");

	        // Create a StringBuilder to store the initials
	        StringBuilder initials = new StringBuilder();

	        // Loop through each word and append the first character to the initials
	        for (String word : words) {
	            if (!word.isEmpty()) {
	                initials.append(word.charAt(0)).append(' ');
	            }
	        }

	        // Convert the StringBuilder to a string, trim any trailing spaces, and return
	        return initials.toString().trim();
	    }

}
