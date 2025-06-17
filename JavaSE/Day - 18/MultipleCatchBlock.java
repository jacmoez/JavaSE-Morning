class MultipleCatchBlock2 {

    public static void main(String[] args) {
        try {
            int [] a = new int[5];
            System.out.println(a[10]);

            /**
             * int [] a = new int[5];
             * a[5] = 10/0;
             */
        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception ");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bound Exception");
        } catch (Exception e){
            System.out.println("Print Exception");
        }
        System.out.println("Hello Java");
    }
}
class MultipleCatchBlock3 {

    public static void main(String[] args) {
        try {

            int [] a = new int[5];
              a[5] = 10/0;
            System.out.println(a[4]);

        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception ");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bound Exception");
        } catch (Exception e){
            System.out.println("Print Exception");
        }
        System.out.println("Hello Java");
    }
}