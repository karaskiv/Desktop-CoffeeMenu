import java.util.Scanner;

public class Menu2 {

	public static void displayMenu(int opts[], String items[], double pr[]) {
		// Display menu
		System.out.println("");
		System.out.println(" KARASKIV COFFEEHOUSE");
		System.out.println("======================");
		System.out.println("        Menu");
		System.out.println("----------------------");
		// Loop through options and items except the last
		for(int i = 0; i < opts.length-1; i++) {
			System.out.printf("%d. %s   \t%.1fk\n", opts[i], items[i], pr[i]);
		}
		System.out.println("----------------------");
		// Print only the last option and item
		System.out.println(opts[opts.length-1] + ". " + items[items.length-1]);
		System.out.println("======================");
		System.out.print("Enter choice: ");
	}

	public static void main(String[] args) {
		// User choice
		int choice;
		
		// Menu data
		int options[] = {1,2,3,4,5,0};
		String menuItems[] = {"Spanish Latte","Next Fredo","Next Frappe","Get Americano","Get Espresso","","Exit"};
		double price[] = {20, 17.5, 17.5, 15, 15, 0};

		// Exit option
		int EXIT = options[options.length-1];

		// Display menu
		displayMenu(options, menuItems, price);
		
		// Setup scanner
		Scanner in = new Scanner(System.in);
		
		// Get choice from user
		choice = in.nextInt();
		
		// Menu loop
		while(choice != EXIT) {
			// Check choice value
			if (choice == options[0]) {
				System.out.println(menuItems[0] + " coffee\t" + price[0] + "k");
			}
			else if (choice == options[1]) {
				System.out.println(menuItems[1] + " coffee\t" + price[1] + "k");
			}
			else if (choice == options[2]) {
				System.out.println(menuItems[2] + " coffee\t" + price[2] + "k");
			}
			else if (choice == options[3]) {
				System.out.println(menuItems[3] + " coffee\t" + price[3] + "k");
			}
			else if (choice == options[4]) {
				System.out.println(menuItems[4] + " coffee\t" + price[4] + "k");
			}
			
			// Display menu
			displayMenu(options, menuItems, price);
			
			// Get choice from user
			choice = in.nextInt();
		}

		System.out.println("Thank you, have a good day!");

	}
}
