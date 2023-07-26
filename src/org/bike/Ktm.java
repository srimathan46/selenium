package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost() {
		System.out.println("Ktm Bike cost 2lac");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speed() {
		System.out.println("Speed of bike 140");
		
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Ktm k = new Ktm();
		k.cost();
		k.speed();
		
	}
	
	

}
