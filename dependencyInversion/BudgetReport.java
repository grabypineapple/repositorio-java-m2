package dependencyInversion;

public class BudgetReport implements Entity
{
   // private MySQLDatabase database;
	private DataBase database;

    public BudgetReport()
    {
        this.database = (DataBase) new MySQLDatabase();
        // this.database = new MongoDB();
        //database.connect(database);
        database.connect("projects");
    }

    public void save() {
    	database.insert(this);

    }
}
