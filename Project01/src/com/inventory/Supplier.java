package com.inventory;

public class Supplier implements Observer {
    @Override
    public void update(String event) {
        System.out.println("Supplier: Notified of event - " + event);
    }
}
