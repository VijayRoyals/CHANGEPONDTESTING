package Local;

public class AmazonCreateAnAccountPage {

	
	
	public String YourName(String firstnm, String Lastnm) { 
		return ("Firstnm" + "Lastnm"); 
	}
	
	public String MobNOAndEmail(String expectedMobNo, String EmailID) { 
		return(expectedMobNo +  "EmailID"); 
	}
	
	public boolean CheckPassword(String pass) { 
		return pass.length() ==6; 
		
	}
	public boolean clickContinue(String name, String email, String password) { 
		return true; 
	}
}
