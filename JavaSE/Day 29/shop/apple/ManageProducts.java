package shop.apple;

import java.util.Scanner;

public class ManageProducts {
    public void displayPMenu() {
        Scanner scanner = new Scanner(System.in);
        ProductServices p = new ProductServices();
        System.out.println("Welcome To Product Manager");

        while (true) {
            System.out.println();
            System.out.println("----------------------");
            System.out.println("|   Product Manager  |");
            System.out.println("----------------------");
            System.out.println("(1) Add Product");
            System.out.println("(2) Delete Product");
            System.out.println("(3) View Product");
            System.out.println("(0) Back");
            System.out.print("Select a number: ");

            int number = scanner.nextInt();


            switch (number) {
                case 1:
                    p.addProduct();
                    break;
                case 2:
                    p.deleteProduct();
                    break;
                case 3:
                    System.out.println("----------------------");
                    System.out.println("|   Apple Inventory   |");
                    System.out.println("----------------------");
                    p.viewProducts();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid option, Try again.");
            }
        }

    }
}