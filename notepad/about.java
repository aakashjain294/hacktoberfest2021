import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;

import javax.swing.*;
public class about extends JFrame implements ActionListener{
	JButton b1;
	 About() {
		setBounds(400 , 100 , 600 ,500);
		setLayout(null);
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/windows.png"));
		Image i2 = i1.getImage().getScaledInstance(400, 80, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1 = new JLabel(i3);
		l1.setBounds(110 , 30 , 400 ,80);
		add(l1);
		
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/notepad.png"));
		Image i5 = i4.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
		ImageIcon i6 = new ImageIcon(i5);
		JLabel l2 = new JLabel(i6);
		l2.setBounds(50 , 160 , 50 ,50);
		add(l2);
		
		JLabel l3 = new JLabel("<html>AJ's notepad<br>AJ version 2021<br> @ All Rights Reserved To My Desktop<br><br>Windows Notepad is a simple text editor for Windows<br>and a basic text-editing program which enables computer <br> users to create documents.</html>");
		l3.setBounds(150, 130, 500, 300);
		l3.setFont(new Font ("SAN SERIF", Font.PLAIN , 16));
		add(l3);
		
		b1 = new JButton("OK");
		b1.setBounds(430, 400, 70, 20);
		b1.addActionListener(this);
		add(b1);
	}
	 public void actionPerformed(ActionEvent ae) {
		 this.setVisible(false);
	 }
	 public static void main(String[] args) {
		 new About().setVisible(true);
	 }
}