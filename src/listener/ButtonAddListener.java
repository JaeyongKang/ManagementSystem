package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.AssignmentAdder;
import gui.AssignmentViewer;
import gui.WindowFrame;

public class ButtonAddListener implements ActionListener{
	
	WindowFrame frame;
	
	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		AssignmentAdder adder = frame.getAssignmentAdder();
		frame.setupPanel(adder);
		
	}

}
