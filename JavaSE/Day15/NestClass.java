package Day15;
/**
     * Non-static nested class
     *  - Member inner class
     *  - Anonymous inner class
     *  - Local inner class
     *  Static nested class
     * @param args
     */


class TestMemberOuter1 {
    private int data = 10;
    class Inner{
        void msg(){
            System.out.println("data is " + data);
        }
        public static void main(String[] args) {
            TestMemberOuter1 obj = new TestMemberOuter1();
            TestMemberOuter1.Inner in = obj.new Inner();
            in.msg();
        }
    }
}

class Main {
    public static void main(String[] args) {
        TestMemberOuter1 obj = new TestMemberOuter1();
        TestMemberOuter1.Inner in = obj.new Inner();
        in.msg();
    }
}

//2 Anonymous inner class
abstract class Person {
    abstract void eat();
}

class TestPerson {
    public static void main(String[] args) {
        Person p = new Person() {
            @Override
            void eat() {
                System.out.println("eating...");
            }
        };
        p.eat();
    }
}

//Local inner class

class LocalInner1 {
    private int data = 10;
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
        LocalInner1 obj = new LocalInner1();
        obj.show();
    }
}

class TestOuter1 {
    static int data = 10;
    static class Inner {
        void msg(){
            System.out.println("data is " + data);
        }
    }

    public static void main(String[] args) {
        TestOuter1.Inner obj = new TestOuter1.Inner();
        obj.msg();
    }
}