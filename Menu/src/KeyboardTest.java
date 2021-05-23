class KeyboardTest{
	public static void main(String[] args){
		// Create a keyboard object
		Keyboard kb = new Keyboard();

		// Test case 1 : readInteger
		int intInput;
		String promptMsg1 = "Enter an integer value: ";
		String errorMsg1 = "Invalid entry, enter an integer value.";
		// Call to readInteger
		intInput = kb.readInteger(promptMsg1, errorMsg1);
		// Output
		System.out.println("You entered the value " + intInput);
	}
}