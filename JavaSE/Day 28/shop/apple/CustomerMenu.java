package shop.apple;

import java.util.Scanner;

public class CustomerMenu {

    public void displayCMenu(){
        System.out.println("=".repeat(25));
        System.out.println( " \uD83C\uDF4E Customer Dashboard");
        System.out.println("=".repeat(25));
        System.out.println("(1) View Products");
        System.out.println("(2) Purchase Product" );
        System.out.println("(3) View My Transactions");
        System.out.println("(0) Logout");
    }

    public void options(){
        ProductServices p = new ProductServices();
        Scanner scanner = new Scanner(System.in);
         boolean cMenuRunning = true;

         while (cMenuRunning){

             //Calls customer display
             displayCMenu();

             System.out.print("To get started, select a number: ");
             int number = scanner.nextInt();
             System.out.println();

             switch (number){
                 case 1:
                     System.out.println("----------------------");
                     System.out.println("|   Apple Inventory   |");
                     System.out.println("----------------------");
                     p.viewProducts();
                     System.out.println();
                     System.out.println();
                     break;
                 case 2:
                     System.out.println("----------------------");
                     System.out.println("|   Purchase Product  |");
                     System.out.println("----------------------");
                     p.purchaseProduct();
                     System.out.println();
                     System.out.println();
                     break;
                 case 3:
                     System.out.println("----------------------");
                     System.out.println("|   Transactions   |");
                     System.out.println("----------------------");
                     new Transactions().viewAllTransactions();
                     System.out.println();
                     System.out.println();
                     break;
                 case 0:
                     System.out.println("Logging Out...");
                     cMenuRunning = false;

                     //Returns to start login
                     new Login().beginLogin();
                     break;
                 default:
                     System.out.println("Invalid option. Try again.");
             }
         }
        scanner.close();

    }


}
