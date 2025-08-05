import 'dart:io';
import 'AdminMenu.dart';
import 'Customer.dart';
import 'CustomerMenu.dart';

class Login {
  //The default Admin username & password
  static String adminUsername = "admin";
  static String adminPassword = "123";
  static String loggedInCustomerName = "";

  //This method starts the Login
  static void beginLogin() {
    bool exiteProgram = false;

    while (!exiteProgram) {
      print("Welcome To Apple Store System");
      print("Select an Option:!");
      print("[1] Admin");
      print("[2] Customer");
      print("[3] Exit");

      stdout.write("Enter choice [1-3]: ");

      String? input = stdin.readLineSync();
      int? startChoice = int.tryParse(input!);

      switch (startChoice) {
        case 1: //Admin Login
          bool loggedInAdmin = false;

          while (!loggedInAdmin) {
            stdout.write("\nAdmin Username: ");
            String? adminUsernameInput = stdin.readLineSync();
            if (adminUsernameInput == null) break;

            stdout.write("Admin Password: ");
            String? adminPasswordInput = stdin.readLineSync();
            if (adminPasswordInput == null) break;

            if (adminUsername == adminUsernameInput &&
                adminPasswordInput == adminPassword) {
              print("\nAccess Granted! Welcome, Admin ");
              loggedInAdmin = true;

              Adminmenu.options();

              exiteProgram = true;
            } else {
              print("\nIncorrect username or password.");
              print("1. Try Again");
              print("2. Back to start");
              stdout.write("Enter you choice (1-2): ");

              String? incorrectInput = stdin.readLineSync();
              if (incorrectInput == '2') break;
            }
          }
          break;

        case 2: //Customer Menu
          print("\nCustomer Menu");
          print("[1] Login");
          print("[2] Sign Up");
          print("[3] Back");

          stdout.write("Enter choice [1-3]: ");
          int? customerChoice = int.tryParse(stdin.readLineSync()!);

          if (customerChoice == 1) {
            //Customer Login
            bool loggedInCustomer = false;

            while (!loggedInCustomer) {
              stdout.write("Customer Username: ");
              String? customerUsernameInput = stdin.readLineSync();
              if (customerUsernameInput == null) break;

              stdout.write("Customer Password: ");
              String? customerPasswordInput = stdin.readLineSync();
              if (customerPasswordInput == null) break;

              bool customerFound = false;

              for (int i = 0; i < Customer.customerCount; i++) {
                var user = Customer.customers[i];
                if (user != null &&
                    user.getUsername == customerUsernameInput &&
                    user.getPassword == customerPasswordInput) {
                  customerFound = true;
                  break;
                }
              }

              if (customerFound) {
                print(
                  "Access Granted! Welcome, ${customerUsernameInput} \uD83c\uDF4E\n",
                );
                loggedInCustomer = true;
                loggedInCustomerName = customerUsernameInput;

                //Customer Calss Calss
                CustomerMenu.options();

                exiteProgram = true;
              } else {
                print(" Incorred credentails.");
                print("[1] Try Again");
                print("[2] Back to Start");

                stdout.write("Choose: ");
                String? choice = stdin.readLineSync();
                if (choice == '2') break;
              }
            }
          } else if (customerChoice == 2) {
            // Customer Sign Up
            if (Customer.customerCount >= Customer.customers.length) {
              print(" Customer limit reached. Cannot register more.");
              continue;
            }

            stdout.write("Enter email: ");
            String? newEmail = stdin.readLineSync();
            if (newEmail == null || newEmail.trim().isEmpty) {
              print(" Pleases enter a valid email.");
              continue;
            }

            stdout.write("Enter full name: ");
            String? newName = stdin.readLineSync();
            if (newName == null || newName.trim().isEmpty) {
              print(" Please enter a valid name.");
              continue;
            }

            stdout.write("Enter new username: ");
            String? newUser = stdin.readLineSync();
            if (newUser == null || newUser.trim().isEmpty) {
              print(" Please enter a valid username.");
              continue;
            }

            stdout.write("Enter new password: ");
            String? newPass = stdin.readLineSync();
            if (newPass == null || newPass.trim().isEmpty) {
              print(" Please enter a valid password.");
              continue;
            }

            //Check for duplicate username
            bool customerExists = false;
            for (int i = 0; i < Customer.customerCount; i++) {
              var user = Customer.customers[i];
              if (user != null && user.getUsername == newUser) {
                customerExists = true;
                break;
              }
            }
            if (customerExists) {
              print("Username already exists. Plase choose anthor.");
            } else {
              Customer.customers[Customer.customerCount] = Customer(
                newName,
                newEmail,
                newUser,
                newPass,
              );
              Customer.customerCount++;
              print("Sign-Up successful! You Can now log in as ${newUser}");
            }
          }

          break;

        case 3:
          print("Thank you for visiting the Apple Store!");
          exiteProgram = true;
          break;

        default:
          print("Ivalid option. Try again.");
      }
    }
  }
}
