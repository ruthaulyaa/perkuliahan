import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
public class DemoEventHandlingAdapterOuter_11S20018 extends MouseAdapter{
	private JFrame myFrame;
	private JLabel myLabel;
	private JButton myButton1;
	private JButton myButton2;
	//constructor
	public DemoEventHandlingAdapterOuter_11S20018(String title){
		myFrame = new JFrame(title);
		myLabel = new JLabel("Default Text");
		myLabel.setOpaque(true);
		myLabel.setBackground(Color.lightGray);
		myButton1 = new JButton("Button1");
		myButton2 = new JButton("Button2");
		System.out.println(myFrame.getLayout());
		myFrame.setLocationRelativeTo(null);
		myFrame.setSize(240,100);
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void setLayout(){
		myFrame.setLayout(new FlowLayout());
	}
	//method untuk add komponen pada kontainer
	private void addComponent(){
		myFrame.add(myButton1);
		myFrame.add(myButton2);
		myFrame.add(myLabel);
	}
	
	//method untuk meregister objek pada objek listener
	private void addListener(){
		myButton1.addMouseListener(this);
		myButton2.addMouseListener(this);
	}
	//override method
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == myButton1)
		myLabel.setText("Button 1 clicked");
		else
		myLabel.setText("Button 2 clicked");
	}
	public static void main(String[] args){
		DemoEventHandlingAdapterOuter_11S20018 deho = new
		DemoEventHandlingAdapterOuter_11S20018("Demo Event Handling");
		deho.setLayout();
		deho.addComponent();
		deho.addListener();
	}
}