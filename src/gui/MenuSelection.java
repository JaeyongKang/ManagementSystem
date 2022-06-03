package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listener.ButtonAddListener;
import listener.ButtonViewListener;

import java.awt.BorderLayout;

public class MenuSelection extends JPanel{
	
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {
		this.frame = frame;
		//자신의 프레임에 넘어온 프레임을 넘겨주는 작업
		
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		
		JButton b1 = new JButton("Add Assignment");
		JButton b2 = new JButton("Edit Assignment");
		JButton b3 = new JButton("Delete Assignment");
		JButton b4 = new JButton("View Assignment");
		JButton b5 = new JButton("Exit Program");
		
		b4.addActionListener(new ButtonViewListener(frame));
		b1.addActionListener(new ButtonAddListener(frame));
		
		panel1.add(label);
		panel2.add(b1);
		panel2.add(b2);
		panel2.add(b3);
		panel2.add(b4);
		panel2.add(b5);
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);

	}
}
