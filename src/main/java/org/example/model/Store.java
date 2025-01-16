package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale chocolate=new Chocolate("150",10,"dark chocolate");
        ProductForSale coke=new Coke("100",20,"Orange Coke");
        ProductForSale bread=new Bread("50",30);

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