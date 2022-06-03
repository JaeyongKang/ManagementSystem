package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.AssignmentManager;

public class AssignmentViewer extends JPanel{
	
	WindowFrame frame;
	AssignmentManager assignmentManager;
	
	public AssignmentViewer(WindowFrame frame,AssignmentManager assignmentManager) {
		this.frame = frame;
		this.assignmentManager = assignmentManager;

		System.out.println("***" + assignmentManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Date");
		model.addColumn("Content");
		
//		for(int i=0; i< assignmentManager.size(); i++) {
//			Vector row = new Vector();
//		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);

	}
}
