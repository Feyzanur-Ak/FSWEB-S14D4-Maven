package org.example.model;

public abstract class ProductForSale {
    private String price;
    private int description;
    private  String type;


    public ProductForSale(String price, int description, String type) {
        this.price = price;
        this.description = description;
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public int getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public double getSalesPrice(int quantity){
        return quantity*Double.parseDouble(price);
    }

    public abstract void showDetails();


}
