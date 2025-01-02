//Poin 6A
//Filename: AppAddJTextField_11S20018.java

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class AppAddJTextField_11S20018{
	private JFrame myFrame;
	private JLabel myLabel;
	private JButton myButton;
	private JTextField myTextField;
	
	public AppAddJTextField_11S20018(){
		myFrame = new JFrame ("Add JLabel");
		myLabel = new JLabel("Isi label");
		myButton = new JButton("Click me");
		myTextField = new JTextField(15);
		myFrame.setLocationRelativeTo(null);
		myFrame.setSize(200,100);
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void addComponent(){
		//menambahkan label dan button ke dalam container
		myFrame.add(myLabel);
		myFrame.add(myButton);
		myFrame.add(myTextField);
		myFrame.setLayout(new FlowLayout());
		myFrame.pack();
	}
	public static void main(String[] args) {
		new AppAddJTextField_11S20018().addComponent();
	}
}