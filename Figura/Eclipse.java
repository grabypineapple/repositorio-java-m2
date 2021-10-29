package Figura;

public class Eclipse implements Figura {
	private double radioMayor;
	private double radioMenor;
	
	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return  Math.PI * radioMayor * radioMenor;
		
	}


	
	public Eclipse(double radioMayor, double radioMenor) {
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
		
	}



	public double getRadioMayor() {
		return radioMayor;
	}



	public void setRadioMayor(double radioMayor) {
		this.radioMayor = radioMayor;
	}



	public double getRadioMenor() {
		return radioMenor;
	}



	public void setRadioMenor(double radioMenor) {
		this.radioMenor = radioMenor;
	}
}
