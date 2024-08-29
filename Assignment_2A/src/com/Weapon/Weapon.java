package com.Weapon;

//Abstract Products
interface Weapon {
 void use();
}

interface PowerUp {
 void activate();
}

//Concrete Products
class Sword implements Weapon {
 @Override
 public void use() {
     System.out.println("Swinging sword!");
 }
}

class LaserGun implements Weapon {
 @Override
 public void use() {
     System.out.println("Firing laser gun!");
 }
}

class HealthPack implements PowerUp {
 @Override
 public void activate() {
     System.out.println("Health pack used!");
 }
}

class Shield implements PowerUp {
 @Override
 public void activate() {
     System.out.println("Shield activated!");
 }
}

//Abstract Factory
interface GameItemFactory {
 Weapon createWeapon();
 PowerUp createPowerUp();
}

//Concrete Factories
class EasyGameItemFactory implements GameItemFactory {
 @Override
 public Weapon createWeapon() {
     return new Sword();
 }

 @Override
 public PowerUp createPowerUp() {
     return new HealthPack();
 }
}

class HardGameItemFactory implements GameItemFactory {
 @Override
 public Weapon createWeapon() {
     return new LaserGun();
 }

 @Override
 public PowerUp createPowerUp() {
     return new Shield();
 }
}
