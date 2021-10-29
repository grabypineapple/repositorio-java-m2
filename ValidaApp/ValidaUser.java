package ValidaApp;

import java.util.Scanner;

import callCentre.HelpDeskRequest;
import callCentre.ProblemStatus;
import callCentre.ProblemType;

public class ValidaUser extends BaseAssistant {
    private Scanner answerScanner;

    public ValidaUser()
    {
        answerScanner = new Scanner(System.in);
    }

    public void handle(ValidationRequest validationRequest) {
        String answer;

        do {
            System.out.println("Ingresa usuario");
            answer = answerScanner.next();

            if (answer.equals("root")) {
            	validationRequest.setAutenticUser(AutenticUserPermissions.AUTENTICADO);
               // super.handle(validationRequest);
                //break;
            }

            System.out.println("Ingresa Password");
            //System.out.println("Was the problem solved (Y/N)? ");
            answer = answerScanner.next();

            if (!answer.equals("1234")) {
            	validationRequest.setAutenticUser(AutenticUserPermissions.NOAUTENTICADO);
                                
                break;
            }else {
            	validationRequest.setAutenticUser(AutenticUserPermissions.AUTENTICADO);
            	System.out.println(" Se encuentra autorizado para realizar cambios");
            	break;
            }
            	
        } while (true);
    }
}
