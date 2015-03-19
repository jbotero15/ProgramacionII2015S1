package functional;

public class TextXY {
	public static final int LIMIT = 200; 
	private String text;
	private LetterXY array[];
	private int maxX;
	private int maxY;
	
	public TextXY(String text) {
		setText(text);
		this.maxX = LIMIT;
		this.maxY = LIMIT;		
	}
	
	public TextXY(String text, int maxX, int maxY) {
		setText(text);
		this.maxX = maxX;
		this.maxY = maxY;
	}
	
	/**
	 * Tomar la letras del texto y convertirlas en una arreglo con posiciones
	 * en x y aleatoriamente	 
	 */
	public void generate(){
		for (int i = 0; i < array.length; i++) {
			array[i] = new LetterXY(text.charAt(i), (int)(Math.random()*maxX), (int)(Math.random()*maxY));
		}
	}
	
	public void move(){
		for (int i = 0; i < array.length; i++) {
			array[i].move();
		}
	}
	
	public LetterXY[] getArray() {
		return array;
	}

	public void setArray(LetterXY[] array) {
		this.array = array;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
		array = new LetterXY[text.length()];		
	}

	public int getMaxX() {
		return maxX;
	}

	public void setMaxX(int maxX) {
		this.maxX = maxX;
	}

	public int getMaxY() {
		return maxY;
	}

	public void setMaxY(int maxY) {
		this.maxY = maxY;
	}
	

}
