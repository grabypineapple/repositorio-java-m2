package encapsulacion;


public class TestOrder {

	public static void main(String[] args) {
		
		Item funkoPopMarx = new Item(1,569.98,158);
		Item funkoPopHegel = new Item(1,569.98,158);
		
		Order order = new Order("MX");
		order.addItem(funkoPopMarx);
		order.addItem(funkoPopHegel);
		
		System.out.println("Total a pagar MX " + order.getTotal() );
		
		order.setCountry("US");
		System.out.println("Total a pagar US " + order.getTotal() );
		
		order.setCountry("EU");
		System.out.println("Total a pagar EU " + order.getTotal() );

	}

}
