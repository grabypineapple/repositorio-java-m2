package ValidaApp;

import java.util.Scanner;

import callCentre.ProblemStatus;
import callCentre.ProblemType;



public class ValidaIp extends  BaseAssistant {

	private Scanner answerScanner;

    public ValidaIp()
    {
        answerScanner = new Scanner(System.in);
    }

    public void handle(ValidationRequest validationRequest) {
        String answer;

        do {
            System.out.println("Validacion APP: Indica Tu IP  ");
            answer = answerScanner.next();
            
            if (answer.length() == 15) {
            	validationRequest.setEstatusValidacion("IP Correcta");            	 
                 super.handle(validationRequest);
                 break;
            	
            }else {
            	validationRequest.setEstatusValidacion("IP Incorrecta");
            	System.out.println("La iP proporcionado no cumple ...");
            	System.out.println("Quieres intenter de Nuevo ingresa un nuevo valor o  (N)? ");
            	
            }           

            answer = answerScanner.next();

            if (answer.equals("N")) {
            	validationRequest.setAutenticUser(AutenticUserPermissions.DESCONOCIDO);
            	validationRequest.setPermisosUser(PermissionsUser.DESCONOCIDO);            	
                break;
            }
            
        } while (true);
    }
}
