import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Button {

  String input;


	String[] list = {"42", "Give Up", "Kill Yourself", "Divide By 0", "Zzzz", "Your puny mortal quarrels don't bother me"};
	Random r = new Random();



	btnHalp.addActionListener(this);

		public void actionPerformed(ActionEvent event)
		{    
			txtrAnswerHere = list[r.nextInt(list.length)];
		}










	}
