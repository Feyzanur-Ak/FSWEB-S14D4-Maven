package org.example.model;

public abstract class ProductForSale {

    private  String type;
    private double price;
    private String description;




    public ProductForSale(String type,double price, String description) {
        this.price = price;
        this.description = description;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public double getSalesPrice(int quantity){
        return quantity*price;
    }

    public  final void printHello(){ /* final keywodünü koyduğumuz için
       override edemez ama kullanma ihtiyacı olunca kullanabilir */
        System.out.println("Hello");
    }

    public abstract void showDetails(); // childlar kesinlikle override etmeli

    @Override
    public String toString() {
        return "ProductForSale{" +
                ", type='" + type + '\'' +
                "price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

}
