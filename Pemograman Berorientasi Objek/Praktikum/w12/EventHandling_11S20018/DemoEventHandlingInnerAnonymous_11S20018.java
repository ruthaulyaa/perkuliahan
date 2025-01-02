import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
public class DemoEventHandlingInnerAnonymous_11S20018 extends JFrame{
	private JLabel myLabel;
	private JButton myButton1;
	private JButton myButton2;
	public DemoEventHandlingInnerAnonymous_11S20018(String title){
		super(title);
		myLabel = new JLabel("Default Text");
		myLabel.setOpaque(true);
		myLabel.setBackground(Color.lightGray);
		myButton1 = new JButton("Button1");
		myButton2 = new JButton("Button2");
		setLocationRelativeTo(null);
		setSize(240,100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void setLayout(){
	this.setLayout(new FlowLayout());
	}
	private void addComponent(){
	add(myButton1);
	add(myButton2);
	add(myLabel);
	}
	private void addListener(){
	myButton1.addMouseListener(new MouseAdapter(){
	public void mouseClicked(MouseEvent e) {
	if (e.getSource() == myButton1)
	myLabel.setText("Button 1 clicked");
	else
	myLabel.setText("Button 2 clicked");
	}
	});
	myButton2.addMouseListener(new MouseAdapter(){
	public void mouseClicked(MouseEvent e) {
	if (e.getSource() == myButton1)
	myLabel.setText("Button 1 clicked");
	else
	myLabel.setText("Button 2 clicked");
	}
	});
	}
	public static void main(String[] args){
	DemoEventHandlingInnerAnonymous_11S20018 deho = new
	DemoEventHandlingInnerAnonymous_11S20018("Demo Event Handling");
	deho.setLayout();
	deho.addComponent();
	deho.addListener();
	}
}