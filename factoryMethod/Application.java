package factoryMethod;
import java.util.*;
public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese forma de envio plane/ship/truck");
		String modoEnvio;
		modoEnvio = sc.nextLine();
		
		if (modoEnvio.equals("plane")) {
			AirPlane  envioAvion=  new AirPlane();		
			envioAvion.deliver();
		}
		else if(modoEnvio.equals("ship")) {
			Ship envioShip = new Ship();
			envioShip.deliver();
		}else if(modoEnvio.equals("truck")) {
			Truck envioTruck = new Truck();
			envioTruck.deliver();
			
		}else
			System.out.println("El tipo de envio no es valido ");
	
		sc.close();
		
		
	}

}
