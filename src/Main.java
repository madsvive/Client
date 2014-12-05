import gui.ScreenCalendar;
import logic.*;

public class Main {

	public static void main(String[] args) {

		// Makes connection to server
		Connect Clientconnect = new Connect();
		Clientconnect.ServerConnect();

		// starts the gui frame
		ScreenCalendar frame = new ScreenCalendar();
		frame.setVisible(true);
	}

}
