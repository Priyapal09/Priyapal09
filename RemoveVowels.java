package string;
import java.util.*;
public class RemoveVowels {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a string
	        System.out.println("Enter a word or a string: ");
	        String input = scanner.nextLine();

	        // Call the method to remove vowels and get the result
	        String result = removeVowels(input);

	        // Display the result
	        System.out.println("String after removing vowels: " + result);

	        // Close the scanner
	        scanner.close();
	    }

	    // Method to remove vowels from a string
	    public static String removeVowels(String str) {
	        // Use a StringBuilder for efficient string manipulation
	        StringBuilder sb = new StringBuilder();

	        // Convert the string to uppercase to handle both uppercase and lowercase vowels
	        str = str.toUpperCase();

	        // Loop through each character in the string
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            // Check if the character is not a vowel
	            if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
	                // Append the character to the StringBuilder
	                sb.append(ch);
	            }
	        }

	        // Convert the StringBuilder back to a string and return
	        return sb.toString();
	    }

}
