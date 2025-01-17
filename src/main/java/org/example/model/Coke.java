package org.example.model;

public class Coke extends  ProductForSale{
    private String brand;


    public Coke(String type, double price, String description,String brand) {
        super(type, price, description);
        this.brand=brand;
    }

    public Coke(String type, double price, String description) {
        super(type, price, description);
    }


    @Override
    public void showDetails() {
        System.out.println(super.toString()+this);
    }

    @Override
    public String toString() {
        return "Coke{" +
                "brand='" + brand + '\'' +
                '}';
    }


}
