package furniture;

public class ModernFurnitureFactory implements FurnitureFactory
{
    @Override
	public Sofa createSofa() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public Chair createChair()
    {
        return new ModernChair();
    }

    @Override
    public Table createTable()
    {
        return new ModernTable();
    }
}
