package dependencyInversion;

public class MongoDBConnetion {
	private String database;
	
	public MongoDBConnetion(String database) {
		super();
		this.database = database;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}


	
	
}
