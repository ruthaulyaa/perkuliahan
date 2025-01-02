//Poin 5
//Filename: AppUseSetBound_11S20018.java

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

public class AppUseSetBound_11S20018{
	private JFrame myFrame;
	private JPanel myPanel;
	private JButton a;
	private JButton b;
	private JButton c;
	
	public AppUseSetBound_11S20018(){
		myFrame = new JFrame("No Layout Demo");
		myPanel = new JPanel();
		a = new JButton("1");
		b = new JButton("2");
		c = new JButton("3");

		myFrame.setLocationRelativeTo(null);
		myFrame.setSize(240,220);;
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void addComponent(){
		myFrame.add(myPanel);
		myPanel.add(a);
		a.setBounds(70, 10, 59, 20);
		myPanel.add(b);
		b.setBounds(20, 90, 90, 23);
		myPanel.add(c);
		c.setBounds(20, 10, 50, 30);
	}
	public void setLayout(){
		//Jika menggunakan setbound harus setLayout null terlebih dahulu
		myPanel.setLayout(null);
	}
	public void setPack(){
		myFrame.pack();
	}
}