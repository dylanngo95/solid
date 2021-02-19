package com.dylan.solid.ocp;

public class Car implements Product {

    private String name;

    private static final int weight = 500;

    private int basePrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPrice() {
        return weight * this.basePrice;
    }

    @Override
    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

}
