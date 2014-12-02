package gui;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.JList;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

public class WeekView extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public WeekView() {
		setSize(new Dimension(1366, 768));
		
		JPanel QOTD_container = new JPanel();
		QOTD_container.setPreferredSize(new Dimension(1366, 25));
		add(QOTD_container);
		
		JLabel lblQOTDHeadline = new JLabel("Quote Of The Day:");
		QOTD_container.add(lblQOTDHeadline);
		
		JLabel lblQOTD = new JLabel("\"Akan er en hund - Mads Vive\"");
		lblQOTD.setAlignmentX(Component.CENTER_ALIGNMENT);
		QOTD_container.add(lblQOTD);
		lblQOTD.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		
		JPanel Menu_container = new JPanel();
		add(Menu_container);
		
		JButton btnNewButton = new JButton("Day View");
		btnNewButton.setIcon(new ImageIcon(WeekView.class.getResource("/com/sun/java/swing/plaf/windows/icons/DetailsView.gif")));
		Menu_container.add(btnNewButton);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setIcon(new ImageIcon(WeekView.class.getResource("/javax/swing/plaf/metal/icons/ocean/collapsed.gif")));
		Menu_container.add(btnPrevious);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Year");
		Menu_container.add(mntmNewMenuItem);
		
		JButton btnNext = new JButton("Next");
		btnNext.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		btnNext.setIcon(new ImageIcon(WeekView.class.getResource("/javax/swing/plaf/metal/icons/ocean/collapsed-rtl.gif")));
		Menu_container.add(btnNext);
		
		for (int i = 0 ; i > 7; i++){	
		
		JPanel panel_2 = new JPanel();
		add(panel_2);
		
		table = new JTable();
		table.setPreferredSize(new Dimension(1366, 0));
		table.setRowMargin(2);
		panel_2.add(table);
		
		JScrollBar scrollBar = new JScrollBar();
		panel_2.add(scrollBar);
		}
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
