package com.inventory;

public class InventoryManager extends InventoryUpdaterTemplate {
    private Observable observable = new Observable();

    public void addObserver(Observer observer) {
        observable.addObserver(observer);
    }

    @Override
    protected void handleInventoryEvent(String event) {
        System.out.println("Handling inventory event: " + event);
        if (event.equals("Low stock")) {
            System.out.println("Triggering restock...");
        } else if (event.equals("Order fulfilled")) {
            System.out.println("Updating inventory for order fulfillment...");
        }
    }

    @Override
    protected void notifyStakeholders(String event) {
        observable.notifyObservers(event);
    }

	public void addObserver(WarehouseManager observer) {
		// TODO Auto-generated method stub
		
	}
}
