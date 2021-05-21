import java.util.Scanner;

public class Menu2 {

	public static void displayMenu(int opts[], String items[]) {
		// Display menu
		System.out.println("");
		System.out.println(" KARASKIV COFFEEHOUSE");
		System.out.println("======================");
		System.out.println("        Menu");
		System.out.println("----------------------");
		// Loop through options and items
		for(int i = 0; i < opts.length; i++) {
			System.out.printf("%d. %s\n", opts[i], items[i]);
		}
		System.out.println("======================");
		System.out.print("Enter choice: ");
	}

	public static void main(String[] args) {
		// User choice
		int choice;
		
		// Menu data
		int options[] = {1,2,3,4};
		String menuItems[] = {"Next Americano","Spanish Latte","Get Espresso","Exit"};

		// Display menu
		displayMenu(options, menuItems);
		
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
			displayMenu(options, menuItems);
			
			// Get choice from user
			choice = in.nextInt();
		}
		System.out.println("Goodbye, call again!");
	}
}
