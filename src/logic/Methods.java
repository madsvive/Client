package logic;

import shared.*;

public class Methods {

	
	AuthUser user = new AuthUser();
	Connect CO = new Connect();

	public String login(String Username, String Password) throws Exception {
		try{
		user.setAuthUserEmail(Username);
		user.setAuthUserPassword(Password);
		String login = Username + Password;
		CO.Send(login);
		}catch (Exception e){
			System.out.println("login bliver ikke sendt til Server");
		}
		
		
		return CO.Recieve();
	}
}
