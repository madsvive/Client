package logic;

import shared.*;

public class Methods {

	
	AuthUser user = new AuthUser();
	Connect CO = new Connect();

	public String login(String Username, String Password) throws Exception {

		user.setAuthUserEmail(Username);
		user.setAuthUserPassword(Password);
		String login = Username + Password;
		CO.Send(login);
		return CO.Recieve();
	}
}
