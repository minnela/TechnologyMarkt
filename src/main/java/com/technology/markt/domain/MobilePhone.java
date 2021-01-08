package com.technology.markt.domain;


import javax.persistence.*;

@Entity
public class MobilePhone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="brand")
    private String brand;

    @Column(name="production_year")
    private int productionYear;

    @Column(name="screen_size")
    private double screenSize;

    @Column(name="os")
    private String os;

    @Column(name="color")
    private String color;

    public MobilePhone(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public MobilePhone() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
