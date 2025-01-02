import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
public class DemoEventHandlingActionListener_11S20018 implements ActionListener{
	private JFrame myFrame;
	private JLabel myLabel;
	private JButton myButton1;
	private JButton myButton2;
	public DemoEventHandlingActionListener_11S20018(String title){
		myFrame = new JFrame(title);
		myLabel = new JLabel("Default Text");
		myLabel.setOpaque(true);
		myLabel.setBackground(Color.lightGray);
		myButton1 = new JButton("Button1");
		myButton2 = new JButton("Button2");
		myFrame.setLocationRelativeTo(null);
		myFrame.setSize(240,100);
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void setLayout(){
		myFrame.setLayout(new FlowLayout());
	}
	private void addComponent(){
		myFrame.add(myButton1);
		myFrame.add(myButton2);
		myFrame.add(myLabel);
	}
	private void addListener(){
		myButton1.addActionListener(this);
		myButton2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
	if (e.getSource() == myButton1)
		myLabel.setText("Button 1 clicked");
	else
		myLabel.setText("Button 2 clicked");
	}
	public static void main(String[] args){
		DemoEventHandlingActionListener_11S20018 deho = new
		DemoEventHandlingActionListener_11S20018("Demo Event Handling");
		deho.setLayout();
		deho.addComponent();
		deho.addListener();
	}
}