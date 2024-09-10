package com.inventory;

public class Main {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();

        // Register stakeholders
        inventoryManager.addObserver(new WarehouseManager());
        inventoryManager.addObserver(new Supplier());
        inventoryManager.addObserver(new SalesTeam());

        // Simulate inventory events
        inventoryManager.updateInventory("Stock low");
        inventoryManager.updateInventory("Order fulfilled");
    }
}
