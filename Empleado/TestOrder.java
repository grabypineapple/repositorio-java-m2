package Empleado;

public class TestOrder {

	public static void main(String[] args) {
		Item funkoPopMarx = new Item(1,569.98,158,2);
		Item funkoPopHegel = new Item(1,569.98,158,3);
		Item pin = new Item(3,55.90,8.5,1);
		
		Shipping groupShipping = new GroundShipping();
		Shipping airShipping = new AirShipping();
		Shipping seaShipping = new SeaShipping();
		
		Order orden = new Order("MX",groupShipping);
		
		orden.addItem(pin);
		System.out.println("Costo de envio en MX compravpequeña por tierra : "+orden.getShippingCosto() );
		
		
		orden.setShipping(airShipping); // se cambia a compra por aire
		System.out.println("Costo de envio en MX compravpequeña por aire : "+orden.getShippingCosto() );
		 
		orden.addItem(funkoPopMarx); // se agrega producto 
		orden.addItem(funkoPopHegel); // se agrega otro producto
		
		System.out.println("Costo de envio en MX compravpequeña por aire : "+orden.getShippingCosto() );
		
		orden.setShipping(groupShipping); // se cambia 
		
		System.out.println("Costo de envio en MX compravpequeña por tierra : "+orden.getShippingCosto() );
		
		
		

	}

}
