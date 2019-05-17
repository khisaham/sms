import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
public class main {
	public main(){
		init();
	}
	public void init(){
		// <-----main JPanel----->
		JPanel p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		// / <<----end---->>
		JPanel p10 = new JPanel(new FlowLayout(FlowLayout.CENTER, 12, 10));// heading
																			// jpanel
		JPanel p11 = new JPanel(new GridLayout(7, 2, 1, 6));// JPanel p11 where
															// textfield are
		JPanel p12 = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));// rate
																			// me
																			// jpanel
		JPanel p13 = new JPanel(new BorderLayout());// Footer
		JPanel p131 = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));// Footer
																			// exit
																			// buttons
		JPanel p132 = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));// Footer
																			// copyrights
		JPanel cent = new JPanel(new GridLayout(12, 5, 1, 3));// middle jpanel

		// <-------buttons,Jtextfields,labels and image icons---->
		JLabel head = new JLabel("Manage Your Spending");
		p10.add(head);
		Border lineborder = new LineBorder(Color.BLACK, 1);
		Border lineborder1 = new LineBorder(Color.BLACK, 0);
		p10.setBorder(lineborder1);

		JLabel footer = new JLabel("Copyrights by Khisa Ham");
		JButton exit = new JButton("EXIT");
		//p131.add(exit);
		p131.setBorder(lineborder1);
		p132.add(footer);
		p132.setBorder(lineborder);
		p13.add(p131, BorderLayout.NORTH);
		p13.add(p132, BorderLayout.SOUTH);

		// <--------Jlabel for p11 and users capture data------------->//
		JLabel lab1 = new JLabel("    FoodStuffs:");
		JLabel lab2 = new JLabel("    Transport:");
		JLabel lab3 = new JLabel("    Offerings:");
		JLabel lab4 = new JLabel("    Charity:");
		JLabel lab5 = new JLabel("    Message:");
		JLabel lab6 = new JLabel("    Recepient");
		// <-------------------END OF JLABELS ---------------------->//

		// <---------JTextfields for p11 ------------->//
		final JTextField text1 = new JTextField(12);
		final JTextField text2 = new JTextField(12);
		final JTextField text3 = new JTextField(12);
		final JTextField text4 = new JTextField(12);
		final JTextField text5 = new JTextField(12);
		final JTextField text6 = new JTextField(12);
		// <--------------------END OF JTEXTFELDS------------------->//

		// <-----------JButtons for p12 and p11------------>//
		JButton btn1 = new JButton("CLEAR");
		JButton btn2 = new JButton("SUBMIT");
		JButton btn3 = new JButton("RATE ME");
		JButton btn4 = new JButton("VIEW MY SPENT");
		JButton btn5 = new JButton("BUDGET");
		JButton btn6 = new JButton("GET ADVICE");
		// <------END OF BUTTONS------------------------>///

		// <------------------adding labels,textfields and buttons to p11
		// jpanel------------------->//

		//p11.add(lab1);
		//p11.add(text1);
		//p11.add(lab2);
		//p11.add(text2);
		//p11.add(lab3);
		//p11.add(text3);
		//p11.add(lab4);
		//p11.add(text4);
		p11.add(lab5);
		p11.add(text5);
		p11.add(lab6);
		p11.add(text6);
		p11.add(btn1);
		p11.add(btn2);
		p11.setBorder(new TitledBorder("Fill this Fields"));

		// <-------------adding labels,textfields and buttons to
		// p12---------------------------------->//
		p12.add(btn3);
		p12.add(btn4);
		p12.add(btn5);
		p12.add(btn6);
		p12.setBorder(new TitledBorder("Check Out"));

		

		// initComponents(){
		exit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				System.exit(1);
			}
		});
		
	}
	

}
