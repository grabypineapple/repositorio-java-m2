package transporte;

public class Transport {
	private Engine  engine; //interfaz
	private Driver driver;  //interfaz
	
	
	public Transport(Engine engine, Driver driver ) {
		this.driver = driver;
		this.engine = engine;
	}
	
	public void deliver(String destination, String cargo) {
		driver.navigate();
		engine.move();		
		System.out.println(cargo + "has been deliver at "+ destination);
	} 

}
