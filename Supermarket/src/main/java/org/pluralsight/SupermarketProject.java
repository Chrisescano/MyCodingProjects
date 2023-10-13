package org.pluralsight;

import java.util.Scanner;

public class SupermarketProject {
    private static boolean isDone = false; //global boolean will end the program when true
    static Scanner scanner = new Scanner(System.in);

    private static String selectionMsg = "Greg's Supermarket has the following items";

    private static String welcomePrompt = "Welcome to Greg's supermarket!";
    private static String mainMenuPrompt = "Possible commands:\n  (B)rowse items\n  (P)rint receipt\n  (Q)uit\nType command: ";
    private static String browsingPrompt = "Possible commands:\n  (A)dd to shopping cart - A <item-name> <quantity>\n  (R)eturn to main menu\n  (Q)uit\nType command: ";

    static String[] listOfItems = {
            "Apple", "Banana", "Coconut", "Doughnuts", "Eggs", "Fig", "Granola",
            "Hash-Browns", "Ice", "Jam", "Kiwi", "Lychee", "Milk", "Nuggets",
            "Oxtail", "Pears", "Quinoa", "Rice", "Steak", "Tomatoes", "Udon-Noodles",
            "Velveeta-Cheese", "Water-Bottle", "Xanthan-Gum", "Yogurt", "Zebra-Cake"
    };
    static double[] priceOfItems = {
            1.00, 1.17, 3.43, 5.97, 6.72, 6.05, 1.89,
            3.25, 0.99, 2.48, 2.98,12.45, 3.14, 9.15,
            15.89,2.20, 4.70,13.99,10.20, 1.50, 2.49,
            6.19, 1.50,13.00, 2.36, 2.79
    };
    static String[] shoppingCart = new String[30];
    static int shoppingCartIndex = 0;

    public static void main(String[] args) {
        System.out.println(welcomePrompt);
        while(!isDone) {
            char command = getCharInput(scanner, mainMenuPrompt);
            switch(command) {
                case 'B':
                    browsingMenu();
                    break;
                case 'P':
                    System.out.println("You want to print your receipt\n");
                    break;
                case 'Q':
                    enableQuitProgram();
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

    public static String getStringInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static void enableQuitProgram() {
        System.out.println("Thank you for visiting Greg's Supermarket, please come again!\n");
        isDone = true;
    }

    public static void addToShoppingCart(String command) {
        String[] tokens = command.split(" ");

        for(int i = 0; i < listOfItems.length; i++) {
            if(listOfItems[i].equalsIgnoreCase(tokens[1])) {
                if(shoppingCartIndex == 29) {
                    System.out.println("Oops! Shopping cart is full, can't add any more items");
                    return;
                }

                int quantity = tokens.length == 3 ? Integer.parseInt(tokens[2]) : 1;
                shoppingCart[shoppingCartIndex] = i + " " + quantity;
                shoppingCartIndex++;
            }
        }
    }

    public static void browsingMenu() {
        System.out.println(selectionMsg);

        //prints list of products and prices
        for(int i = 0; i < listOfItems.length; i++) {
            System.out.printf("%-15s  $%5.2f\n", listOfItems[i], priceOfItems[i]);
        }

        while(true) {
            String command = getStringInput(scanner, browsingPrompt);
            switch(Character.toUpperCase(command.charAt(0))) {
                case 'A':
                    addToShoppingCart(command);
                    break;
                case 'R':
                    System.out.println();
                    return;
                case 'Q':
                    enableQuitProgram();
                    break;
                default:
                    System.out.println("I'm sorry, I don't understand that command, please try again.\n");
            }
        }

    }
}