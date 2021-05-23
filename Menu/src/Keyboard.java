import java.util.Scanner;

class Keyboard{
	private Scanner in;
	Keyboard(){
		in = new Scanner(System.in);
	}
	public int readInteger(String promptMsg, String errorMsg){
		int num = 0;
		String strInput;
		boolean valid = false;

		// Keep looking until valid input
		while(valid == false){
			// Prompt the user
			System.out.print(promptMsg);
			// Grab input from keyboard
			strInput = in.nextLine();
			// Try to convert String to int
			try{
				num = Integer.parseInt(strInput);
				valid = true;
			}
			catch(NumberFormatException e){
				System.out.println(errorMsg);
			}
		} 
		return num;
	}
}
