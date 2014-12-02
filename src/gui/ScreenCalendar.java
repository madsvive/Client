package gui;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ScreenCalendar extends JFrame {

	// Variabels
	private JPanel contentPane;
	private final Login login = new Login();
	private final WeekView weekview = new WeekView();
	/**
	 * Create the frame.
	 */
	public ScreenCalendar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		// Setting contentpane
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new CardLayout(0, 0));
		setContentPane(contentPane);

		// Adding panels to contentpane
		contentPane.add(login);
		contentPane.add(weekview);
	}

	// Getters
	public Login getLogin() {
		return login;
	}
	public WeekView getWeekView(){
		return weekview;
	}
}
