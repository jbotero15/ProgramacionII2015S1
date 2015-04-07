package functional;

public class LetterXY implements Runnable{
	public static final int DEFAULT_LIMIT = 50;
	public static final byte UP_RIGHT = 1; 
	public static final byte DOWN_RIGHT = 2;
	public static final byte UP_LEFT = 3;
	public static final byte DOWN_LEFT = 4;		
	public static final byte STOP = 0;
	public static final byte MOVE = 1;
	
	public static int limitX;
	public static int limitY;
	
	private char letter;
	private int x;
	private int y;	
	private byte orientation;
	private int xTarget;
	private int yTarget;
	private byte state;
	
	
	public LetterXY(char letter, int x, int y) {
		super();
		this.letter = letter;
		this.x = x;
		this.y = y;
		this.orientation = UP_RIGHT;
		this.limitX = DEFAULT_LIMIT;
		this.limitY = DEFAULT_LIMIT;
		this.xTarget = DEFAULT_LIMIT;
		this.yTarget = DEFAULT_LIMIT;
		this.state = MOVE; 
	}
	
	public void move(){
		switch (orientation){
		case UP_RIGHT : moveUpRight(); break;
		case UP_LEFT  : moveUpLeft(); break;
		case DOWN_RIGHT : moveDownRight(); break;
		case DOWN_LEFT  : moveDownLeft(); break;
		}
	}
	
	public void moveUpRight(){
		x++;
		y--;
		if (y < 0) {
			y = 0;
			orientation = DOWN_RIGHT;
		}
		if (x > limitX){
			x = limitX;
			orientation = DOWN_LEFT;
		}
	}
	
	public void moveUpLeft(){
		x--;
		y--;
		if (x < 0) {
			x = 0;
			orientation = UP_RIGHT;
		}
		if (y < 0) {
			y = 0;
			orientation = DOWN_RIGHT;
		}
	}
	
	public void moveDownRight(){
		x++;
		y++;
		if (x > limitX){
			x = limitX;
			orientation = DOWN_LEFT;
		}
		if (y > limitY){
			y = limitY;
			orientation = UP_LEFT;
		}
	}

	public void moveDownLeft(){
		x--;
		y++;
		if (x < 0) {
			x = 0;
			orientation = UP_RIGHT;
		}
		if (y > limitY){
			y = limitY;
			orientation = UP_LEFT;
		}
	}
	
	@Override
	public void run(){
		while (true) {
			if (state == MOVE) {
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (x == xTarget) 
					state = STOP;
				move();
			}
		}
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


	public byte getOrientation() {
		return orientation;
	}


	public void setOrientation(byte orientation) {
		this.orientation = orientation;
	}
	
	

}
