package org.example.model;

public class Coke extends  ProductForSale{
    private String brand;

    public Coke(String price, int description, String type) {
        super(price, description, type);
        this.brand="Cola Turka";
    }

    public String getBrand(){
        return brand;
    }

    @Override
    public void showDetails() {
        System.out.println("Product Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Cocoa Percentage: " + brand + "%");
    }
}
