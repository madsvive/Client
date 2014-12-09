package shared;

public class AuthUser implements java.io.Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String overallID = "logIn";
	private String email ="";
	private String password ="";
	private boolean isAdmin; 
	
	//Getters and setters for everything, bitch
	public String getOverallID() {
		return overallID;
	}
	public void setOverallID(String overallID) {
		this.overallID = overallID;
	}
	public String getAuthUserEmail() {
		return email;
	}
	public void setAuthUserEmail(String email) {
		this.email = email;
	}
	public String getAuthUserPassword() {
		return password;
	}
	public void setAuthUserPassword(String password) {
		this.password = password;
	}
	public boolean isisAdmin() {
		return isAdmin;
	}
	public void setisAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

}