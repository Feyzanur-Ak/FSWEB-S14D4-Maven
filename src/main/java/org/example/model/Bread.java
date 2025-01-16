package org.example.model;

public class Bread extends ProductForSale {
     private String paste;

    public Bread(String price, int description, String type) {
        super(price, description, type);
        this.paste="wheat bread";

    }

    public Bread(String price, int description) {
        super(price, description, "Generic Bread");
        this.paste="wheat bread";

    }


    @Override
    public void showDetails() {
        System.out.println("Product Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Paste Type: " + paste);
    }
}
