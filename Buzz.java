package basicjava;
import java.util.Scanner;


public class Buzz {
	public static void main(String[]args) {
	Scanner in = new Scanner(System.in);
	// Input a number from the user
	System.out.print("Enter a number :");
	int number = in . nextInt();
	// Check if the number ends with 7 and is divisible by 7
	if(number % 10 == 7 || number % 7 == 0)
		// check if the number is a buzz number
		System.out.println(number + "is a Buzz Number.") ;
	else
		System.out.println(number + "is a not Buzz Number");
	
	}

}
