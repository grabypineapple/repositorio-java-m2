package Figura;

public class Aplicacion {

	public static void main(String[] args) {
		
		  
		
			Figura Eclipse = new Eclipse(10,5);
			System.out.println(" "+ Eclipse.calculaArea());
			Figura circulo = new Circulo(7);
			System.out.println(" "+ circulo.calculaArea());
			
			Eclipse circulo2 = new Circulo(7);
			System.out.println(" "+ circulo.calculaArea());
						
	}

	public static void manejaElipse(Eclipse eclipse) {
		eclipse.setRadioMayor(10);
		eclipse.setRadioMenor(5);
		
		System.out.println(" "+ eclipse.getRadioMayor());
		System.out.println(" "+ eclipse.getRadioMenor());
		System.out.println("manejaEclipse "+ eclipse.calculaArea());
		
	}
}
