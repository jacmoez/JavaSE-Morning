package shop.apple;

import javax.swing.*;

public class Login {
    //The default Admin username & password
    static String adminUsername = "admin";
    static String adminPassword = "Admin123";

    //This method starts the Login
    public static void beginLogin(){
        boolean exitProgram = false;

        /** While the program has not exited this the loop will bring you back to the start options*/
        while (!exitProgram) {
            String[] startOptions = {"Admin", "Customer", "Exit"};

            int startChoice = JOptionPane.showOptionDialog(null,
                    "Welcome To Apple Store System!\nSelect an Option:",
                    "Apple Store Login",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null, startOptions, startOptions[0]);//The array starts at 0 Admin = 0, Customer = 1, Exit = 2/** -----------------------------------------------------------------------------------------------*/
            /** Exit from options if the user exit or the x button */

            if (startChoice == 2 || startChoice == JOptionPane.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(null, "Thank you for visiting the Apple Store");
                break;
            }
            /**----------------------------------------------------------------------------------------------------*/
            /** if user choose Admin */
            if(startChoice == 0){
                boolean loggedInAdmin = false;
                /**Loops back to username input for admin, allows user to try again */
                while (!loggedInAdmin){

                   String adminUsernameInput =  JOptionPane.showInputDialog("Admin Username: ");
                   if(adminUsernameInput == null){
                       break;}

                    String adminPasswordInput = JOptionPane.showInputDialog("Admin Password: ");
                   if(adminPasswordInput == null){
                       break;}

                   /** Checks if the username and password is both correct */

                   if(adminUsernameInput.equals(adminUsername) && adminPasswordInput.equals(adminPassword)){
                       JOptionPane.showMessageDialog(null, "Access Granted!Welcome, Admin \uD83C\uDF4E ", "Login Success", JOptionPane.INFORMATION_MESSAGE);

                       /** Stop the loop */
                       loggedInAdmin = true;

                       /** Calls options from AdminMenu class - Opens the Admin Menu. */
                       AdminMenu.options();

                       /** Exits from the starting login Loop */
                       exitProgram = true;}
                   /** if the username and password is incorrect a message will pop up,
                    * letting the user go back to start or try again.*/

                   else {
                       String[] incorrectOptions = {"Try Again", "Back try again"};
                       int incorrectChoice = JOptionPane.showOptionDialog(null, "Incorrect username or password.\nPlease try again:", "Admin Login: ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, incorrectOptions, incorrectOptions[0]);
                       /** Exit from the admin login loop - close the dialogue.*/
                       if (incorrectChoice == 1 || incorrectChoice == JOptionPane.CLOSED_OPTION) {
                            break;}
                   }
                }
            }
            /**-----------------------------------------------------------------------------------------------*/

            /** If User choose Customer Opens an additional menu that lets new customer sign up and old customers login*/
            if(startChoice == 1){
                String [] customerOptions = {"Login", "Sign Up", "Back"};
                int  customerChoice = JOptionPane.showOptionDialog(
                        null,
                        "Select an Option:",
                        "Customer Menu",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        customerOptions,
                        customerOptions[0]);
                /** If user chooses login*/
                if(customerChoice == 0){
                    boolean loggedInCustomer = false;
                    while (!loggedInCustomer){
                       String customerUserInput =  JOptionPane.showInputDialog("Customer Username: ");
                        if(customerUserInput == null){
                            break;}
                       String customerPasswordInput =  JOptionPane.showInputDialog("Customer Password: ");
                        if(customerPasswordInput == null){
                            break;}

//                        boolean customerFound = false;
//                        /** This loop is acts as authentication Loop through the customer list to see if any username & password match.*/
//                        for(int i = 0; i < Customer.customerCount; i++){
//                            Customer user = Customer.customers[i];
//
//                        }
                    }
                }
            }
        }




    }
}