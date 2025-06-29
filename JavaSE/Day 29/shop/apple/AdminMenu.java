package shop.apple;

import java.util.Scanner;

public class AdminMenu {

    void displayMenu(){
        System.out.println("=".repeat(25));
        System.out.println( " \uD83C\uDF4E Admin Dashboard");
        System.out.println("=".repeat(25));
        System.out.println("(1) Manage Products");
        System.out.println("(2) View Customer Accounts");
        System.out.println("(3) View Transactions");
        System.out.println("(0) Logout");
    }
    public  void options(){
        Scanner scanner = new Scanner(System.in);


        boolean aMenuRunning = true;
        while (aMenuRunning){
            //Calls Admin display
            displayMenu();

            System.out.print("To get start, select a number: ");
            int number = scanner.nextInt();
            System.out.println();

            switch (number){
                case 1:
                    new ManageProducts().displayPMenu();
                    break;
                case 2:
                    System.out.println("----------------------");
                    System.out.println("|  Customer Accounts  |");
                    System.out.println("----------------------");
                   Customer.viewCustomer();
                    break;
                case 3:
                    System.out.println("----------------------");
                    System.out.println("|    Transactions     |");
                    System.out.println("----------------------");
                    //new Transactions().viewAllTransactions();
                    break;
                case 0:
                    System.err.println("Logout out...");
                    aMenuRunning = false;
                    //Return to
                    new Login().beginLogin();
                    break;
                default:
                    System.out.println("Invalid option, Try again.");
            }
        }

        scanner.close();

    }


}
