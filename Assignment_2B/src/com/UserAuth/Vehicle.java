package com.UserAuth;

//Abstract Product
abstract class Vehicle {
 protected String type;

 public String getType() {
     return type;
 }

 public abstract void drive();
}

//Concrete Products
class Car extends Vehicle {
 public Car() {
     this.type = "Car";
 }

 @Override
 public void drive() {
     System.out.println("Driving a car!");
 }
}

class Bike extends Vehicle {
 public Bike() {
     this.type = "Bike";
 }

 @Override
 public void drive() {
     System.out.println("Riding a bike!");
 }
}

class Scooter extends Vehicle {
 public Scooter() {
     this.type = "Scooter";
 }

 @Override
 public void drive() {
     System.out.println("Riding a scooter!");
 }
}

//Creator
abstract class VehicleFactory {
 public abstract Vehicle createVehicle();
}

//Concrete Creators
class CarFactory extends VehicleFactory {
 @Override
 public Vehicle createVehicle() {
     return new Car();
 }
}

class BikeFactory extends VehicleFactory {
 @Override
 public Vehicle createVehicle() {
     return new Bike();
 }
}

class ScooterFactory extends VehicleFactory {
 @Override
 public Vehicle createVehicle() {
     return new Scooter();
 }
}
