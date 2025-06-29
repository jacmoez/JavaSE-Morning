package shop.apple;

public class Products {

    private int id;
    private String name;
    private float price;
    private int stock;

    //Products Array
    static Products[] products = new Products[10];
    static int productCount = 3;
    static int nextId = 3;

    static {
        products[0] = new Products(1, "iPhone 15 Pro", 699.99f, 5);
        products[1] = new Products(2, "Mac Book Air M2", 299.99f, 5);
        products[2] = new Products(3,"AirPods Pro 2", 249.0f ,6);
    }

    //Products Constructor
    public Products(int id, String name, float price, int stock){
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    //Getter
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public float getPrice(){
        return price;
    }

    public int getStock(){
        return stock;
    }

    public void setStock(int stock){
        this.stock = stock;
    }
}
