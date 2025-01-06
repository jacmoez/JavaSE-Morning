import java.util.Scanner;

class Main{
    //Instance Variable
    public static void main(String[] args) {
        //ကိန်းဂဏန်း ၂ ခုပေါင်း
        // System.out.println("Hello Java");
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter First number: ");
        // scanner.close();
        int a = 2;
        int b = 3;
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
    }
}

class Add {
    public static void main(String[] args) {
       Add a = new Add();
       //a.add();
       //a.sub();
       a.multi();
    }

    void add(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
       scanner.close();
       int sum = num1 + num2;
       System.out.println(num1 + " + " + num2 + " = " + sum);
    }

    void sub(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
       scanner.close();
       int sum = num1 - num2;
       System.out.println(num1 + " - " + num2 + " = " + sum);
    }
 
    void multi(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
       scanner.close();
       int sum = num1 * num2;
       System.out.println(num1 + " * " + num2 + " = " + sum);
    }
}