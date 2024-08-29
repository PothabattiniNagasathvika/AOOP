package com.Weapon;

//Abstract Product
abstract class Enemy {
 protected String type;

 public String getType() {
     return type;
 }

 public abstract void attack();
}

//Concrete Products
class EasyEnemy extends Enemy {
 public EasyEnemy() {
     this.type = "Easy Enemy";
 }

 @Override
 public void attack() {
     System.out.println("Easy Enemy attacks!");
 }
}

class HardEnemy extends Enemy {
 public HardEnemy() {
     this.type = "Hard Enemy";
 }

 @Override
 public void attack() {
     System.out.println("Hard Enemy attacks fiercely!");
 }
}

//Creator
abstract class EnemyFactory {
 public abstract Enemy createEnemy();
}

//Concrete Creators
class EasyEnemyFactory extends EnemyFactory {
 @Override
 public Enemy createEnemy() {
     return new EasyEnemy();
 }
}

class HardEnemyFactory extends EnemyFactory {
 @Override
 public Enemy createEnemy() {
     return new HardEnemy();
 }
}

