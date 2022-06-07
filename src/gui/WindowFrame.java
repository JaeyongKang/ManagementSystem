package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.AssignmentManager;


public class WindowFrame extends JFrame {

	AssignmentManager assignmentManager;
	
	MenuSelection menuSelection;
	AssignmentViewer assignmentViewer;
	AssignmentAdder assignmentAdder;
	
	public WindowFrame(AssignmentManager assignmentManager) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		this.assignmentManager = assignmentManager;
		menuSelection = new MenuSelection(this);
		assignmentAdder = new AssignmentAdder(this, this.assignmentManager);
		assignmentViewer = new AssignmentViewer(this, this.assignmentManager);
		this.setupPanel(menuSelection);
		this.setVisible(true);
	}
	
	public MenuSelection getMenuSelection() {
		return menuSelection;
	}

	public void setMenuSelection(MenuSelection menuSelection) {
		this.menuSelection = menuSelection;
	}

	public AssignmentManager getAssignmentManager() {
		return assignmentManager;
	}

	public void setAssignmentManager(AssignmentManager assignmentManager) {
		this.assignmentManager = assignmentManager;
	}

	public AssignmentViewer getAssignmentViewer() {
		return assignmentViewer;
	}

	public void setAssignmentViewer(AssignmentViewer assignmentViewer) {
		this.assignmentViewer = assignmentViewer;
	}

	public AssignmentAdder getAssignmentAdder() {
		return assignmentAdder;
	}

	public void setAssignmentAdder(AssignmentAdder assignmentAdder) {
		this.assignmentAdder = assignmentAdder;
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	

}