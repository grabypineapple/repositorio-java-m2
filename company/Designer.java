package company;

import java.util.*;

public class Designer implements OnMake{
	private String nameProject;
	private Date  dateCreation;
	
	
	
	public Designer(String nameProject, Date dateCreation) {
		super();
		this.nameProject = nameProject;
		this.dateCreation = dateCreation;
	}

    public String designArchitecture(String systemName) {
    	System.out .println("Here's the architecture for: " + systemName + "\n");
        return "The architecture design: " + systemName + "\n";
    }
    
    
    @Override
	public String desarrollaSoftware() {
		// TODO Auto-generated method stub
    	System.out.print("desarrollo software");
    	
		return "desarrollo software";
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
