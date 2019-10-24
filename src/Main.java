import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String answer2;
        do {
            System.out.println("Would you like to generate a random number or input a number? (R/I)");
            String answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("I")) {
                int counter = 0;
                System.out.println("Please input a number: ");
                int numInput = keyboard.nextInt();
                for (int i = 1; i <= numInput; i++) {
                    if (numInput % i == 0) {
                        counter++;
                    }
                }
                if (counter > 2) {
                    System.out.println(numInput + " is not a prime");
                } else if (counter == 2) {
                    System.out.println(numInput + " is a prime");
                } else if (counter == 1) {
                    System.out.println(numInput + " is not a prime");
                }
            } else if (answer.equalsIgnoreCase("R")) {
                System.out.println("Below is a random selection from 1 and 250:");
                Random r = new Random();
                int counter2 = 0;
                int numR = 1 + r.nextInt(250);
                for (int j = 1; j <= numR; j++) {
                    if (numR % j == 0) {
                        counter2++;
                    }
                }
                if (counter2 > 2) {
                    System.out.println(numR + " is not a prime");
                } else if (counter2 == 2) {
                    System.out.println(numR + " is a prime");
                } else if (counter2 == 1) {
                    System.out.println(numR + " is not a prime");
                }
            }
            System.out.println("Would you like to try again (Y/N)");
            answer2=keyboard.next();
        }while(answer2.equalsIgnoreCase("Y"));
    }
}