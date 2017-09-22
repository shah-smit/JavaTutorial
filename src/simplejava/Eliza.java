package simplejava; // A

import java.util.Scanner; // B

public class Eliza {

	public static void main(String[] args) { // C

		Scanner scanner = new Scanner(System.in); // D
		
		String[] lines = { "Why do you feel that way?", // E
				"Have you felt this way for long?",
				"Have you always felt like this?",
				"Do you think that other people feel like this too?",
				"This is a common problem",
				"Please continue"
				 };
		
		System.out.println("Hello!"); // F
		
		int i = 0; // G
		while(i < 10){ // H
			
			scanner.nextLine(); // I
			int randomInt = (int)(Math.random() * lines.length); // J
			System.out.println(lines[randomInt]); // K
			
			i = i + 1; // L
		}
		System.out.println("That will be £100. Goodbye"); // M
	}
}
