package OOP.Jan21;

public class Student {
    private int id;
    private String name;

    void setId(int id){
        this.id = id;
    }

    int getId(){
        return id;
    }

    String getName(){
        return name;
    }

    void setName(String name){
        this.name = name;
    }

    void studentInfo(){
        System.out.println("Student ID: " + getId() + "\nStudent Name: " + getName() + "\n"+"=".repeat(55));
    }
}

class TestStudent{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.setId(101);
        s1.setName("Maung Maung");

        s2.setId(202);
        s2.setName("Aung Aung");
       s1.studentInfo();
       s2.studentInfo();
    }
}