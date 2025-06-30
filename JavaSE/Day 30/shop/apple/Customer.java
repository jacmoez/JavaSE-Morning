package shop.apple;

public class Customer {
        private String name;
        private String email;
        private String username;
        private String password;

        //Customer array, store all new customer from SingUp;
    public  static Customer[] customers = new Customer[5];
        //Count customers to create an ID that increases with each new SingUp
    public static int customerCount = 0;

    static {
        customers[0] = new Customer("AMS Student", "stu@ams.com.mm", "AMS Student", "bk");
        customerCount = 1;
    }

    public Customer(String name, String email, String username, String password){
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public static void viewCustomer(){
      if(customerCount == 0){
          System.out.println("No customers registered ");
          return;
      } else {
          System.out.println("Registered Customers: ");
          for(int i = 0; i < customerCount; i++){
              Customer c = customers[i];
              if(c != null){
                  System.out.println((i + 1) + ".Name: " + c.getName());
                  System.out.println(" Email: " + c.getEmail());
                  System.out.println(" Username : " + c.getName());
                  System.out.println("=".repeat(33));
              }
          }
      }
    }
}
