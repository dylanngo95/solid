package com.dylan.solid.ocp;

import java.util.List;

public class CartTotals {

    public double calculateCart(List<Product> products) {
        double orderTotal = 0;
        for (Product product: products) {
            orderTotal += product.getPrice();
        }
        return orderTotal;
    }
}
