// I worked on the homework assignment alone, using only course materials
import java.util.Scanner;
public class TipCalculator {

	public static void main(String[] args) {
	Scanner myScanner = new Scanner(System.in);	
	double answer = 0;
	int counter = 1;
	double subTotal = 0;
	double tip = 0;
	double total = 0;
	double answer1 = 0;
	System.out.println("Welcome to Tip Calculator!");
	System.out.println("Enter the prices of your items. Enter -1 to enter tip percentage.");
	while (answer != -1) {
		System.out.print("Item " + counter + ": $");
		answer = myScanner.nextDouble();
		counter++;
		subTotal += answer;
	}
	subTotal++;
	System.out.print("Enter the tip percentage: ");
	answer1 = myScanner.nextDouble();
	tip = answer1*subTotal;
	total = tip+subTotal;
	System.out.println("Subtotal: " + subTotal);
	System.out.format("Tip: %.2f", tip);
	System.out.format("\nTotal: %.2f", total);
		}
	}

