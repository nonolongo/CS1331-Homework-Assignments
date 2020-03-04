// I worked on the homework assignment alone, using only course materials
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String answer1 = "";
		while (!answer1.equals("n")) {
			Scanner myScanner = new Scanner(System.in);
			String emptyString = "";
			System.out.println("Welcome to Hawaii! Let's check if your name is Hawaiian enough.");
			System.out.print("Enter your name: ");
			String answer = myScanner.nextLine();
			answer = answer.toLowerCase();
			for (int i = 0; i < answer.length(); i++) {
				char test = answer.charAt(i);
				switch (test) {
				case 'a':
					emptyString += "a";
					break;
				case 'e':
					emptyString += "e";
					break;
				case 'i':
					emptyString += "i";
					break;
				case 'o':
					emptyString += "o";
					break;
				case 'u':
					emptyString += "u";
					break;
				case 'k':
					emptyString += "k";
					break;
				case 'l':
					emptyString += "l";
					break;
				case 'h':
					emptyString += "h";
					break;
				case 'm':
					emptyString += "m";
					break;
				case 'n':
					emptyString += "n";
					break;
				default:
					break;
				}
			}
			if (answer.equals(emptyString)) {
				System.out.println("Aloha, " + answer);
			} else {
				System.out.println("Sorry " + answer + ", you aren't Hawaiian enough to come!");
				System.out.println("Let's make your name... " + emptyString + "!");
			}
			System.out.println("Would you like to try again? (y/n):");
			answer1 = myScanner.nextLine();
		}
	}
}