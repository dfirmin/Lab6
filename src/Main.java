import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userInput = getUserInput(scnr);
		System.out.println(userInput);
		//System.out.println(startsWithVowel(userInput));
		System.out.println(convertWord(userInput));

	}

	// get user input
	public static String getUserInput(Scanner scanner) {
		System.out.println("Type your string to be converted");
		return scanner.nextLine();
	}

	// check if first level starts with a vowel.
	public static boolean startsWithVowel(String input) {
		return "AEIOUaeiou".indexOf(input.charAt(0)) != -1;
	}

	// convert the word to pig latin by using StringBuilder as the new pig latin
	// string
	// returns the StringBuilder string as a string.
	public static String convertWord(String input) {
		StringBuilder modifiedInput = new StringBuilder();
		 
			for (String word : input.split(" ")) {
				if (startsWithVowel(input)) {
				modifiedInput.append(input).append("way ");
				}
				else {
					for (int i = 0; i < word.length(); i++) {
						if ("AEIOUaeiou".indexOf(word.charAt(i)) > -1) {
							modifiedInput.append(word.substring(i, word.length()) + word.substring(0, i)+ "ay ");
							
						}
					}
				}
			}
			
		
		return modifiedInput.toString();
	}

}
