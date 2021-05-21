import java.util.Scanner;

public class Menu2 {

	public static void displayMenu(int opts[], String items[]) {
		// Display menu
		System.out.println("");
		System.out.println(" KARASKIV COFFEEHOUSE");
		System.out.println("======================");
		System.out.println("        Menu");
		System.out.println("----------------------");
		// Loop through options and items except the last
		for(int i = 0; i < opts.length-1; i++) {
			System.out.printf("%d. %s\n", opts[i], items[i]);
		}
		System.out.println("----------------------");
		// Print only the last option and item
		// Why is it not opts[3] instead? Cause we might add more in the menu 
		// while Exit is always be on the last of the list
		System.out.println(opts[opts.length-1] + ". " + items[items.length-1]);
		System.out.println("======================");
		System.out.print("Enter choice: ");
	}

	public static void main(String[] args) {
		// User choice
		int choice;
		
		// Menu data
		int options[] = {1,2,3,0};
		String menuItems[] = {"Next Americano","Spanish Latte","Get Espresso","Exit"};

		// Exit option
		int EXIT = options[options.length-1];

		// Display menu
		displayMenu(options, menuItems);
		
		// Setup scanner
		Scanner in = new Scanner(System.in);
		
		// Get choice from user
		choice = in.nextInt();
		
		// Menu loop
		while(choice != EXIT) {
			// Check choice value
			if (choice == options[0]) {
				System.out.println(menuItems[0] + " coffee!");
			}
			else if (choice == options[1]) {
				System.out.println(menuItems[1] + " coffee!");
			}
			else if (choice == options[2]) {
				System.out.println(menuItems[2] + " coffee!");
			}
			
			// Display menu
			displayMenu(options, menuItems);
			
			// Get choice from user
			choice = in.nextInt();
		}

		System.out.println("Goodbye, call again!");
		
	}
}
