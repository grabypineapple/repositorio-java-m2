package dependencyInversion;

public class MongoDB implements DataBase {
	
	MongoDBConnetion connection;
	
	public MongoDB(MongoDBConnetion connection) {
		
		this.connection = connection;
	}
	
	
	public void connect(String database) {
		connection = new MongoDBConnetion(database);
	}
	
	public void insert(Entity entity) {
		System.out.println("insert "+ entity+ " Usando MOngo "+connection.getDatabase());
	}
	public void update(Entity entity) {
		System.out.println("update "+ entity+ " Usando MOngo "+connection.getDatabase());
	}
	
	public void delete(Entity entity) {
		System.out.println("delete "+ entity+ " Usando MOngo "+connection.getDatabase());
	}
	public void desconnet() {
		connection=null;
	}
	

}
