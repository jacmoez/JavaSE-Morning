package shop.apple;

import javax.swing.*;

public class Login {
    //The default Admin username & password
    static String adminUsername = "admin";
    static String adminPassword = "Admin123";

    //This method starts the Login
    public static void beginLogin(){
        boolean exitProgram = false;

        String [] startOptions = {"Admin", "Customer", "Exit"};

      int startChoice =  JOptionPane.showOptionDialog(null,
              "Welcome To Apple Store System!\nSelect an Option:",
              "Apple Store Login",
              JOptionPane.DEFAULT_OPTION,
              JOptionPane.INFORMATION_MESSAGE,
              null, startOptions,null);

    }
}
