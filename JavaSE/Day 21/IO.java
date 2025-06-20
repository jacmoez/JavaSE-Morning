import java.io.*;

class IO1 {
     public static void main(String[] args) {
         try {
             FileOutputStream fout = new FileOutputStream("C:\\Users\\NJ TECH\\IdeaProjects\\BK\\src\\bk.txt");
             fout.write(66);
             fout.close();
             System.out.println("Success");
         }catch (Exception e){
             System.out.println(e);
         }
     }
}

class IO2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\NJ TECH\\IdeaProjects\\BK\\src\\bkout.txt");
            String str = "မဂ်လာပါ ကြိုဆိုပါ၏၊ ဂျာဗား ပရိုဂရမ်မင်းကို လေ့လာအတွက် ဝမ်းသာပါတယ်။";
            byte b [] = str.getBytes();
            fileOutputStream.write(b);
            fileOutputStream.close();
            System.out.println("Success");
        } catch (Exception e){
            System.out.println(e);
        }
    }
}

class IO3 {
    public static void main(String[] args) {
        try{
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\NJ TECH\\IdeaProjects\\BK\\src\\bkout.txt");
            int i = fileInputStream.read();
            System.out.println(i);
            fileInputStream.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}

class IO4 {
    public static void main(String[] args) {
        try{
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\NJ TECH\\IdeaProjects\\BK\\src\\bkout.txt");
            int i = 0;
            while ((i=fileInputStream.read())!=-1){
                System.out.print((char)i);
            }
            fileInputStream.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}

class IO5 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\NJ TECH\\IdeaProjects\\BK\\src\\bkout.txt";

        try(FileInputStream fileInputStream = new FileInputStream(fileName)){
            int i;
            while ((i=fileInputStream.read())!=-1){
                System.out.print((char)i);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

class IO6 {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\NJ TECH\\IdeaProjects\\BK\\src\\bkout.txt";

        try(FileOutputStream fileOutputStream = new FileOutputStream(filePath)){
            fileOutputStream.write("Welcome To BK.".getBytes());
        }catch (IOException e){
            System.out.println("Error writing to file: " + e.getMessage());
            return;

        }
        try (FileInputStream fis = new FileInputStream(filePath))
               {
                FileInputStream fisFromFD = new FileInputStream(fis.getFD());

                   {
                       int data;
                       while ((data = fisFromFD.read()) != -1) {
                           System.out.print((char) data);
                       }
                   }
        } catch (IOException e){
            System.out.println("Error Reading from " + e.getMessage());
        }
    }
}

class IO7 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\NJ TECH\\IdeaProjects\\BK\\src\\bkout.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        String str = "Welcome To Java Programming.";
        byte b[] = str.getBytes();
        bufferedOutputStream.write(b);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        fileOutputStream.close();
        System.out.println("Success");
    }
}

class IO8 {
    public static void main(String[] args) throws IOException {

            FileInputStream fin = new FileInputStream("C:\\Users\\NJ TECH\\IdeaProjects\\BK\\src\\bkout.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);

        int i;
        while ((i=bin.read())!=-1){
            System.out.print((char)i);
        }
        bin.close();
        fin.close();
    }
}

class IO9 {
    public static void main(String[] args) throws IOException {
        FileInputStream input1 = new FileInputStream("C:\\Users\\NJ TECH\\IdeaProjects\\BK\\src\\bkout.txt");
        FileInputStream input2 = new FileInputStream("C:\\Users\\NJ TECH\\IdeaProjects\\BK\\src\\bk.txt");

        SequenceInputStream inst = new SequenceInputStream(input1, input2);
        int i;
        while ((i=inst.read())!=-1){
            System.out.print((char) i);
        }
        inst.close();
        input2.close();
        input1.close();
    }
}

class IO10 {
    public static void main(String[] args) throws IOException {
        FileInputStream input1 = new FileInputStream("C:\\Users\\NJ TECH\\IdeaProjects\\BK\\src\\bkout.txt");

        FileInputStream input2 =new FileInputStream("C:\\Users\\NJ TECH\\IdeaProjects\\BK\\src\\bk.txt");

        FileOutputStream fout = new FileOutputStream("C:\\Users\\NJ TECH\\IdeaProjects\\BK\\src\\bout.txt");

        SequenceInputStream sis = new SequenceInputStream(input1, input2);

        int i;
        while ((i=sis.read())!=-1){
            fout.write(i);
        }
        sis.close();
        fout.close();
        input2.close();
        input1.close();
        System.out.println("File Success");
    }
}