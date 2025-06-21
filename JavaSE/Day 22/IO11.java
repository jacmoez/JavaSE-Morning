import javax.swing.*;
import java.io.*;
import java.util.Calendar;

public class IO11 {

    public static void main(String[] args) throws IOException {
        InputStream input = new FileInputStream("C:\\Users\\NJ TECH\\IdeaProjects\\BK\\src\\bktest.txt");
        DataInputStream inst = new DataInputStream(input);

        //length, size
        int count = input.available();
        System.out.println( count);
        byte[] array = new byte[count];
        inst.read(array);
        for(byte bt : array){
            char k = (char) bt;
            System.out.print(k);
        }
    }
}


//FilterOutputStream

class IO12 {
    public static void main(String[] args) throws IOException {
        File data = new File("C:\\Users\\NJ TECH\\IdeaProjects\\BK\\src\\bktest.txt");
        FileOutputStream file = new FileOutputStream(data);
        FilterOutputStream filter = new FilterOutputStream(file);
        String str = "Welcome To Ko Swa";
        byte b [] = str.getBytes();
        filter.write(b);
        filter.flush();
        filter.close();
        file.close();
        System.out.println("Success");
    }
}

class IO13 {
    public static void main(String[] args) throws IOException {
        File data = new File("C:\\Users\\NJ TECH\\IdeaProjects\\BK\\src\\bktest.txt");
        FileInputStream file = new FileInputStream(data);
        FilterInputStream filter = new BufferedInputStream(file);
        int k = 0;
        while ((k=filter.read())!= -1){
            System.out.print((char)k);
        }
        file.close();
        filter.close();
    }
}

//ObjectStream
class IO14 {
    public static void main(String[] args) {
        ObjectStreamClass osc = ObjectStreamClass.lookup(String.class);

        System.out.println(""+osc.getField("value"));

        ObjectStreamClass osc2 = ObjectStreamClass.lookup(Calendar.class);
        System.out.println(""+osc2.getField("isTimeSet"));
    }
}

class IO15 {
    public static void main(String[] args) throws NullPointerException {
        Console c = System.console();
        System.out.print("Enter your name: ");
       String n = c.readLine();
       System.out.println("Welcome " + n);
    }
}

class JO {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "မဂ်လာပါ ကြိုဆိုပါ၏။","AMS LTD", 1);
    }
}