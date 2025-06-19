
abstract class Person {
    abstract void eat();
}

class TestAnonymousInner{
    public static void main(String[] args) {
        Person p = new Person(){
            void eat(){
                System.out.println("မဂ်လာပါ ကြိုဆိုပါ၏။");
            }
        };

        p.eat();
    }
}

interface Animal {
    void eat();
}

class TestAnonymousInner2{
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void eat() {
                System.out.println("မဂ်လာပါ ကြိုဆိုပါ၏။");
            }
        };
        a.eat();
    }
}

//Local Inner Class

class  LocalInner1 {
    private int data = 50;
    void show(){
        class Local {
            void msg(){
                System.out.println(data);
            }
        }
        Local l = new Local();
        l.msg();
    }

    public static void main(String[] args) {
        LocalInner1 l = new LocalInner1();
        l.show();
    }
}

class LocalInner2 {
    final int data = 10;
    void msg(){
        System.out.println(data);
    }

    public static void main(String[] args) {
        LocalInner2 l = new LocalInner2();
        l.msg();
    }
}


class LocalInner3 {
    private int data = 100;

    void show(){
        int value = 50;
        class Local {
            void msg(){
                System.out.println(value);
            }
        }
        Local l = new Local();
        l.msg();
    }

    public static void main(String[] args) {
        LocalInner3 l = new LocalInner3();
        l.show();
    }
}

//static nested class

class StaticNested1 {
    static int data = 100;
    static class Inner{
        void msg(){
            System.out.println("Data is " + data);
        }
    }

    public static void main(String[] args) {
        StaticNested1.Inner s = new StaticNested1.Inner();
        s.msg();
    }
}

//Nested Interface 

interface Showable {
    void show();
    interface Message{
        void msg();
    }
}

class TestNestedInterface1 implements Showable.Message{
   public void msg(){
       System.out.println("Hello nested interface");
   }

    public static void main(String[] args) {
        Showable.Message message = new TestNestedInterface1();
        message.msg();
    }
}