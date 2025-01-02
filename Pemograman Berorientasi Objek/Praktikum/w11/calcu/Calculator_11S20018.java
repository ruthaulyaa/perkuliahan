//Poin 6c
//Filename: Calculator_11S20018.java

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static java.lang.Math.sqrt;

public class Calculator_11S20018 extends JFrame{
	JTextField t1;
	JButton a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22;
	JFrame fr;
	JMenuBar mb;
	JMenu m0, m1, m2, sm;
	JMenuItem i0, i1, i2, i3, i4, i5, i6, i7;
	Double op1, op2;
	char Operation;

	Calculator_11S20018(){
		fr = new JFrame("My Calculator");
		fr.setLayout(null);
		
		mb = new JMenuBar();
		m0 = new JMenu("File");
		m1 = new JMenu("View");
		m2 = new JMenu("Help");
		//menambahkan item
		i0 = new JMenuItem("New");
		i1 = new JMenuItem("Open");
		i2 = new JMenuItem("History");
		i3 = new JMenuItem("Close");
		i4 = new JMenuItem("Minimize");
		i5 = new JMenuItem("Maximize");
		i6 = new JMenuItem("Help me");
		i7 = new JMenuItem("About");
		setJMenuBar(mb);
		mb.add(m0);
		mb.add(m1);
		mb.add(m2);
		m0.add(i0);
		m0.add(i1);
		m0.add(i2);
		m0.add(i3);
		m1.add(i4);
		m1.add(i5);
		m2.add(i6);
		m2.add(i7);
		
		fr.setVisible(true);
		fr.setSize (430, 430);
		fr.setTitle("My Calculator");
		fr.setLocationRelativeTo(null);
		fr.setLayout(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t1 = new JTextField();
		t1.setBounds(10, 10, 400, 40);
		fr.add(t1);
		
		a1 = new JButton("BackSpace");
		a2 = new JButton ("C");
		a3 = new JButton ("7");
		a4 = new JButton("8");
		a5 = new JButton ("9");
		a6 = new JButton ("/");
		a7 = new JButton("sqrt");
		a8 = new JButton ("4");
		a9 = new JButton ("5");
		a10 = new JButton("6");
		a11 = new JButton ("x");
		a12 = new JButton ("%");
		a13 = new JButton("1");
		a14 = new JButton ("2");
		a15 = new JButton ("3");
		a16 = new JButton("-");
		a17 = new JButton ("1/x");
		a18 = new JButton ("0");
		a19 = new JButton("+/-");
		a20 = new JButton (".");
		a21 = new JButton ("+");
		a22 = new JButton ("=");


		a1.setBounds (10, 60, 240, 60);
		a2.setBounds (250, 60, 160, 60);
		a3.setBounds (10, 120, 80, 60);
		a4.setBounds (90, 120, 80, 60);
		a5.setBounds (170, 120, 80, 60);
		a6.setBounds (250, 120, 80, 60);
		a7.setBounds (330, 120, 80, 60);
		a8.setBounds (10, 180, 80, 60);
		a9.setBounds (90, 180, 80, 60);
		a10.setBounds (170, 180, 80, 60);
		a11.setBounds (250, 180, 80, 60);
		a12.setBounds (330, 180, 80, 60);
		a13.setBounds (10, 240, 80, 60);
		a14.setBounds (90, 240, 80, 60);
		a15.setBounds (170, 240, 80, 60);
		a16.setBounds (250, 240, 80, 60);
		a17.setBounds (330, 240, 80, 60);
		a18.setBounds (10, 300, 80, 60);
		a19.setBounds (90, 300, 80, 60);
		a20.setBounds (170, 300, 80, 60);
		a21.setBounds (250, 300, 80, 60);
		a22.setBounds (330, 300, 80, 60);

		fr.add(a1);
		fr.add(a2);
		fr.add(a3);
		fr.add(a4);
		fr.add(a5);
		fr.add(a6);
		fr.add(a7);
		fr.add(a8);
		fr.add(a9);
		fr.add(a10);
		fr.add(a11);
		fr.add(a12);
		fr.add(a13);
		fr.add(a14);
		fr.add(a15);
		fr.add(a16);
		fr.add(a17);
		fr.add(a18);
		fr.add(a19);
		fr.add(a20);
		fr.add(a21);
		fr.add(a22);
		
		fr.setJMenuBar(mb);
		fr.setVisible(true);
		
		//membuat tombol berfungsi
		
		// bagian angka
		a1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String text = t1.getText();
				t1.setText(text.substring(0, text.length()-1));
			}
		});
		
		a2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t1.setText(null);
			}
		});
		
		a3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t1.setText(t1.getText()+"7");
			}
		});
		
		a4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t1.setText(t1.getText()+"8");
			}
		});
		
		a5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t1.setText(t1.getText()+"9");
			}
		});
		
		a8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t1.setText(t1.getText()+"4");
			}
		});
		
		a9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t1.setText(t1.getText()+"5");
			}
		});
		
		a10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t1.setText(t1.getText()+"6");
			}
		});
		
		a13.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t1.setText(t1.getText()+"1");
			}
		});
		
		a14.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t1.setText(t1.getText()+"2");
			}
		});
		
		a15.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t1.setText(t1.getText()+"3");
			}
		});
		
		a18.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t1.setText(t1.getText()+"0");
			}
		});
		
		// bagian operator
		
		a6.addActionListener(new ActionListener(){ //bagi
			public void actionPerformed(ActionEvent e){
				if (e.getSource() == a6){
                    op1 = getNumberFromText();
                    Operation = '/';
                    t1.setText("");
                }
			}
		});
		
		a7.addActionListener(new ActionListener(){ //sqrt
			public void actionPerformed(ActionEvent e){
				if (e.getSource() == a7){
                    op1 = getNumberFromText();
                    t1.setText("");
                    op2 = sqrt(op1);
                    t1.setText("" + op2);
                }
			}
		});
		
		a11.addActionListener(new ActionListener(){ //kali
			public void actionPerformed(ActionEvent e){
				if (e.getSource() == a11){
                    op1 = getNumberFromText();
                    Operation = 'x';
                    t1.setText("");
                }
			}
		});
		
		a12.addActionListener(new ActionListener(){ //persen
			public void actionPerformed(ActionEvent e){
				if (e.getSource() == a12){
                    op1 = getNumberFromText();
                    t1.setText("");
                    op2 = op1/100;
                    t1.setText("" + op2);
                }
			}
		});
		
		a16.addActionListener(new ActionListener(){ //kurang
			public void actionPerformed(ActionEvent e){
				 if (e.getSource() == a16){
                    op1 = getNumberFromText();
                    Operation = '-';
                    t1.setText("");
                }
			}
		});
		
		a17.addActionListener(new ActionListener(){ //1/x
			public void actionPerformed(ActionEvent e){
				if (e.getSource() == a17){
                    op1 = getNumberFromText();
                    t1.setText("");
                    op2 = 1/op1;
                    t1.setText("" + op2);
                }
			}
		});
		
		a19.addActionListener(new ActionListener(){ //+/-
			public void actionPerformed(ActionEvent e){
				if (e.getSource() == a19){
                    if (t1.getText().charAt(0) == '-'){
                        t1.setText(t1.getText().substring(1));
                    }
                    else{
                        t1.setText("-" + t1.getText());
                    }
                }
			}
		});
		
		a20.addActionListener(new ActionListener(){ //titik
			public void actionPerformed(ActionEvent e){
				 if (e.getSource() == a20){
                    if (t1.getText().contains(".") == true){}
                    else{
                        t1.setText(t1.getText() + ".");
                    }
                }
			}
		});
		
		a21.addActionListener(new ActionListener(){ //tambah
			public void actionPerformed(ActionEvent e){
				if (e.getSource() == a21){
                    op1 = getNumberFromText();
                    Operation = '+';
                    t1.setText("");
                }
			}
		});
		
		a22.addActionListener(new ActionListener(){ //sama dengan
			public void actionPerformed(ActionEvent e){
				if (e.getSource() == a22){
                    op2 = getNumberFromText();
                    switch (Operation){
                        case '/':
                            op1 = op1 / op2;
                            break;
                        case 'x':
                            op1 = op1 * op2;
                            break;
                        case '+':
                            op1 = op1 + op2;
                            break;
                        case '-':
                            op1 = op1 - op2;
                            break;
                    }
                    t1.setText("" + op1);
                }
			}
		});
	}
	
	public Double getNumberFromText(){
		return Double.valueOf(t1.getText());
	}
	
	public static void main(String [] args) {
		new Calculator_11S20018();
	}
}
