import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

class FinallyBlock1 {
    public static void main(String[] args) {
        try{
            int x = 25/5;
            System.out.println(x);
        } catch (NullPointerException e){
            System.out.println(e);
        } finally {
            System.out.println("Finally သည် အမြဲတမ်းအလုပ်လုပ်သည်။");
        }
        System.out.println("code သည် ပုံမှန်တိုင်း အလုပ်လုပ်သည်၊");
    }
}

class FinallyBlock2 {
    public static void main(String[] args) {
        try{
            int x = 25/0;
            System.out.println(x);
        } catch (ArithmeticException e){
            System.out.println(e);
        } finally {
            System.out.println("Finally သည် အမြဲတမ်းအလုပ်လုပ်သည်။");
        }
        System.out.println("code သည် ပုံမှန်တိုင်း အလုပ်လုပ်သည်၊");
    }
}

//Java Throw Exception

class ThrowException1 {

    void validate(int age){
        if(age < 18){
            throw  new ArithmeticException("အသက်မပြည့်သေးသဖြင့် သွေးလှူလို့မရ၊");
        } else {
            System.out.println("အသက်ပြည့်တဲ့အတွက် သွေးလှူခွင့်ရှိသည်။");
        }
    }

    public static void main(String[] args) {
        ThrowException1 t = new ThrowException1();
        t.validate(19);
        System.out.println("ပုံမှန်တိုင်း အလုပ်လုပ်သည်၊");
    }
}

class ThrowException2 {

    static void method() throws FileNotFoundException {
        FileReader file = new FileReader("C:\\Users\\Desktop\\bk.txt");
        BufferedReader fileInput = new BufferedReader(file);

        throw new FileNotFoundException();
    }
    public static void main(String[] args) {
        try {
            method();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Code သည် ပုံမှန်တိုင်း အလုပ်လုပ်သည်။");
    }
}

