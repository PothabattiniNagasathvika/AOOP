package com.UserAuth;

public class RideSharingApp {
    private UserAuth userAuth;
    private VehicleFactory vehicleFactory;
    private PaymentFactory paymentFactory;

    public RideSharingApp() {
        userAuth = UserAuth.getInstance();
    }

    // Method to authenticate the user
    public void authenticateUser(String username) {
        userAuth.login(username);
        System.out.println(username + " logged in.");
    }

    // Method to request a ride
    public void requestRide(String vehicleType) {
        if (!userAuth.isAuthenticated()) {
            System.out.println("Please log in to request a ride.");
            return;
        }

        switch (vehicleType) {
            case "Car":
                vehicleFactory = new CarFactory();
                break;
            case "Bike":
                vehicleFactory = new BikeFactory();
                break;
            case "Scooter":
                vehicleFactory = new ScooterFactory();
                break;
            default:
                System.out.println("Invalid vehicle type.");
                return;
        }

        Vehicle vehicle = vehicleFactory.createVehicle();
        System.out.println("Requested a ride: " + vehicle.getType());
        vehicle.drive();
    }

    // Method to process payment
    public void processPayment(String paymentType) {
        if (!userAuth.isAuthenticated()) {
            System.out.println("Please log in to process payment.");
            return;
        }

        switch (paymentType) {
            case "CreditCard":
                paymentFactory = new CreditCardFactory();
                break;
            case "PayPal":
                paymentFactory = new PayPalFactory();
                break;
            default:
                System.out.println("Invalid payment method.");
                return;
        }

        PaymentMethod paymentMethod = paymentFactory.createPaymentMethod();
        paymentMethod.processPayment();
    }

    public static void main(String[] args) {
        RideSharingApp app = new RideSharingApp();

        // User authentication
        app.authenticateUser("Alice");

        // Requesting rides
        app.requestRide("Car");
        app.requestRide("Bike");

        // Processing payments
        app.processPayment("CreditCard");
        app.processPayment("PayPal");

        // Log out
        UserAuth.getInstance().logout();
    }
}

