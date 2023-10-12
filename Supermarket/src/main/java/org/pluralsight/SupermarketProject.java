package org.pluralsight;

import java.util.Scanner;

public class SupermarketProject {
    private static boolean isDone = false;

    private static String welcomePrompt = "Welcome to Greg's supermarket!";
    private static String mainMenuPrompt = "Possible commands:\n  (B)rowse items\n  (P)rint receipt\n  (Q)uit\nType command: ";

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