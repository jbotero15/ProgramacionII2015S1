package swing;
import javax.swing.JFrame;

import functional.TextXY;

import java.awt.BorderLayout;

import logic.Text;
public class WindowText extends JFrame{
	
	private PanelText panelText;
	private PanelArea panelArea;
	private PanelStateBar panelStateBar;
	private Event event;

	public WindowText(){		
		this.event = new Event(this);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.panelText = new PanelText(this.event);
		this.add(panelText, BorderLayout.NORTH);
		this.panelArea = new PanelArea(this.event);
		this.add(panelArea, BorderLayout.CENTER);
		this.panelStateBar = new PanelStateBar("BARRA DE ESTADO");
		this.add(panelStateBar, BorderLayout.SOUTH);
		this.setSize(1000, 500);
		//this.pack();
	}
	
	public void copyTextBar() {		
		String textTemp = this.panelText.getTextText().getText();
		this.panelStateBar.getLabelPanel(). setText(textTemp);
	}
	
	public void countA(){
		String textTemp = this.panelText.getTextText().getText();
		this.panelStateBar.getLabelPanel().setText(Text.vocalA(textTemp)+"");		
	}
	
	public void letterToLetter(){
		this.panelArea.getPanelLetter().clean();
		String textTemp = this.panelText.getTextText().getText();
		this.panelArea.getPanelLetter().getTextXY().setText(textTemp);
		this.panelArea.getPanelLetter().getTextXY().setMaxX(panelArea.getPanelLetter().getWidth());
		this.panelArea.getPanelLetter().getTextXY().setMaxY(panelArea.getPanelLetter().getHeight());
		this.panelArea.getPanelLetter().getTextXY().generate();		
	}
}















