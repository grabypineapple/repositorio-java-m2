package furniture;

public class VictorianFurnitureFactory implements FurnitureFactory
{
    @Override
	public Sofa createSofa() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public Chair createChair()
    {
        return new VictorianChair();
    }

    @Override
    public Table createTable()
    {
        return new VictorianTable();
    }
}
