package com.technology.markt.domain;

import javax.persistence.*;
import java.util.List;

@MappedSuperclass
public abstract class Devices {

    @Column(name="brand")
    private String brand;

    @Column(name="name")
    private String name;

    @Column(name="os")
    private String os;

    @Column(name="production_year")
    private int productionYear;

    @Column(name="color")
    private String color;

    @Column(name="screen_size")
    private double screenSize;


    public Devices() {
    }

    public Devices(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

}
