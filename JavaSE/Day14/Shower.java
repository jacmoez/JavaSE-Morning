package OOP.Jan21;

import org.w3c.dom.ls.LSOutput;

public class Shower {
    public void taskShower(){
        System.out.println("I am taking Shower");
    }
}


 abstract class Animal {
        abstract void eat();
}

class Dog extends Animal{
    @Override
    void eat(){}
}

abstract class Shap{
    abstract void showArea();
}

class TestShap {


    public static void main(String[] args) {
        Shap s = new Shap(){
            @Override
            void showArea() {
                System.out.println("Hello Shap");
            }
        };
        s.showArea();
    }
}