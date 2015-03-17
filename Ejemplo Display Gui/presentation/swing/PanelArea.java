package swing;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
public class PanelArea extends JPanel {	
	private PanelDisplay panelDisplay;
	private JButton buttonSendLetter;
	private PanelLetter panelLetter;
	private Event event;
	
	public PanelArea(Event event){
		this.event = event;
		this.setLayout(new GridLayout());
		this.panelDisplay = new PanelDisplay();
		this.add(this.panelDisplay);
		this.buttonSendLetter = new JButton("Enviar Letra");
		this.buttonSendLetter.addActionListener(event);
		this.buttonSendLetter.setActionCommand(Event.SEND_LETTER);
		this.add(this.buttonSendLetter);
		this.panelLetter = new PanelLetter();
		this.add(this.panelLetter);
	}

	public PanelDisplay getPanelDisplay() {
		return panelDisplay;
	}

	public PanelLetter getPanelLetter() {
		return panelLetter;
	}
	
	
}
