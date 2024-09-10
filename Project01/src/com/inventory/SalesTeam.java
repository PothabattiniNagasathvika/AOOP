package com.inventory;

public class SalesTeam implements Observer {
    @Override
    public void update(String event) {
        System.out.println("Sales Team: Notified of event - " + event);
    }
}
