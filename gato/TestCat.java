package gato;
import java.util.*;
public class TestCat {

	public static void main(String[] args) {
		Cat benito = new Cat("Benito");
		Date expiration= new Date();
		
		Sausage sausage = new Sausage(2.3,"rosa", expiration);
		Fish fish = new Fish(5.7,"salmon",expiration);
		Croquetas croquetas = new Croquetas(2.3, "colores",expiration);
		//
		System.out.println("Benito no ha comido"+ benito.getEnergy());
		benito.eat(sausage);
		benito.eat(fish);
		benito.eat(croquetas);
		System.out.println("Benito  comido"+ benito.getEnergy());
	}

}
