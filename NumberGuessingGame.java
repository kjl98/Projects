import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int randomNumber = rand.nextInt(100) + 1;

		System.out.println("Welcome to Number Guessing Game! ");

		int tryCount = 0;
		while(true) {
			System.out.print("Enter you guess (1-100) : ");

			Scanner sc = new Scanner(System.in);

			int yourGuess = sc.nextInt();
			tryCount++;

			if(yourGuess == randomNumber) {
				System.out.println("Correct! You Win!");
				System.out.println("It took you " + tryCount + " tries");
				break;
			} else if (randomNumber > yourGuess) {
				System.out.println("Nope! The number is higher. Guess again.");
			} else {
				System.out.println("Nope! The number is lower. Guess again.");
			}
		}
	}
}
