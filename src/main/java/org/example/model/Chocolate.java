package org.example.model;

public class Chocolate extends ProductForSale {

    private  double chocolateRatio;

    public Chocolate(String price, int description, String type) {
        super(price, description, type);
        this.chocolateRatio =50.0;
    }




    public double getChocolateRatio(){
        return  chocolateRatio;
    }

    @Override
    public void showDetails() {
        System.out.println("Product Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Cocoa Percentage: " + chocolateRatio + "%");
    }
}
