package OOP.Jan21;

public class Shape {
    protected int base;
    protected int height;

    public Shape(int base, int height){
        this.base = base;
        this.height = height;
    }

    void showArea(){
        System.out.println(base * height);
    }
}

class TestShape {
    public static void main(String[] args) {
        Shape s = new Shape(10,20);
        s.showArea();
    }
}

class Add {
    public static void main(String[] args) {
        int a = 10;
        a = 20;// update
        System.out.println(a);
    }


}
