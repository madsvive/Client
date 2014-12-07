package gui;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.Panel;
import java.awt.Color;

@SuppressWarnings("serial")
public class WeekView extends JPanel {
	private JTable table;
	private JTable table_1;

	// Week of QOTD skal sættes korrekt
	private String Week;
	private String QOTD;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;
	private JTable table_6;
	private JTable table_7;

	/**
	 * Create the panel.
	 */
	public WeekView() {
		setSize(new Dimension(1366, 768));
		setLayout(null);
		
		// QOTD contianer and with QOTD labels
		JPanel QOTD_container = new JPanel();
		QOTD_container.setBounds(0, 5, 1366, 25);
		QOTD_container.setPreferredSize(new Dimension(1366, 25));
		add(QOTD_container);

		JLabel lblQOTDHeadline = new JLabel("Quote Of The Day:");
		QOTD_container.add(lblQOTDHeadline);

		JLabel lblQOTD = new JLabel(QOTD);
		lblQOTD.setAlignmentX(Component.CENTER_ALIGNMENT);
		QOTD_container.add(lblQOTD);
		lblQOTD.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));

		// Menu container inlcuding next, previous & dayview buttons
		JPanel Menu_container = new JPanel();
		Menu_container.setLocation(494, 35);
		Menu_container.setMinimumSize(new Dimension(1366, 100));
		Menu_container.setSize(new Dimension(363, 37));
		add(Menu_container);

		JButton btnNewButton = new JButton("Day View");
		btnNewButton
				.setIcon(new ImageIcon(
						WeekView.class
								.getResource("/com/sun/java/swing/plaf/windows/icons/DetailsView.gif")));
		Menu_container.add(btnNewButton);

		JButton btnPrevious = new JButton("Previous");
		btnPrevious
				.setIcon(new ImageIcon(
						WeekView.class
								.getResource("/javax/swing/plaf/metal/icons/ocean/collapsed.gif")));
		Menu_container.add(btnPrevious);

		JMenuItem mntmNewMenuItem = new JMenuItem("Year");
		Menu_container.add(mntmNewMenuItem);

		JButton btnNext = new JButton("Next");
		btnNext.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		btnNext.setIcon(new ImageIcon(
				WeekView.class
						.getResource("/javax/swing/plaf/metal/icons/ocean/collapsed-rtl.gif")));
		Menu_container.add(btnNext);

		// day contianer indeholder dagene i kalenderen
		JPanel Day_container = new JPanel();
		Day_container.setBounds(10, 76, 1346, 662);
		add(Day_container);
		Day_container.setLayout(null);

		// Week skal sættes til nuværende uge
		JLabel WeekNumber = new JLabel(Week);
		WeekNumber.setBounds(668, 10, 0, 0);
		Day_container.add(WeekNumber);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 101, 1326, 100);
		Day_container.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("8 September");
		lblNewLabel.setBounds(10, 0, 174, 23);
		panel.add(lblNewLabel);
		
		table_2 = new JTable();
		table_2.setBackground(Color.WHITE);
		table_2.setColumnSelectionAllowed(true);
		table_2.setBounds(10, 81, 1306, -47);
		panel.add(table_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 201, 1326, 100);
		Day_container.add(panel_1);
		
		table_3 = new JTable();
		table_3.setBounds(10, 74, 1306, -51);
		panel_1.add(table_3);
		
		JLabel lblSeptember = new JLabel("9 September");
		lblSeptember.setBounds(10, 0, 174, 23);
		panel_1.add(lblSeptember);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(0, 0, 1326, 100);
		Day_container.add(panel_4);
		
		table_5 = new JTable();
		table_5.setBounds(10, 82, 1306, -53);
		panel_4.add(table_5);
		
		JLabel label_1 = new JLabel("9 September");
		label_1.setBounds(10, 0, 174, 23);
		panel_4.add(label_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 301, 1326, 100);
		Day_container.add(panel_3);
		panel_3.setLayout(null);
		
		table_4 = new JTable();
		table_4.setBounds(10, 83, 1306, -60);
		panel_3.add(table_4);
		
		JLabel label = new JLabel("7 September");
		label.setBounds(10, 0, 174, 23);
		panel_3.add(label);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 400, 1326, 100);
		Day_container.add(panel_5);
		panel_5.setLayout(null);
		
		table_6 = new JTable();
		table_6.setBounds(10, 82, 1306, -57);
		panel_5.add(table_6);
		
		JLabel label_2 = new JLabel("9 September");
		label_2.setBounds(10, 0, 174, 23);
		panel_5.add(label_2);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBounds(0, 499, 1326, 100);
		Day_container.add(panel_6);
		
		table_7 = new JTable();
		table_7.setBounds(10, 92, 1306, -69);
		panel_6.add(table_7);
		
		JLabel label_3 = new JLabel("9 September");
		label_3.setBounds(10, 0, 174, 23);
		panel_6.add(label_3);

//		for (int i = 0; i > 7; i++) {
//			try {
//				JPanel panel_2 = new JPanel();
//				panel_2.setSize(new Dimension(1366, 0));
//				Day_container.add(panel_2);
//
//				JLabel lblDay = new JLabel("Sunday 30");
//				lblDay.setSize(new Dimension(1366, 20));
//				panel_2.add(lblDay);
//
//				table = new JTable();
//				table.setPreferredSize(new Dimension(1366, 0));
//				table.setRowMargin(2);
//				panel_2.add(table);
//
//				JScrollBar scrollBar = new JScrollBar();
//				panel_2.add(scrollBar);
//
//			} catch (Exception e) {
//				System.out.println("fejl i loop til oprettelse af dage");
//			}
//		}
	}
}
