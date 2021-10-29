package encapsulacion;

import java.util.ArrayList;

public class Order {
	private ArrayList<Item> items = new ArrayList<Item>();
	private String country;
	
	
	
	
	public Order(String country2) {
		// TODO Auto-generated constructor stub
	}

	public double getTotal() {
		double total =0;
		for(Item item:items) {
			total += item.getPrice()* item.getQuantity(); 
		}
		total += total * getTaxRate();
		return total;
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
	public void addItem(Item item) {
		items.add(item);
	}
	
	public String getCountry() {
	
		return country;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	}