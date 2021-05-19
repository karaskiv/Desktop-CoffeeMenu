import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		// User choice
		int choice;
		
		// Display menu
		System.out.println("");
		System.out.println(" KARASKIV COFFEEHOUSE");
		System.out.println("======================");
		System.out.println("        Menu");
		System.out.println("----------------------");
		System.out.println("1. Next Americano");
		System.out.println("2. Spanish Latte");
		System.out.println("3. Get Espresso");
		System.out.println("----------------------");
		System.out.println("4. Exit");
		System.out.println("======================");
		System.out.print("Enter choice: ");
		
		// Setup scanner
		Scanner in = new Scanner(System.in);
		
		// Get choice from user
		choice = in.nextInt();
		
		// Menu loop
		while(choice != 4) {
			// Check choice value
			if (choice == 1) {
				System.out.println("Next Americano coffee!");
			}
			else if (choice == 2) {
				System.out.println("Spanish Latte coffee!");
			}
			else if (choice == 3) {
				System.out.println("Get Espresso coffee!");
			}
			
			// Display menu
			System.out.println("");
			System.out.println(" KARASKIV COFFEEHOUSE");
			System.out.println("======================");
			System.out.println("        Menu");
			System.out.println("----------------------");
			System.out.println("1. Next Americano");
			System.out.println("2. Spanish Latte");
			System.out.println("3. Get Espresso");
			System.out.println("----------------------");
			System.out.println("4. Exit");
			System.out.println("======================");
			System.out.print("Enter choice: ");
			
			// Get choice from user
			choice = in.nextInt();
		}
		System.out.println("Goodbye, call again!");
	}
}

//of course testing eclipse and git
