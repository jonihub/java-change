import java.util.Scanner;

/*  
    A simple Java program that takes a monetary value and converts 
    it into change, using as few bills and coins as possible. 
*/

public class Change {
    public static void main(String[] args) {
        
        // Set up to recieve user input
        System.out.print("Please enter amount of money (ex. 18.07): $");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();

        int value = (int) (money * 100);
        
        // Check number of $100s
        int hundreds = value / 10000;
        value = value % 10000;

        // Check number of $20s
        int twenties = value / 2000;
        value = value % 2000;

        // Check number of $10s
        int tens = value / 1000;
        value = value % 1000;

        // Check number of $5s
        int fives = value / 500;
        value = value % 500;

        // Check number of $1s
        int ones = value / 100;
        value = value % 100;
        
        // Check number of 25¢s
        int quarters = value / 25;
        value = value % 25;

        // Check number of 10¢s
        int dimes = value / 10;
        value = value % 10;

        // Check number of 5¢s
        int nickel = value / 5;
        value = value % 5;

        // Check number of 1¢s
        int penny = value;

        // Display the results
        String output = "Your amount $" + money + " consists of: \n" + 
        "\t" + hundreds + " hundred dollar(s)\n" +
        "\t" + twenties + " twenty dollar(s)\n" +
        "\t" + tens + " ten dollar(s)\n" +
        "\t" + fives + " five dollar(s)\n" +
        "\t" + ones + " one dollar(s)\n" +
        "\t" + quarters + " quarter(s)\n" +
        "\t" + dimes + " dime(s)\n" +
        "\t"+ nickel + " nickel(s)\n" +
        "\t" + penny + " penny(ies)";

        if (money != 0) {
            System.out.println(output);
        }
        else{
            System.out.println("You didn't put any money");
        }
    }
}
