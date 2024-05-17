package org.learning.shop;

public class Product {
    private int code;
    private String name;
    private String description;
    private double price;
    private double iva;

    public Product(){
        code = ((int)(Math.random()*100000)+1);

    }

    public String getCode() {

        return String.format("%06d",code);

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public double getIva() {
        return iva;
    }

    public double getPriceWithIva(){
        return  ((price * iva) / 100)+price;
    }

    public String getFullName(){
        return name + "-" + String.format("%06d",code);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }
}
