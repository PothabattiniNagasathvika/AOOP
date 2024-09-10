package com.inventory;

public class WarehouseManager implements Observer {
    @Override
    public void update(String event) {
        System.out.println("Warehouse Manager: Notified of event - " + event);
    }
}
