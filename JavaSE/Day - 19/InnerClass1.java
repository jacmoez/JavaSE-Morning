/**
 *
 * Java Inner Class
 *
 * class Java_Outer_Class{
 *  //code
 *     class Java_Inner_Class{
 *         //code
 *     }
 * }
 * Java Member Inner Class
 *
 * Anonymous Inner class
 *
 * Local Inner Class
 *
 * static nested class
 *
 * Java Nested Interface
 */

public class InnerClass1 {
    private int data = 10;
    class Inner {
        void msg(){
            System.out.println("data is " + data);
        }
    }
    public static void main(String[] args) {
        InnerClass1 i = new InnerClass1();
        InnerClass1.Inner in = i.new Inner();
        in.msg();
    }
}
