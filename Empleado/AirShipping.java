package Empleado;

public class AirShipping implements Shipping {

	@Override
	public double getCost(Order order) {
		// TODO Auto-generated method stub
		return Double.max(17, order.getTotalWeight()*2);
	}

}
