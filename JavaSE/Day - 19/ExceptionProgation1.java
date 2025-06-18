import java.io.IOException;

class ExceptionPropagation1 {

    void m() {
        int data = 10 / 0;
    }

    void n() {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("Exception Handled");
        }
    }

    public static void main(String[] args) {
        ExceptionPropagation1 obj = new ExceptionPropagation1();
        obj.p();
        System.out.println("ပုံမှန်တိုင်း အလုပ်လုပ်သည်။");
    }
}


class Throws1 {

    void m() throws IOException{
        throw  new IOException("device error");
    }

    void n() throws IOException{
        m();
    }

    void p() {

        try{
            n();
        } catch (Exception e){
            System.out.println("Exception Handle");
        }

    }
    public static void main(String[] args) {
       ExceptionPropagation1 e = new ExceptionPropagation1();
       e.p();
        System.out.println("ပုံမှန်တိုင်း အလုပ်လုပ်သည်။");
    }
}

class Throws2 {
    void method() throws IOException{
        throw new IOException("device error");
    }
}

class Throws2Test  {
    public static void main(String[] args) {

            Throws2 t = new Throws2();
        try {
            t.method();
        } catch (Exception e){
            System.out.println("Exception handled");
        }
        System.out.println("ပုံမှန်တိုင်း အလုပ်လုပ်သည်။");
    }
}

//Declare Exception

class Throws3 {
    void method() throws IOException{
        System.out.println("Device operation");
    }
}

class Throws3Test {
    public static void main(String[] args) throws IOException {
        Throws3 t = new Throws3();
        t.method();
        System.out.println("ပုံမှန်တိုင်း အလုပ်လုပ်သည်။");
    }
}

