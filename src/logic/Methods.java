package logic;

import shared.*;
import com.google.gson.*;

public class Methods {

	static AuthUser user = new AuthUser();
	Connect CO = new Connect();
	Gson gson = new GsonBuilder().create();

	 public String logIn(String Username, String Password) throws Exception {
	 
	 user.setAuthUserEmail(Username);
	 user.setAuthUserPassword(encryptionAES.encrypt(Password));
	 String gsonString = gson.toJson(user);
	 
	
	
	 return CO.Recieve(gsonString);
	 }
}
