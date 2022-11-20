package de.juwi.pattern.printsupport.model;

public class B extends AbstractObject {
	private int id;
	private Sub sub = new Sub();

	public int getId() {
		return id;
	}
	
	public Sub getSub() {
		return sub;
	}	
	
	public class Sub {
		private double amount;
		public double getAmount() {
			return amount;
		}
		
	}
	
}
