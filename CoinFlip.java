
// I worked on the homework assignment alone, using only course materials
import java.util.Random;
import java.util.Scanner;

public class CoinFlip {

    public static void main(String[] args) {
        String answer = "";
        int max;
        int flipCounter;
        int sequenceNum;
        int headsNum;
        int tailsNum;
        String result = "";
        double avgFlips;
        Scanner myScanner = new Scanner(System.in);
        while (!answer.equals("n")) {
            avgFlips = 0.0;
            flipCounter = 0;
            max = 0;
            tailsNum = 0;
            headsNum = 0;

            System.out.print("Ready to run a coin flip simulation. Enter the number of sequences: ");
            sequenceNum = myScanner.nextInt();
            if (sequenceNum > 0) {

                System.out.print("How many heads should each sequence have? ");
                headsNum = myScanner.nextInt();
                if (headsNum > 0) {

                    System.out.print("How many tails should each sequence have? ");
                    tailsNum = myScanner.nextInt();

                    if (tailsNum > 0) {

                        System.out.println("Simulating Sequences");
                        for (int i = 1; i < sequenceNum + 1; i++) {
                            result = "";
                            int headsCounter = 0;
                            int tailsCounter = 0;
                            while (headsNum != headsCounter || tailsCounter != tailsNum) {
                                Random myRandom = new Random();
                                int sideProb = myRandom.nextInt(2);
                                if (sideProb == 0) {
                                    result += "H";
                                    if (headsCounter != headsNum) {
                                        headsCounter += 1;
                                        flipCounter += 1;
                                    } else
                                        flipCounter += 1;
                                } else {
                                    result += "T";
                                    if (tailsCounter != tailsNum) {
                                        tailsCounter += 1;
                                        flipCounter += 1;
                                    } else {
                                        flipCounter += 1;
                                    }
                                }
                                if (result.length() > max)
                                    max = result.length();
                                avgFlips = ((double) flipCounter) / sequenceNum;

                            }
                            System.out.println(i + " - " + result);
                        }
                        System.out.format("The average number of flips was %.2f", avgFlips);
                        System.out.println(" and the maximum was " + max);

                    }
                }
            }
            System.out.print("Would you like to run another simulation? (y/n): ");
            answer = myScanner.next();

            while (!answer.equals("y") && !answer.equals("n")) {
                System.out.print("Would you like to run another simulation? (y/n): ");
                answer = myScanner.next();
            }

        }
    }

}
