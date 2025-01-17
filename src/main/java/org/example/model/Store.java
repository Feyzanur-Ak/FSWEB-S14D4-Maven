package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale chocolate=new Chocolate("Sweet Chocolate",150,"dark chocolate");
        ProductForSale coke=new Coke("Cola Turka",100,"Orange Coke");
        ProductForSale bread=new Bread("Wheat Brad",50,"Bread");

        ProductForSale[]products={chocolate,coke,bread};

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println("--------------------");
        }
    }
}