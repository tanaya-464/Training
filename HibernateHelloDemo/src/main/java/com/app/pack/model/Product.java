package com.app.pack.model;


import jakarta.persistence.*;

@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int prid;
    @Column
    private String prname;
    @Column
    private double price;

    public Product() {
    }

    public Product(double price, String prname) {
        super();
        this.price = price;
        this.prname = prname;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prid=" + prid +
                ", prname='" + prname + '\'' +
                ", price=" + price +
                '}';
    }

    public int getPrid() {
        return prid;
    }

    public void setPrid(int prid) {
        this.prid = prid;
    }

    public String getPrname() {
        return prname;
    }

    public void setPrname(String prname) {
        this.prname = prname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
