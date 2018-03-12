package web;

import java.util.ArrayList;

public class Products {
    private ArrayList<Product> products;

    public Products(ArrayList<Product> products) {
        this.products = products;
    }

    public Products() {
        products = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public int count(){
        return products.size();
    }

    public void addProduct(Product product){
        products.add(product);
    }
}
