//Java Pattern
//Start Pattern
//Number Pattern
//Character Pattern

import javax.management.MBeanTrustPermission;

class Patterrn1 {
    public static void main(String[] args) {
        int row = 6;
        for(int i = 0; i < row; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
                System.out.println();
        }
    
    }
}

class Pattern2 {
    public static void main(String[] args) {
        int i, j, row = 6;
        for(i = 0; i < row; i++){
            for(j = row-i; j>1; j--){
                System.out.print(" ");
            }
            for(j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//Object Class OOP, Function
//Pre defin Method, user defin Method 
class Math1 {
    public static void main(String[] args) {
        double x = 28;
        double y = 4;

        System.out.println("Maximum number: " + Math.max(x, y));
        System.out.println("Square Root: " + Math.sqrt(y));
        System.out.println("Power: " + Math.pow(x, y)); // 28 * 28 * 28 * 28

        System.out.println("Log: " + Math.log(x));
        System.out.println("Log: " + Math.log(y));

        System.out.println("log10 " + Math.log10(y));
    }
}

class Math2 {
    public static void main(String[] args) {
        int x = 78;
        int y = -48;
        System.out.println(Math.abs(x));
        System.out.println(Math.abs(y));

        double a = -47.63;
        double b = -894.37;
        System.out.println(Math.abs(a));
        System.out.println(Math.abs(b));

        System.out.println(Math.abs(7.0/0));

        float c = 837.01f;
        System.out.println(Math.round(c));
        System.out.println(Math.ceil(c));
        System.out.println(Math.floor(c));
        /**
         * SE (OOP, Collection Framwork, IO, try cat, Threat, DBMS) JSP, Sevel, Spring,    Reactjs
         * Android  
         */
    }
}





