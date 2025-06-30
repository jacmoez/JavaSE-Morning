package shop.apple;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Transactions {
    private String customerName;
    private String productName;
    private int quantity;
    private float price;
    private Date transactionData;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    //Transaction array to store all transaction

    public static Transactions[] transactions = new Transactions[10];
    public static int transactionCount = 0;

    static {
        Products []  products = Products.products;
        transactions[0] = new Transactions("AMS Student" , products[0].getName(), 1, products[0].getPrice());
        transactions[0].transactionData = new Date(System.currentTimeMillis());
        transactions[1] = new Transactions("B K", products[1].getName(), 2, products[1].getPrice());
        transactions[1].transactionData = new Date(System.currentTimeMillis() - 86400000);
        transactionCount = 2;
    }

    public Transactions(String customerName, String productName, int quantity, float price){
        this.customerName =customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.transactionData = new Date();
    }

    public void save(){
        if(transactionCount < transactions.length){
            transactions[transactionCount] = this;
            transactionCount++;
        } else {
            System.out.println("Transaction storage full. Cannot save more transactions.");
        }
    }
    public static void viewAllTransactions(){
        System.out.println("\n=== ALL TRANSACTIONS ===");
        System.out.println("Customer Name "+transactions[0].customerName);
        if(transactionCount == 0){
            System.out.println("No transaction recorded.");
            return;
        }
        for(int i = 0; i < transactionCount; i++){
            Transactions t = transactions[i];
            System.out.println("Customer: " + t.customerName);
            System.out.println("Product: " + t.productName);
            System.out.println("Quantity: " + t.quantity);
            System.out.println("Price: $" + t.price);
            System.out.println("Date: " + dateFormat.format(t.transactionData));
            System.out.println("=".repeat(33));
        }
    }

    //view customer-specific transactions

    public static void viewCustomerTransactions(String customerName) {
        System.out.println("\n=== YOU TRANSACTIONS ===");
        boolean found = false;

        for (int i = 0; i < transactionCount; i++) {
            Transactions t = transactions[i];
            if (t.customerName.equalsIgnoreCase(customerName)) {
                found = true;
                for (String s : Arrays.asList("Product: " + t.productName, "Quantity: " + t.quantity, "Price: $" + t.price, "Date: " + dateFormat.format(t.transactionData), "=".repeat(33))) {
                    System.out.println(s);
                }
            }
            if (!found) {
                System.out.println("No transactions found for " + customerName);
            }
        }


    }
}