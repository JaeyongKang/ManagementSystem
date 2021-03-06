package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listener.AssignmentAddCancelListener;
import listener.AssignmentAddListener;
import manager.AssignmentManager;

public class AssignmentAdder extends JPanel{
	
	WindowFrame frame;
	AssignmentManager assignmentManager;
	
	public AssignmentAdder(WindowFrame frame, AssignmentManager assignmentManager) {
		this.frame = frame;
		this.assignmentManager = assignmentManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelDate = new JLabel("Date: ", JLabel.TRAILING);
		JTextField fieldDate = new JTextField(10);
		labelDate.setLabelFor(fieldDate);
		panel.add(labelDate);
		panel.add(fieldDate);
		
		JLabel labelContent = new JLabel("Content: ", JLabel.TRAILING);
		JTextField fieldContent = new JTextField(10);
		labelDate.setLabelFor(fieldContent);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new AssignmentAddListener(fieldName, fieldDate, fieldContent, assignmentManager));
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new AssignmentAddCancelListener(frame));
		
		panel.add(labelContent);
		panel.add(fieldContent);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
		

		this.add(panel);
		this.setVisible(true);
	}
}
