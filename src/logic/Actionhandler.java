package logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.ScreenCalendar;

public class Actionhandler {
	private ScreenCalendar screen;

	// private Methods M;

	// private AuthenticateUser au;

	public Actionhandler() {
		screen = new ScreenCalendar();
		screen.getWeekView().addActionListener(new WeekViewActionListener());
		screen.getDayView().addActionListener(new DayViewActionListener());
		screen.getLogIn().addActionListener(new LogInActionListener());
		
		
	}

	public void run() {
		screen.show(ScreenCalendar.LOGIN);
		screen.setVisible(true);
	}

	public class LogInActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("virker det");
			try {
				// String userName = screen.getLogIn().getTextFieldUsername()
				// .getText();
				// @SuppressWarnings("deprecation")
				// String password = screen.getLogIn().getTextFieldPassword()
				// .getText();
				// String reply = M.logIn(userName, password);
				// System.out.println(reply);
				// System.out.println("login succesfull");
				screen.show(ScreenCalendar.DAYVIEW);
				// }

			} catch (Exception e3) {
			}
		}
	}

	public class DayViewActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				if (e.getSource() == screen.getDayView().getBtnWeekView()) {
					screen.show(ScreenCalendar.WEEKVIEW);
				}
			} catch (Exception e1) {

			}
		}
	}

	public class WeekViewActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				if (e.getSource() == screen.getDayView().getBtnWeekView()) {
					screen.show(ScreenCalendar.DAYVIEW);

				}
			} catch (Exception e1) {
			}
		}
	}
}