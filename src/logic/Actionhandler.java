package logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import gui.ScreenCalendar;

public class Actionhandler {
	private ScreenCalendar screen;
	private Methods M;

	// private AuthenticateUser au;

	public Actionhandler() {
		screen = new ScreenCalendar();
		screen.getLogIn().addActionListener(new LogInActionListener());
	}

	public void run() {
		screen.show(ScreenCalendar.LOGIN);
		screen.setVisible(true);
	}

	public class LogInActionListener implements ActionListener {
		public void actionPerformed(ActionEvent l) {
			System.out.println("virker det");
			try {
				String userName = screen.getLogIn().getTextFieldUsername()
						.getText();
				String password = screen.getLogIn().getTextFieldPassword()
						.getText();
				String reply = M.login(userName, password);
				System.out.println(reply);
				System.out.println("er vi her");
					if (reply == "1") {
						System.out.println("login succesfull");
						screen.show(ScreenCalendar.WEEKVIEW);
						// }
					} else {
						System.out.println("Not logged in");
					}
				
			} catch (Exception e3) {
			}
		}
	}

}
