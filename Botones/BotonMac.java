package Botones;

public class  BotonMac implements Boton  {

	@Override
	public String onclick() {
		System.out.println("Estoy haciendo clik MAC");
		return "Click Boton MAC";
	}

	@Override
	public String desable() {
		System.out.println("Boton desable  MAC");
		return " Boton desable MAC";
	}

	@Override
	public String enable() {
		System.out.println("Boton enable  MAC");
		return " Boton enable MAC";
	}

}
