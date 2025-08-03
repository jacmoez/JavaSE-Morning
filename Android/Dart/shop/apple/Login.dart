import 'dart:io';

import 'AdminMenu.dart';

class Login {
  //The default Admin username & password
  static String adminUsername = "admin";
  static String adminPassword = "123";
  static String loggedInCustomerName = "";

  //This method starts the Login
  static void beginLogin() {
    bool exiteProgram = false;

    while (!exiteProgram) {
      List<String> startOptions = ['Login', 'Reister', 'Exit'];

      print("Welcome To Apple Store System");
      print("Select an Option:!");

      for (int i = 0; i < startOptions.length; i++) {
        print('[$i] ${startOptions[i]}');
      }

      stdout.write("Enter you choice (0-${startOptions.length - 1}:)  ");

      String? input = stdin.readLineSync();
      int? startChoice = int.tryParse(input!);

      switch (startChoice) {
        case 0: //Admin Login
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

        case 1: //Customer Menu
          print("\nCustomer Menu");
          print("[1] Login");
          print("[2] Sign Up");
          print("[3] Back");
          exiteProgram = true;
          break;

        case 2:
          print("Thank you for visiting the Apple Store!");
          exiteProgram = true;
          break;

        default:
          print("Ivalid option. Try again.");
      }
    }
  }
}
