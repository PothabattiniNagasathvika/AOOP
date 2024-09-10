package com.inventory;

public abstract class InventoryUpdaterTemplate {
    public final void updateInventory(String event) {
        handleInventoryEvent(event);
        notifyStakeholders(event);
    }

    protected abstract void handleInventoryEvent(String event);
    protected abstract void notifyStakeholders(String event);
}
