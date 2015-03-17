package swing;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
/**
 * Permite obtener el texto digitado por el usuario
 * 
 * @author Docente y Estudiantes de Programacion II
 *
 */
public class PanelText extends JPanel{
	private JLabel labelText ;
	private JTextField textText;
	private JButton buttonLetter;
	private Event event;
	
	public PanelText(Event event){
		this.event = event;
		this.setLayout(new FlowLayout());
		this.labelText = new JLabel("Texto");
		this.add(labelText);
		this.textText = new JTextField(60);
		this.add(textText);
		this.buttonLetter = new JButton("Letras del Texto");
		this.buttonLetter.addActionListener(event);
		this.buttonLetter.setActionCommand(Event.LETTER_TEXT);
		this.add(buttonLetter);
	}

	public JTextField getTextText() {
		return textText;
	}
	
	
	
	
}










