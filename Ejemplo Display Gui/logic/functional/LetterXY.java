package functional;

public class LetterXY {
	private char letter;
	private int x;
	private int y;	
	
	public LetterXY(char letter, int x, int y) {
		super();
		this.letter = letter;
		this.x = x;
		this.y = y;
	}
	

	public char getLetter() {
		return letter;
	}
	public void setLetter(char letter) {
		this.letter = letter;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	

}
