import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Getting User Input from the Keyboard
		 * 
		 */
		Scanner scanner = new Scanner(System.in);

		/*
		 * I'm creating the number for the user to guess remember Math.random generates
		 * only number between 0 and 0.99999, so I multiply theNumber * 100
		 * 
		 */
		int theNumber = (int) (Math.random() * 100 + 1);
		 System.out.println(theNumber);

		int guess = 0;
		while (guess != theNumber) {
			System.out.println("Guess a number between 1 and 100:");
			guess = scanner.nextInt();
			System.out.println("You entered " + guess + ".");
			if (guess < theNumber) 
				System.out.println(guess + " is too low. Try again.");
			else if  (guess > theNumber) 
				System.out.println(guess + " is high low. Try again.");
			else 
				System.out.println(guess + " is correct.");	
			}
		}
	}
