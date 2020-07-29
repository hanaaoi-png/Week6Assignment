// Hannah McBeth
import java.util.Random;
import java.util.Scanner;

public class Hannah_McBeth_Week6Assignment {

	
	public static void main(String[] args) {
		
		// Part 1
		int min;
		int max;
		int n1; // How many random numbers to generate
		
		Scanner input = new Scanner(System.in);

		System.out.print("\n---------------------------------------------------------------------" + "\nPart 1: for loop: Average of randomly generated integers" + "---------------------------------------------------------------------");
		System.out.println("Enter the bottom number of the range: ");
		min = input.nextInt();
		System.out.println("Enter the top number of the range: ");
		max = input.nextInt();
		System.out.println("Enter How Many Numbers to Generate: ");
		n1 = input.nextInt();
		System.out.println("Generated Random Numbers: ");
		printRandomNumbersAndAverage(n1, min, max);

		// Part 2
		int myNumber;
		double sum2 = 0;
		int counter = 1;
		double part2Average;

		System.out.print("\nPart 2: while loop: Average of user-entered integers using While loop" + "---------------------------------------------------------------------");
		System.out.println("Enter integers to average. Enter -1 to finish.");
		System.out.printf("Entry 1: ");
		myNumber = input.nextInt();
		while (myNumber != -1) {
			sum2 = sum2 + myNumber;
			counter++;
			System.out.print("Entry " + counter + ": ");
			myNumber = input.nextInt();
		}
		System.out.println("Number of entries: " + (counter - 1));
		if (counter > 0) {
			System.out.println("Average of user-entered numbers: " + (sum2/(counter - 1)));
		}
		System.out.println("---------------------------------------------------------------------");

		displayMenu();

		input.close();
	}
		// Part 3

	private static void displayMenu() {
		Scanner input = new Scanner(System.in);
		int userInput;
		do {
		    System.out.print("\nPart 3: do-while loop: Display menu until user chooses to exit" + "---------------------------------------------------------------------");
			System.out.println("==============================");
			System.out.println("MENU");
			System.out.println("==============================");
		    System.out.println("1: Choice 1");
		    System.out.println("2: Choice 2");
		    System.out.println("3: Choice 3");
		    System.out.println("4: Exit");
	        System.out.println("==============================");
	        System.out.println("Enter 1, 2, 3 or 4 to Exit: ");
		    System.out.println("==============================");
			userInput = input.nextInt();
		} while (userInput != 4);

		goodBye();  
	}

	private static void goodBye() {
		System.out.print("Goodbye!");
	}

	private static void printRandomNumbersAndAverage(int n, int min, int max) {
		Random rand = new Random();
		double sum1 = 0;
		double part1Average;
		for (int i = 0; i < n; i++) {
			int next = rand.nextInt(max - min) + min;
			System.out.print(next); 
			System.out.print(" "); 
			sum1 += next; // Add all random numbers
		}
			
		part1Average = sum1/n; // Get the average
		System.out.println("\nAverage of generated numbers: ");
		System.out.print(part1Average);
	 }

}