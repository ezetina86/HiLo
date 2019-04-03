import java.util.Scanner;
/**
 * 
 * @author Henry
 * @location Mexico City
 *
 */

public class HiLo {

	public static void main(String[] args) {
		/*
		 * Getting User Input from the Keyboard
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		String playAgain = "";
		/*
		 * Adding a Play Again Loop
		 */
		do {
			/*
			 * I'm creating the number for the user to guess remember Math.random generates
			 * only number between 0 and 0.99999, so I multiply theNumber * 100
			 * 
			 */
			// Expanding My Range
			// int theNumber = (int) (Math.random() * 100 + 1);
			int theNumber = (int) (Math.random() * 200 - 100);
			// System.out.println(theNumber);

			int guess = 0;
			//Counting Tries
			int numberOfTries = 0;

			while (guess != theNumber) {
				System.out.println("Guess a number between -100 and 100:");
				guess = scanner.nextInt();
				System.out.println("You entered " + guess + ".");
				if (guess < theNumber) {
					System.out.println(guess + " is too low. Try again.");
					numberOfTries++;
				} else if (guess > theNumber) {
					// I found an error here I was writing an extra word 'low'
					System.out.println(guess + " is high. Try again.");
					// System.out.println(guess + " is high low. Try again.");
					numberOfTries++;
				} else {
					System.out.println(guess + " is correct. You win!");
					System.out.println("it only took you "+ numberOfTries + " tries! Good work!");
				}

			}//
			System.out.println("Would you like to play again (y/n)?");
			playAgain = scanner.next();
		} while (playAgain.equalsIgnoreCase("y"));
		System.out.println("Thank you for playing! Goodbye.");
		// just to avoid fill up memory
		scanner.close();
	}
}
