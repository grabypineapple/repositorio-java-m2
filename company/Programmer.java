package company;

import java.util.Date;

public class Programmer implements OnMake
{
	private String nameProject;
	private Date  dateCreation;
	
	
	public Programmer(String nameProject, Date dateCreation) {
		super();
		this.nameProject = nameProject;
		this.dateCreation = dateCreation;
	}

	@Override
	public String desarrollaSoftware() {		
		return "Here's the architecture for: ";
		
	}


	public String writeCode(String systemName) {
		// TODO Auto-generated method stub
		System.out.println("Programmer writeCode ... "+ systemName);
		return "writeCode :: "+systemName;
	}


	public String getNameProject() {
		return nameProject;
	}


	public void setNameProject(String nameProject) {
		this.nameProject = nameProject;
	}


	public Date getDateCreation() {
		return dateCreation;
	}


	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
    
}
