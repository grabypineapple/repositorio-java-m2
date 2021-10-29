package openClosed;
import java.util.*;
public class Orden2 {
	
	private ArrayList<Item> items = new ArrayList<>();
	private String country;
	private String shipping;
	
	public Orden2(String country) {
		super();
		this.country = country;
	}
	
	public double getTotal() {
        double total = 0;

        for (Item item: items) {
            total += item.getPrice() * item.getQuantity();
        }

        total += total * getTaxRate();

        return total;
    }

    public double getTotalWeight() {
        double weight = 0;

        for (Item item: items) {
            weight += item.getWeight();
        }

        return weight;
    }

    public double getShippingCost() {
        if (shipping == "ground") {
            if (getTotal() > 100) {
                return 0;
            }

            return Double.max(10, getTotalWeight() * 1.5);
        }

        if (shipping == "air") {
            return Double.max(20, getTotalWeight() * 3);
        }

        if (shipping == "sea") {
            return Double.max(15, getTotalWeight() * 2);
        }

        return 0;
    }

        public double getTaxRate() {
            if (country == "MX") {
                return 0.16;
            }
            else if (country == "US") {
                return 0.07;
            }
            else if (country == "EU") {
                return 0.20;
            }
            else {
                return 0;
            }
        }


	
	

}
