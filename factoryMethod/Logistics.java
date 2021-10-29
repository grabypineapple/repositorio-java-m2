package factoryMethod;

public abstract class Logistics {
	public void planDelivery() {
		Transporte transport = createTransporte();
		System.out.println("Setting de plain....");
		transport.deliver();
	}

	public abstract Transporte createTransporte();
}
