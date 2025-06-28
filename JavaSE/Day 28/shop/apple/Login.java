package shop.apple;

import javax.swing.*;

public class Login {
    //The default Admin username & password
    static String adminUsername = "admin";
    static String adminPassword = "Admin123";

    public String loggedInCustomerName = "";

    //This method starts the Login
    public  void beginLogin(){
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
                       AdminMenu a = new AdminMenu();
                       /** Calls options from AdminMenu class - Opens the Admin Menu. */
                       a.options();

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

                        boolean customerFound = false;

                        //This loop is acts as authentication

                        for(int i = 0; i < Customer.customerCount; i++){
                            Customer user = Customer.customers[i];
                            if(user.getUsername().equals(customerUserInput) && user.getPassword().equals(customerPasswordInput)){
                                customerFound = true;
                                break;
                            }
                   }
                        //Now having loop customer list
                        if(customerFound){
                            JOptionPane.showMessageDialog(null,"Access Granted Welcome, " + customerUserInput + " \uD83C\uDF4E ");

                            //Breaks the customer login loop
                            loggedInCustomer = true;
                            loggedInCustomerName = customerUserInput;

                            //calls options from the customerMenu class - open the customer menu
                            new CustomerMenu().options();
                            exitProgram = true;
                        }
                        //If the username and password is incorrect a message;
                        //letting the user go back to start or try again.
                        else {
                            String [] incorrectOptions = {"Try Again", "Back to Start"};
                            int  incorrectChoice = JOptionPane.showOptionDialog(
                                    null,
                                    "Incorrect username or password.\nPlease try again:",
                                    "Admin Login",
                                    JOptionPane.DEFAULT_OPTION,
                                    JOptionPane.INFORMATION_MESSAGE,
                                    null,
                                    incorrectOptions,
                                    incorrectOptions[0]);

                            //Exits from Customer login - close the dialogue.
                            if(incorrectChoice == 1 || incorrectChoice == JOptionPane.CLOSED_OPTION){
                                break;
                            }
                        }
                    }
                }

                //Customer Sing Up

                else if (customerChoice == 1){
                    //Check if array has room
                    if(Customer.customerCount >= Customer.customers.length ){
                        JOptionPane.showMessageDialog(null, "Customer limit reached. Cannot register more.");
                        continue;
                    }

                    //Gather customer info
                    String newEmail = JOptionPane.showInputDialog("Enter email:");
                    if(newEmail == null || newEmail.trim().isEmpty()){
                        JOptionPane.showMessageDialog(null,"Error: Please enter a valid email address.");
                        continue;
                    }

                    String newCustomer = JOptionPane.showInputDialog("Enter Full Name:");
                    if(newCustomer == null || newCustomer.trim().isEmpty()){
                        JOptionPane.showMessageDialog(null,"Error: Please enter a valid Full Name.");
                        continue;
                    }

                    String newUser = JOptionPane.showInputDialog("Enter username:");
                    if(newUser == null || newUser.trim().isEmpty()){
                        JOptionPane.showMessageDialog(null,"Error: Please enter a valid username.");
                        continue;
                    }

                    String newPass = JOptionPane.showInputDialog("Enter Password:");
                    if(newPass == null || newPass.trim().isEmpty()){
                        JOptionPane.showMessageDialog(null,"Error: Please enter a valid Password.");
                        continue;
                    }

                    //check if username is already taken
                    boolean customerExist = false;

                    for(int i = 0; i < Customer.customerCount; i++){
                        Customer user = Customer.customers[i];
                        if(user.getUsername().equals(newUser)){
                            customerExist = true;
                            break;
                        }

                        if(customerExist){
                            JOptionPane.showMessageDialog(null,"Username already exists, Please choose another.");
                        } else {
                            Customer.customers[Customer.customerCount] = new Customer(newCustomer, newEmail, newUser, newPass);

                            Customer.customerCount++;

                            JOptionPane.showMessageDialog(null,"Sign-up successful! you can now log in as " + newUser);
                        }
                    }
                }
            }
        }




    }
}