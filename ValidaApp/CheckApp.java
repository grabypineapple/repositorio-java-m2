package ValidaApp;

import java.util.Scanner;

public class CheckApp {

	public static void main(String[] args) {
		
		Assistant validaIp = new ValidaIp();
		Assistant validaUser = new ValidaUser();
		
		validaIp.setNext(validaUser);
		//validaUser.setNext(validaUser);
	      

		ValidationRequest validationRequest;

	        Scanner answerScanner = new Scanner(System.in);

	        System.out.println("Bienvenida Validacion  de App ");
	        System.out.println("Ingresa tu nombre:  ");
	        String user = answerScanner.next();
	        

	        validationRequest = new ValidationRequest(user);
	        
	        validaIp.handle(validationRequest);

	        System.out.println(validationRequest);

	}

}
