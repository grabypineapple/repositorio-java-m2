package Empleado;

public class GroundShipping implements Shipping{

	@Override
	public double getCost(Order order) {
		// TODO Auto-generated method stub
		return Double.max(10, order.getTotalWeight() * 1.5);
		//return 0;
	}

}
