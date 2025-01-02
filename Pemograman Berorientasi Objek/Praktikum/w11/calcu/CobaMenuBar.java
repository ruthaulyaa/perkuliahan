import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;

class CobaMenuBar extends JFrame{
// attribute
// buat objek menubar untuk menampung menu
JMenuBar menubar = new JMenuBar();
// buat menu untuk menampung aksi / item yang
// diinginkan
JMenu menu1 = new JMenu(“File”);
JMenu menu2 = new JMenu(“help”);
JMenu submenu = new JMenu(“Submenu”);
// membuat item dalam menu
JMenuItem item1 = new JMenuItem(“new”);
JMenuItem item2 = new JMenuItem(“open”);
JMenuItem item3 = new JMenuItem(“save”);
JMenuItem item4 = new JMenuItem(“close”);
JMenuItem item5 = new JMenuItem(“help me”);
// bisa juga masukan cekbox atau radio button
JCheckBox cekbox = new JCheckBox(“Chekbox”);
JRadioButton radiob1= new JRadioButton(“Radio button 1”);
JRadioButton radiob2= new JRadioButton(“Radio button 2”);
ButtonGroup group = new ButtonGroup();
// untuk framenya
JTextArea texta = new JTextArea(“history\n”);
JScrollPane scrl;
public CobaMenuBar(){
//frame seting———————————————————————
//memanggil konstruktor kelas induk (JFrame)
super(“coba menubar”);
//seting besar frame LEBAR x TINGGI
this.setSize(300,350);
//seting agar bisa ditutup
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//seting kemunculan frame di tengah window
this.setLocationRelativeTo(null);
// pada contoh ini tidak menggunakan layout
//frame seting———————————————————————
}
public void konfig(){
// masukan menu item ke menu
group.add(radiob1);
group.add(radiob2);
submenu.add(cekbox);
submenu.add(radiob1);
submenu.add(radiob2);
menu1.add(item1);
menu1.add(item2);
menu1.add(item3);
menu1.add(item4);
menu2.add(item5);
// membuat separator (garis)
menu1.addSeparator();
menu1.add(submenu);
// masukan menu ke menu bar
menubar.add(menu1);
menubar.add(menu2);
// masukan objek ke frame
scrl = new JScrollPane(texta);
this.add(scrl);
// masukan menubar ke frame
this.setJMenuBar(menubar);
// optional : kalau mau buat shortcut pake sintaks ini
// .setMnemonic(KeyEvent.<key-nya>)
// java.awt.*; harus di import
item1.setMnemonic(KeyEvent.VK_N);
menu1.setMnemonic(KeyEvent.VK_F);
submenu.setMnemonic(KeyEvent.VK_2);
}
public void setAksi(){
cekbox.addActionListener(new ActionListener( ) {
public void actionPerformed(ActionEvent e){
// kode disini; cek keadaan check box
if(cekbox.isSelected()){
texta.append(“-cekbox dicentang\n”);
}else{
texta.append(“-cekbox tidak dicentang\n”);
}

}
});
radiob1.addActionListener(new ActionListener( ) {
public void actionPerformed(ActionEvent e){
// kode disini; cek keadaan check box
texta.append(“-anda pilih radio button 1\n”);

}
});
radiob2.addActionListener(new ActionListener( ) {
public void actionPerformed(ActionEvent e){
// kode disini; cek keadaan check box
texta.append(“-anda pilih radio button 2\n”);

}
});
item1.addActionListener(new ActionListener( ) {
public void actionPerformed(ActionEvent e){
// kode disini; cek keadaan check box
texta.append(“-anda klik item 1 (new)\n”);

}
});
item5.addActionListener(new ActionListener( ) {
public void actionPerformed(ActionEvent e){
// kode disini; cek keadaan check box
JOptionPane.showMessageDialog(null,”Selamat anda sudah berhasil membuat menu”);

}
});
}
public static void main(String[] args){
CobaMenuBar bar = new CobaMenuBar();
bar.konfig();
bar.setAksi();
bar.show();
}
}