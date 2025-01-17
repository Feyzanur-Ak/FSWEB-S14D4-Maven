package org.example.model;

public class Chocolate extends ProductForSale {

    private  double chocolateRatio;


    public Chocolate(String type, double price, String description,double chocolateRatio) {
        super(type, price, description);
        this.chocolateRatio=chocolateRatio;
    }

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }


    @Override
    public void showDetails() {
        System.out.println(super.toString()+this);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "chocolateRatio=" + chocolateRatio +
                '}';
    }

}
