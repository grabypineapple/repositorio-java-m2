package Empleado;

import java.util.*;
public class Order {
	private ArrayList<Item> items = new ArrayList<Item>();
	private String country;
	private Shipping shipping;
	
	public Order(String country, Shipping shipping) {
		this.country = country;
		this.shipping = shipping;
	}
	
	public double getTotal() {
		double total =0;
		for(Item item:items) {
			total += item.getPrice()* item.getQuantity(); 
		}
		total += total * getTaxRate();
		return total;
	}
	public double getTotalWeight() {
		double weight =0;
		for (Item item: items ) {
			weight += item.getWeight();
		}
		return weight;
	}
	
	public double getTaxRate() {
		if(country == "MX") {
			return 0.16;		
		}
		else if(country == "US") {
			return 0.07;
		}
		else if(country == "EU") {
			return 8.28;
		}
		else {
			return 0;
		}
	} 
	
	

	public double getShippingCosto() {
		double costo=0;
		
		//shipping.getCost(this);
		return costo;
	}
	
	public double getCost(Order order) {
		double costo=0; 
		
		return costo;
	}
	public void addItem(Item item) {
		items.add(item);
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Shipping getShipping() {
		return shipping;
	}

	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}
	
}
