package com.human;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Worker robot = new Robot();
	        Worker humanWorker = new Human();
	        Eater humanEater = new Human();

	        robot.work();
	        humanWorker.work();
	        humanEater.eat();

	}

}
