package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost() {
		System.out.println("2lakhs");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speed() {
		System.out.println("200kmph");
		// TODO Auto-generated method stub
		cost();
		
	}
	public static void main(String[] args) {
		Ktm a = new Ktm();
		a.speed();
		
		System.out.println("kanishkar");
	}

}
