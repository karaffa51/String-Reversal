package FlipString;
import java.util.Scanner;

//This Class flips a sting like it is being viewed in a mirror.
public class FlipString {

	public static void main(String[] args) {
		//initialize a Scanner for the user input
		Scanner scan = new Scanner(System.in);
		//Ask the user to put in a message
		System.out.println("Enter a Message to flip:");
		//Scanner reads the keyboard input till the Enter key is pressed
		String message = scan.nextLine();
		//initialize a string variable for the Flip
		String output = "";
		//Loop through the message
		for ( int x = message.length()-1; x >= 0; x--){
			//Store each character at the first available sport of the output variable
			output += message.charAt(x);
		}
		//Print output on a new line
		System.out.println(output);
		scan.close();
	}

}
