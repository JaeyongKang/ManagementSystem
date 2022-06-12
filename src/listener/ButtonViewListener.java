package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.AssignmentViewer;
import gui.WindowFrame;
import manager.AssignmentManager;

public class ButtonViewListener implements ActionListener{
	
	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		AssignmentViewer assignmentViewer = frame.getAssignmentViewer();
		AssignmentManager assignmentManager = getObject("assignmentmanager.ser");
		assignmentViewer.setAssignmentManager(assignmentManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(assignmentViewer);
		frame.revalidate();
		frame.repaint();
		
	}
	
	public static AssignmentManager getObject(String fileName) {
		//deserialize
		AssignmentManager assignmentManager = null;
		
		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			assignmentManager = (AssignmentManager)in.readObject();
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return assignmentManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return assignmentManager;
	}

}
