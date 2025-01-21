package OOP.Jan21;

public class Student1 {
   int id;
   String name;
   float fee;

   public Student1(int id, String name, float fee){
       this.id = id;
       this.name = name;
       this.fee = fee;
   }


}

class Programming extends Student1{
    String language;
    Programming(int id, String name, float fee, String language){
        super(id,name,fee);
        this.language = language;
    }

    void studentInfo(){
        System.out.println("Student ID: " + id + "\nStudent Name: " + name + "\nStudent Fee"+ fee + "\nLanguage: " + language + "\n"+"=".repeat(55));
    }

    public static void main(String[] args) {
        Programming p = new Programming(101, "Maung Maung", 120000, "Core Java");
        p.studentInfo();
    }
}
