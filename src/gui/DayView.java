package gui;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import java.awt.ComponentOrientation;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DayView extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table_2;
	private final JButton btnWeekView = new JButton("Week View");
	/**
	 * Create the panel.
	 */
	public DayView() {
		setSize(new Dimension(1366, 768));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(1366, 25));
		panel.setBounds(0, 0, 1366, 25);
		add(panel);
		
		JLabel label = new JLabel("Quote Of The Day:");
		panel.add(label);
		
		JLabel label_1 = new JLabel((String) null);
		label_1.setAlignmentX(0.5f);
		panel.add(label_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 1346, 662);
		add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(0, 101, 1326, 561);
		panel_2.add(panel_3);
		
		JLabel label_3 = new JLabel("8 September");
		label_3.setBounds(10, 0, 174, 23);
		panel_3.add(label_3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(0, 0, 1326, 100);
		panel_2.add(panel_5);
		
		String[] columnNames = {"First Name",
                "Last Name",
                "Sport",
                "# of Years",
                "Vegetarian"};
		
		Object[][] data = {
			    {"Kathy", "Smith",
			     "Snowboarding", new Integer(5), new Boolean(false)},
			    {"John", "Doe",
			     "Rowing", new Integer(3), new Boolean(true)},
			    {"Sue", "Black",
			     "Knitting", new Integer(2), new Boolean(false)},
			    {"Jane", "White",
			     "Speed reading", new Integer(20), new Boolean(true)},
			    {"Joe", "Brown",
			     "Pool", new Integer(10), new Boolean(false)}
			};
			table_2 = new JTable(data, columnNames);
		table_2.setBounds(10, 653, 1306, -517);
		panel_5.add(table_2);
		
		JLabel label_5 = new JLabel("9 September");
		label_5.setBounds(10, 0, 174, 23);
		panel_5.add(label_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(510, 40, 381, 37);
		panel_5.add(panel_1);
		panel_1.setMinimumSize(new Dimension(1366, 100));
		btnWeekView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		btnWeekView.setIcon(new ImageIcon(DayView.class.getResource("/com/sun/java/swing/plaf/windows/icons/DetailsView.gif")));
		panel_1.add(btnWeekView);
		
		JButton button_1 = new JButton("Previous");
		button_1.setIcon(new ImageIcon(DayView.class.getResource("/javax/swing/plaf/metal/icons/ocean/collapsed.gif")));
		panel_1.add(button_1);
		
		JMenuItem menuItem = new JMenuItem("Year");
		panel_1.add(menuItem);
		
		JButton button_2 = new JButton("Next");
		button_2.setIcon(new ImageIcon(DayView.class.getResource("/javax/swing/plaf/metal/icons/ocean/collapsed-rtl.gif")));
		button_2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		panel_1.add(button_2);
		
		JLabel lblAgenda = new JLabel("AGENDA");
		lblAgenda.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAgenda.setBounds(10, 66, 66, 23);
		panel_5.add(lblAgenda);
		

	}
	public void addActionListener(ActionListener e) {
		btnWeekView.addActionListener(e);
		
}
	public JButton getBtnWeekView() {
		return btnWeekView;
	}
}
