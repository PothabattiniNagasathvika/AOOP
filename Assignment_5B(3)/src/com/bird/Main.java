package com.bird;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bird bird = new Bird();
	        Ostrich ostrich = new Ostrich();

	        bird.fly(); // Works fine

	        try {
	            ostrich.fly(); // Throws exception
	        } catch (UnsupportedOperationException e) {
	            System.out.println(e.getMessage());
	        }

	}

}
