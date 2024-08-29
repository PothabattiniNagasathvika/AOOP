package com.human;

public class Human implements Worker, Eater{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Human is working");
		
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Human is eating");
		
	}

}
