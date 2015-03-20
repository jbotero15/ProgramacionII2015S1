package test;
import swing.WindowText;
public class TestWindowText {
	public static void main(String[] param){
		
		if (param[0].equals("START")) {
			WindowText windowText1 = new WindowText();
			windowText1.setVisible(true);
		}
		else
			System.out.println("No tiene permisos para ejecutar la app");
	}
}
