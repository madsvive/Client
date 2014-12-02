package gui;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ScreenCalendar extends JFrame {

	private JPanel contentPane;
	private final Login login = new Login();
	/**
	 * Create the frame.
	 */
	public ScreenCalendar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		contentPane.add(login, login);
	}
	public Login getLogin(){
		return login;
	}
}
