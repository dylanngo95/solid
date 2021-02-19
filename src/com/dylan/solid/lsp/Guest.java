package com.dylan.solid.lsp;

public class Guest implements IDatabase {
    @Override
    public void addToDatabase() {
        System.out.print("Guest was add to database");
    }
}
