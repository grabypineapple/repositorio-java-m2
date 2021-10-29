package company;

import java.util.Date;

public class Tester  implements OnMake 
{
	private String nameProject;
	private Date  dateCreation;
	
	public Tester(String nameProject, Date dateCreation) {
		super();
		this.nameProject = nameProject;
		this.dateCreation = dateCreation;
	}

	@Override
	public String desarrollaSoftware() {
		// TODO Auto-generated method stub
		return null;
	}


	
	public String testSoftware(String systemName) {
		
		System.out.println("Tester test  ... "+ systemName);
		
		return "testSoftware :: "+systemName;		
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
