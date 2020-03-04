// I worked on the homework assignment alone, using only course materials
import java.util.Scanner;
public class StandingCalculator {

	public static void main(String[] args) {
		int credits;
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Credit hours taken: ");
		credits = myScanner.nextInt();
		if (credits <= -1) {
			System.out.println("Invalid"); 
			return; }
		if (credits <= 29)
			System.out.println("Freshman");
		if ((credits >= 30) && (credits <= 59))
			System.out.println("Sophomore");
		if ((credits >= 60) && (credits <= 89))
			System.out.println("Junior");
		if (credits >= 90)
			System.out.println("Senior");
	}

}
