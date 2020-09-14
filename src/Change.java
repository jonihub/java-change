import java.util.Scanner;

/*  
    A simple Java program that takes a monetary value and converts 
    it into change, using as few bills and coins as possible. 
*/

public class Change {
    public static void main(String[] args) {

        int[] coins = {10000, 5000, 2000, 1000, 500, 100, 50, 25, 10, 5, 1};
        
        // Set up to recieve user input
        System.out.print("Please enter amount of money (ex. 18.07): $");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
       
        // Convert user input to cents
        int value = (int) (money * 100);
        // Determine how many coins are required
        int[] count = coin_calc(coins, value);

        // Display the results
        System.out.println("Your amount $" + money + " consists of " + value + " coin(s).");
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] >= 100) {
                System.out.println("\t" + count[i] + " - " + coins[i]/100 + " dollar(s)");
            }
            else {
                System.out.println("\t" + count[i] + " - " + coins[i] + " cent(s)");
            }
         }
         sc.close();
    }

    static int[] coin_calc(int[] coins, int amount) {
        
        int[] count = new int[coins.length];
        // Loop through each value (starting at largest)
        for (int i = 0; i < coins.length; i++) {
            
            // Use one value at a time, and return count
            while (amount >= coins[i]) {
                count[i]++;
                amount -= coins[i];
            }
        }
        return count;
    }

}
