/**
 * try {
 *      Outer try block
 *    try{
 *      Inner try block
 *    }catch (ExceptionType1 e1) {
 *      Inner catch block
 *    }
 *    }catch (ExceptionType2 e2) {
 *     Outer catch block
 *    }
 */
class NestedTryBlock1 {
    public static void main(String[] args) {
        try{
            try{
                System.out.println("Cannot divide by 0");
                int a = 10/0;
            } catch (ArithmeticException e){
                System.out.println(e);
            } try {
                int a[] = new int[5];
                a[5] = 10;
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            System.out.println("Other Staement");
        } catch (Exception e){
            System.out.println("Exception");
        }
        System.out.println("Normal Flow");
    }
}

class NestedTryBlock2 {
    public static void main(String[] args) {
        try{
            try{
                try{
                    int arr[] = {10,20,30,40};
                    System.out.println(arr[10]);
                } catch (ArithmeticException e){
                    System.out.println("Arithmetic Exception");
                    System.out.println("Inner try block 2");
                }
            } catch (ArithmeticException e){
                System.out.println("Arithmetic Exception");
                System.out.println("Inner try block 1");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        } catch (Exception e){
            System.out.println("Exception");
            System.out.println("Normal Flow");
        }
    }

}