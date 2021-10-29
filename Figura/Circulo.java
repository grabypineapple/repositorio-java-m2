package Figura;

public class Circulo extends Eclipse{

	@Override
	public double calculaArea() {
		
		//return Math.this.radioMayor * this.RadioMayor();
		return super.calculaArea();
	}

	public Circulo(double radio) {
		super(radio, radio);
		// TODO Auto-generated constructor stub
	}
	
	//private double radio;
	 

}
