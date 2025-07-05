package Day31;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Day32 {
}

class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("သက်ရက်သီး");
        list.add("ပန်းသီး");
        list.add("ငှက်ပျော်သီး");
        list.add("စပျစ်သီး");
       // System.out.println(list);

        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("=".repeat(33));
        for(String name: list){
            System.out.println(name);
        }
        System.out.println("=".repeat(33));
        System.out.println("Returning element: " + list.get(1));
        System.out.println("Returning last element: " + list.getLast());
        System.out.println("Returning first element: " + list.getFirst());

        list.set(0,"ဒူရင်းသီး");

        for(String str : list){
            System.out.println(str);
        }
    }
}


class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList();
        list1.add("သက်ရက်သီး");
        list1.add("ပန်းသီး");
        list1.add("ငှက်ပျော်သီး");
        list1.add("စပျစ်သီး");

        Collections.sort(list1);
        for(String str : list1){
            System.out.println(str);
        }
        System.out.println("=".repeat(33));
        System.out.println("forEach()");
        list1.forEach(a -> {
            System.out.println(a);
        });
    }
}

class ArrayList5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java SE");
        list.add("Database");
        list.add("Java EE");
        list.add("Nodejs");
        list.add("Angularjs");
        list.add("Reactjs");
        list.add("Vue.js");
        list.add("Flutter");
        list.add("Rect Native");
        list.add("Kolin");
        list.add("DevOp");
        ListIterator<String> list1 = list.listIterator(list.size());
        System.out.println("Iterates Reverse Order");
        while (list1.hasPrevious()){
            String str = list1.previous();
            System.out.println(str);
        }
        System.out.println("=".repeat(33));
        System.out.println("For Loop");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("=".repeat(33));
        System.out.println("forEach()");
        list.forEach(a -> System.out.println(a));
        System.out.println("=".repeat(33));

        Iterator<String> itr = list.iterator();
        itr.forEachRemaining(a -> System.out.println(a));
    }
}

class Student {
    int rollNo;
    String name;
    int age;
    Student(int rollNo, String name, int age){
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }
}

class ArrayList6 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Maung Maung", 22);
        Student s2 = new Student(202, "Maung Kaung", 32);
        Student s3 = new Student(303, "Maung Phyo", 33);

        ArrayList<Student> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.forEach(a -> {
            System.out.println("Student ID: " + a.rollNo);
            System.out.println("Student Name: " + a.name);
            System.out.println("Student Age: " + a.age);
            System.out.println("=".repeat(22));
        });

    }
}

class ArrayList7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java SE");
        list.add("Database");
        list.add("Java EE");
        list.add("Nodejs");
        list.add("Angularjs");
        list.add("Reactjs");
        list.add("Vue.js");
        list.add("Flutter");
        list.add("Rect Native");
        list.add("Kolin");
        list.add("DevOp");

        try{
            //Serialization
            FileOutputStream fos = new FileOutputStream("file.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            fos.close();
            oos.close();

            //Deserialization
            FileInputStream fis = new FileInputStream("file.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            ArrayList list1 = (ArrayList) ois.readObject();
            System.out.println(list1);
            ois.close();
            fis.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}