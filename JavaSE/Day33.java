import java.util.*;


public class Day33 {
    /**
     * Java LinkedList
     *
     * တူတာတွေကို လက္ခံ    (contain duplicate element)
     *
     * ထားရင်ထားသလို ရှိတယ် (insertion order)
     *
     * တစ်ပြိုင်ထဲ အလုပ်မလုပ်ဘူး (no synchronized)
     */
}

class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("သက်ရက်သီး");
        ll.add("ပန်းသီး");
        ll.add("ငှက်ပျော်သီး");
        ll.add("စပျစ်သီး");

        ll.forEach(a -> System.out.println(a));
        ll.add(0,"ဒူးရင်းသီး");
        System.out.println(ll);

        LinkedList<String> ll2 = new LinkedList<>();
        ll2.add("မင်းဂွတ်သီး");
        ll2.add("နနတ်သီး");
        ll.addAll(ll2);

        System.out.println(ll2);

        LinkedList<String> ll3 = new LinkedList<>();
        ll3.add("ထညက်ခဲ");
        ll3.add("သကြား");

        ll.addAll(0,ll3);
        System.out.println("ပထမဉီးဆုံးအသီး : " +ll.getFirst());
        System.out.println("နောက်ဆုံးအသီး : " + ll.getLast());
        System.out.println("=".repeat(33));

        ll.forEach(a -> System.out.println(a));

    }
}

class Book {
    int id, quantity;
    String name, author, publisher;

    public Book(int id, String name, String author, String publisher, int quantity){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

class TestBook {
    public static void main(String[] args) {
        List<Book> list = new LinkedList<>();

        Book b1 = new Book(101, "java", "BK", "BKK", 1000);
        Book b2 = new Book(202, "Database", "KB", "KKB", 500);
        Book b3 = new Book(303, "Java EE", "Min Lwin", "JDC", 500);

        list.add(b1);
        list.add(b2);
        list.add(b3);

        list.forEach(a-> {
            System.out.println("Book ID: " + a.id + "\nBook Name: " + a.name + "\nBook Author:" + a.author +"\nBook Publisher: " + a.publisher + "\nBook Quantity: " + a.quantity );
            System.out.println("=".repeat(33));
        });
    }
}

class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("One");

        set.forEach(a -> System.out.println(a));
    }
}

class HashSet2 {
    public static void main(String[] args) {
        HashSet<Book> set = new HashSet<>();
        Book b1 = new Book(101, "java", "BK", "BKK", 1000);
        Book b2 = new Book(202, "Database", "KB", "KKB", 500);
        Book b3 = new Book(303, "Java EE", "Min Lwin", "JDC", 500);

        set.add(b1);
        set.add(b2);
        set.add(b3);
        set.forEach(a-> {
            System.out.println("Book ID: " + a.id + "\nBook Name: " + a.name + "\nBook Author:" + a.author +"\nBook Publisher: " + a.publisher + "\nBook Quantity: " + a.quantity );
            System.out.println("=".repeat(33));
        });

    }
}
