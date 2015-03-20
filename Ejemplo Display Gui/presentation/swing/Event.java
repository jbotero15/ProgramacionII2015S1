package swing;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import logic.Text;
public class Event implements ActionListener{
	
	public static final String LETTER_TEXT = "letter text";
	public static final String SEND_LETTER = "send letter";
	public static final String MOVE = "move"; 
	
	private WindowText windowText;
	
	public Event(WindowText windowText){
		this.windowText = windowText;
	}
	
	@Override
	public void actionPerformed(ActionEvent action){
		if (action.getActionCommand().equals(this.LETTER_TEXT)) {			
			windowText.letterToLetter();
		}
		if (action.getActionCommand().equals(this.SEND_LETTER)) {
			windowText.countA();
		}
		if (action.getActionCommand().equals(this.MOVE)) {
			//windowText.move();
			windowText.startAnimation();
		}
	}
}










