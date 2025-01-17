package org.example.model;

public class Bread extends ProductForSale {
     private String paste;

    public Bread(String type, double price, String description,String paste) {
        super(type, price, description);
        this.paste=paste;
    }


    public Bread(String type, double price, String description) {
        super(type, price, description);
    }


    @Override
    public void showDetails() {
        System.out.println(super.toString()+this);
    }

    @Override
    public String toString() {
        return "Bread{" +
                "paste='" + paste + '\'' +
                '}';
    }
}
