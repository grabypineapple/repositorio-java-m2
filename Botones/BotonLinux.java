package Botones;

public class BotonLinux implements Boton {	
	
	

	@Override
	public String onclick() {
		
		System.out.println("Estoy haciendo clik  linux");
		return "Click Boton Linux";
	}

	@Override
	public String  desable() {
		
		System.out.println("Boton Linux desable linux ");
		return "Boton Linux  desable";
	}

	@Override
	public String  enable() {
		System.out.println("Boton Linux desable  ");
		return "Boton Linux  enable";
	}
	
		
}
