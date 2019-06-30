package time;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TimePrinter implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Date date = new Date();
		System.out.println(date.toString());
	}

}
