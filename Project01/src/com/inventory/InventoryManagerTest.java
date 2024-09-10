package com.inventory;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

// Mock Observer classes to test notifications
class MockWarehouseManager implements Observer {
    public boolean notified = false;
    @Override
    public void update(String event) {
        notified = true;
        System.out.println("Warehouse Manager notified of event: " + event);
    }
}

class MockSupplier implements Observer {
    public boolean notified = false;
    @Override
    public void update(String event) {
        notified = true;
        System.out.println("Supplier notified of event: " + event);
    }
}

class MockSalesTeam implements Observer {
    public boolean notified = false;
    @Override
    public void update(String event) {
        notified = true;
        System.out.println("Sales Team notified of event: " + event);
    }
}

public class InventoryManagerTest {
    private InventoryManager inventoryManager;
    private MockWarehouseManager warehouseManager;
    private MockSupplier supplier;
    private MockSalesTeam salesTeam;

    @Before
    public void setUp() {
        warehouseManager = new MockWarehouseManager();
        supplier = new MockSupplier();
        salesTeam = new MockSalesTeam();

        inventoryManager = new InventoryManager();
        inventoryManager.addObserver(warehouseManager);
        inventoryManager.addObserver(supplier);
        inventoryManager.addObserver(salesTeam);
    }

    // Test that all observers are notified
    @Test
    public void testInventoryEventNotifiesAllObservers() {
        inventoryManager.updateInventory("Stock low");
        assertTrue(warehouseManager.notified);
        assertTrue(supplier.notified);
        assertTrue(salesTeam.notified);
    }

    // Test that a restocking event is triggered
    @Test
    public void testLowStockTriggersRestocking() {
        inventoryManager.updateInventory("Low stock");
        assertTrue(supplier.notified);
    }

    // Test that order fulfillment notifies the sales team
    @Test
    public void testOrderFulfillmentNotifiesSalesTeam() {
        inventoryManager.updateInventory("Order fulfilled");
        assertTrue(salesTeam.notified);
    }
}
