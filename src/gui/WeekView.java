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

@SuppressWarnings("serial")
public class WeekView extends JPanel {
	private JTable table;
	private JTable table_1;

	// Week of QOTD skal sættes korrekt
	private String Week;
	private String QOTD;

	/**
	 * Create the panel.
	 */
	public WeekView() {
		setSize(new Dimension(1366, 768));
		
		// QOTD contianer and with QOTD labels
		JPanel QOTD_container = new JPanel();
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
		Menu_container.setMinimumSize(new Dimension(1366, 100));
		Menu_container.setSize(new Dimension(1366, 100));
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
		add(Day_container);

		// Week skal sættes til nuværende uge
		JLabel WeekNumber = new JLabel(Week);
		Day_container.add(WeekNumber);

		for (int i = 0; i > 7; i++) {
			try {
				JPanel panel_2 = new JPanel();
				panel_2.setSize(new Dimension(1366, 0));
				Day_container.add(panel_2);

				JLabel lblDay = new JLabel("Sunday 30");
				lblDay.setSize(new Dimension(1366, 20));
				panel_2.add(lblDay);

				table = new JTable();
				table.setPreferredSize(new Dimension(1366, 0));
				table.setRowMargin(2);
				panel_2.add(table);

				JScrollBar scrollBar = new JScrollBar();
				panel_2.add(scrollBar);

			} catch (Exception e) {
				System.out.println("fejl i loop til oprettelse af dage");
			}
		}
	}
}
