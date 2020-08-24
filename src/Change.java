// import java.util.Scanner;

public class Change {
    public static void main(String[] args) {

        int value = 1209019;
        
        int hundreds = value / 10000;
        value = value % 10000;

        int twenties = value / 2000;
        value = value % 2000;

        int tens = value / 500;
        value = value % 1000;

        int fives = value / 500;
        value = value % 500;

        int ones = value / 100;
        value = value % 100;
        
        int quarters = value / 25;
        value = value % 25;

        int dimes = value / 10;
        value = value % 10;

        int nickel = value / 5;
        value = value % 5;

        int penny = value;

        String output = "Your amount " + value + " consists of: \n" + 
        "\t" + hundreds + " hundred dollars\n" +
        "\t" + twenties + " twenty dollars\n" +
        "\t" + tens + " ten dollars\n" +
        "\t" + fives + " five dollars\n" +
        "\t" + ones + " one dollars\n" +
        "\t" + quarters + " quarters\n" +
        "\t" + dimes + " dimes\n" +
        "\t"+ nickel + " nickels\n" +
        "\t" + penny + " pennies";

        if (value != 0) {
            System.out.println(output);
        }
        else{
            System.out.println("You didn't put any money");
        }
    }
}
