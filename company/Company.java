package company;


public class Company 
{	
	private String nameCompany;
	
	
	public void makeCompany(OnMake onmake) {

		String tipoSoftware = onmake.desarrollaSoftware();
		//System.out.println(" desarrollaSoftware.... ");
	}
	
	public Company(String nameCompany) {
		
		this.nameCompany = nameCompany;
	}


	public String getNameCompany() {
		return nameCompany;
	}

	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}
	 

    
}
