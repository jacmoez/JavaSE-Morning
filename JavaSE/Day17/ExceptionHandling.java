class ExceptionHandling1 {
    public static void main(String[] args) {
        try{
            int x = 100/0;
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Hello Java");
    }
}

class ExceptionHandling2 {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;
        try {
            int result = dividend / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed");
        }
    }
}

class ExceptionHandling3 {
    public static void main(String[] args) {
        String str = null;

        try {
            int length = str.length();

            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e){
            System.out.println("Error: Null reference Error");
        }
    }
}

class ExceptionHandling4 {
    public static void main(String[] args) {
        String str = "abc";
        try{
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e){
            System.out.println("Number Error");
        }

    }
}

class ExceptionHandling5 {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        try{
            int index = 10;
            int value = numbers[index];
            System.out.println("Value at index" + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Index is out of bounds");
        }

    }
}