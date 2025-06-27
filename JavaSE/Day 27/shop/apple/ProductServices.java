package shop.apple;

import java.util.Scanner;

public class ProductServices {

    Scanner scanner = new Scanner(System.in);

    //Method to view products
    public void viewProducts(){
        for (int i = 0; i < Products.products.length; i++){
            Products products = Products.products[i];
            if(products != null){
                System.out.println("ID: " + products.getId());
                System.out.println("Name: " + products.getName());
                System.out.println("Price: $" + products.getPrice());
                System.out.println("Stock: " + products.getStock());
                System.out.println("=".repeat(33));
            }
        }
    }

    //Add Product Method
    public void addProduct() {
        if (Products.productCount >= Products.products.length) {
            System.out.println("Product list is full.");
            return;
        }

        //Increase th ID for each new product
        Products.nextId++;
        System.out.print("Enter Product Name: ");

        String name = scanner.nextLine();

        System.out.print("Enter Product Price: ");
        float price = Float.parseFloat(scanner.nextLine());

        System.out.print("Enter Stock: ");
        int stock = Integer.parseInt(scanner.nextLine());

        System.out.println();

        Products newProduct = new Products(Products.nextId, name, price, stock);

        //Update to array with the new product
        Products.products[Products.productCount] = newProduct;
        Products.productCount++;
        System.out.println("Product add with ID: " + newProduct.getId());

    }

    //Delete Product to Method
    public void deleteProduct(){
        System.out.print("Enter Product ID to delete: ");

        int idToDelete = scanner.nextInt();

        boolean found = false;

        for(int i = 0; i < Products.productCount; i++){
            if(Products.products[i] != null && Products.products[i].getId() == idToDelete){
                for(int j = i; j < Products.productCount - 1; j++){ //     5  6  7  8
                    Products.products[j] =Products.products[j + 1]; //      B C D
                }

                Products.products[Products.productCount -1] = null;
                Products.productCount--;

                System.out.println("Product with ID " + idToDelete + " deleted.");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Product not found");
        }
    }

    public void purchaseProduct(){
        System.out.println("Welcome To Purchase Product");
    }


}

// CT Skill DSA, Flow Chart
