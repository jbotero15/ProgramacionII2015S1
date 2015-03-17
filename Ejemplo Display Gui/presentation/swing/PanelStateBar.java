package swing;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class PanelStateBar extends JPanel{
	
	private JLabel labelPanel;
	
	public PanelStateBar(String message) {
		this.setBackground(Color.CYAN);
		this.labelPanel = new JLabel(message);
		this.add(labelPanel);
		//this.setName(message);   
	}

	public JLabel getLabelPanel() {
		return labelPanel;
	}
	
	
}
