package gui;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;

@SuppressWarnings("serial")
public class ScreenCalendar extends JFrame {

	// Variabels
	public static final String LOGIN = "login";
	public static final String WEEKVIEW = "weekview";
	public static final String DAYVIEW = "dayview";
	private JPanel contentPane;
	private final LogIn login = new LogIn();
	private final WeekView WeekView = new WeekView();
	private final DayView DayView = new DayView();
	CardLayout c;

	/**
	 * Create the frame.
	 */
	public ScreenCalendar() {
		setSize(new Dimension(1366, 700));
		setPreferredSize(new Dimension(1366, 700));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);

		// Setting contentpane
		contentPane = (JPanel) this.getContentPane();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		this.setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		// Adding panels to contentpane
		contentPane.add(login, "login");		
		contentPane.add(WeekView, "weekview");
		contentPane.add(DayView, "dayview");
		c = (CardLayout) getContentPane().getLayout();

	}

	// Getters
	public LogIn getLogIn() {
		return login;
	}

	public WeekView getWeekView() {
		return WeekView;
	}

	public DayView getDayView() {
		return DayView;
	}

	public void show(String card) {
		c.show(getContentPane(), card);
	}
}
