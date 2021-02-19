package com.dylan.solid.lsp;

public class Customer extends Member {
    @Override
    public void book() {
        System.out.print("User booking");
    }

    @Override
    public void addToDatabase() {
        System.out.print("User was add to database");
    }
}
