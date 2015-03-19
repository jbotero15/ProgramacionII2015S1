package swing;
import javax.swing.JLabel;
import javax.swing.JPanel;

import functional.LetterXY;
import functional.TextXY;
public class PanelLetter extends JPanel{
	public static final int SIZE_LETTER = 40 ;
	private JLabel arrayLabel[];
	private TextXY textXY;
	
	public PanelLetter() {
		this.setLayout(null);
		this.textXY = new TextXY("DEMOSTRACION PANEL LETTER");
		textXY.generate();		
		fillArrayLabel();
	}
	
	public void fillArrayLabel(){
		this.arrayLabel = new JLabel[textXY.getArray().length];
		int i = 0;
		while (i < this.arrayLabel.length){
			arrayLabel[i] = new JLabel(textXY.getArray()[i].getLetter()+"");
			arrayLabel[i].setBounds(textXY.getArray()[i].getX(), 
									textXY.getArray()[i].getY(), SIZE_LETTER, SIZE_LETTER);
			this.add(arrayLabel[i]);
			i++;
		}
	}
	
	public void clean(){
		int i = 0;
		while (i < arrayLabel.length){
			remove(arrayLabel[i]);
			i++;
		}
		this.validate();
	}
	
	public void move(){
		LetterXY.limitX = getWidth();
		LetterXY.limitY = getHeight();
		textXY.move();
		for (int i = 0; i < arrayLabel.length; i++) {
			arrayLabel[i].setLocation(textXY.getArray()[i].getX(), textXY.getArray()[i].getY());
		}
	}

	public TextXY getTextXY() {
		return textXY;
	}

	
	
	
	
}
