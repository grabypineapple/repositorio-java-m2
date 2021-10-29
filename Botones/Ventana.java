package Botones;

public abstract class Ventana  {

	
	public abstract Boton crearBoton();

	public String  dibujar() {
		Boton boton = crearBoton();
		boton.onclick();
		
		return "Crea un Boton ";
	}
}
