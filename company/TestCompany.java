package company;

import java.util.Date;

public class TestCompany
{
    public static void main(String[] args) {
    	 Company games = new Company("GamesFactory");
    	 Date creationDate = new Date();
    	
    	 Programmer programer = new  Programmer("Buscaminas", creationDate);
    	 Designer disigner = new  Designer("imagenes ", creationDate);
    	 Tester Tester = new  Tester("pruebas ", creationDate);
    	 
    	 programer.writeCode(games.getNameCompany());    	 
    	 disigner.designArchitecture("Del juego ");
    	 Tester.testSoftware("pruebas realizadas ");
    	 
    	 games.makeCompany(Tester);
    	 games.makeCompany(programer);
    	 games.makeCompany(disigner);

    	
       
    }
}
