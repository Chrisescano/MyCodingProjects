package org.pluralsight;

import java.util.Scanner;

public class SupermarketProject {
    private static boolean isDone = false;

    private static String welcomePrompt = "Welcome to Greg's supermarket!";
    private static String mainMenuPrompt = "Possible commands:\n  (B)rowse items\n  (P)rint receipt\n  (Q)uit\nType command: ";

    static String[] listOfProducts = {
            "Apple", "Banana", "Coconut", "Doughnuts", "Eggs", "Fig", "Granola",
            "Hash-Browns", "Ice", "Jam", "Kiwi", "Lychee", "Milk", "Nuggets",
            "Oxtail", "Pears", "Quinoa", "Rice", "Steak", "Tomatoes", "Udon-Noodles",
            "Velveeta-Cheese", "Water-Bottle", "Xanthan-Gum", "Yogurt", "Zebra-Cake"
    };
    static double[] priceOfProducts = {
            1.00, 1.17, 3.43, 5.97, 6.72, 6.05, 1.89,
            3.25, 0.99, 2.48, 2.98,12.45, 3.14, 9.15,
            15.89,2.20, 4.70,13.99,10.20, 1.50, 2.49,
            6.19, 1.50,13.00, 2.36, 2.79
    };
    static String[] shoppingCart = new String[30];
    static int shoppingCartIndex = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(welcomePrompt);
        while(!isDone) {
            char command = getCharInput(scanner, mainMenuPrompt);
            switch(command) {
                case 'B':
                    System.out.println("You want to browse\n");
                    break;
                case 'P':
                    System.out.println("You want to print your receipt\n");
                    break;
                case 'Q':
                    System.out.println("Thank you for visiting Greg's Supermarket, please come again!\n");
                    isDone = true;
                    break;
                default:
                    System.out.println("I'm sorry, I don't understand that command, please try again.\n");
            }
        }
    }

    public static char getCharInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return Character.toUpperCase(scanner.nextLine().charAt(0));
    }
}