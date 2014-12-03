package logic;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import shared.*;
import gui.ScreenCalendar;


public class Actionhandler {
	private ScreenCalendar Screen;
//	private AuthenticateUser au;  
	
	public Actionhandler() {
	Screen.getLogin().addActionListener(new LoginActionListener());
}
	private class LoginActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String userName = Screen.getLogin().getTextFieldUsername().getText();
			String password = Screen.getLogin().getTextFieldPassword().getText();
			
		try {
//			if(au.authenticate(userName, password, true) == 0){
			System.out.println("login succesfull");
			Screen.show(Screen.WEEKVIEW);
//			}
		} catch (Exception e1) {
			System.out.println("Login Unsuccesfull");
			e1.printStackTrace();
		}
		}
	}

}
