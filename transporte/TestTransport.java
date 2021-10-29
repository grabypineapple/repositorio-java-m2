package transporte;

public class TestTransport {

	public static void main(String[] args) {
		Engine engine= new ElectricEngine();
		Driver driver = new Robot();
		Engine persona = new  CombustionEngine();
		
		Transport transport = new Transport(engine,driver);
		transport.deliver("Toluca", "carga pesada");

	}

}
