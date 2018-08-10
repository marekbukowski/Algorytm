package pl.developer.tree.structure.soft.deweloper.academy.trees.app;

import pl.developer.tree.structure.BinaryTree;
import pl.developer.tree.structure.Node;

import java.util.Scanner;

public class BinaryTreeApp {

    public static String[] menu = new String[]{
            "1. Traverse tree in order",
            "2. Traverse tree in pre order",
            "3. Traverse tree in post order",
            "4. Print tree",
            "5. Save tree to file",
            "6. Exit"
    };

    public static void main(String[] args) {
        System.out.println("BINARY TREE APP");
        printMenu();

        int userChoice;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Choose menu option: ");
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("You have chosen 1");
                    break;
            }
        } while (userChoice != 6);
    }
    public static void printMenu() {
        if (menu != null) {
            for (String menuItem : menu) {
                System.out.println(menuItem);
            }
        }
    }
    }
