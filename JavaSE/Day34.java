import java.util.Set;
import java.util.TreeSet;

public class Day34 {
    /**
     * Tree Set
     */
}

class TerrSet1 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("ပန်းသီး");
        set.add("လိမ္မော်သီး");
        set.add("စပျစ်သီး");
        set.add("ငှက်ပျော်သီး");
        set.add("လိမ္မော်သီး");
        set.forEach(a-> System.out.println(a));
    }
}

class TreeSet2 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(24);
        set.add(66);
        set.add(12);
        set.add(15);
        System.out.println("Lowest Value: " + set.pollFirst());
        System.out.println("Highest Value: " + set.pollLast());
    }
}

class TreeSet3 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("က");
        set.add("ခ");
        set.add("ဂ");
        set.add("ဃ");
        set.add("င");

        System.out.println("Initial Set: " + set);

        System.out.println("Reverse Set: " + set.descendingSet());

        System.out.println("Head Set: " + set.headSet("ဂ", true));

        System.out.println("Sub Set: " + set.subSet("က", false, "င", true));

        System.out.println("TailSet: " + set.tailSet("ဂ", false));
    }
}

class Book1 implements Comparable<Book1> {
    int id, quantity;
    String name, author, publisher;

    public Book1(int id, String name, String author, String publisher, int quantity){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Book1 b) {
        if(id > b.id){
            return  1;
        } else if (id < b.id) {
            return -1;
        } else {
            return 0;
        }
    }
}

class TestBook1 {
    public static void main(String[] args) {
        Set<Book1> set = new TreeSet<>();

        Book1 b1 = new Book1(101, "Java SE", "Oracle", "Oracle", 800);
        Book1 b2 = new Book1(202, "Database", "MySQL", "Oracle", 500);
        Book1 b3 = new Book1(303, "Java EE", "Spring", "Oracle", 300);

        set.add(b1);
        set.add(b2);
        set.add(b3);

        set.forEach(b->{
            System.out.println("Book ID: " + b.id + "\nBook Name: " + b.name + "\nBook Author: " + b.author + "\nBook Publisher: " + b.publisher + "\nBook Quantity: " + b.quantity);
            System.out.println("=".repeat(33));
        });
    }
}