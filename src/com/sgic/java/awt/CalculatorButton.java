package com.sgic.java.awt;
import javax.swing.JFrame;

import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

public class CalculatorButton {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	     Cal();
		}
		
		public static  void Cal() {
			
			
			JFrame frame = new JFrame("Simple Calculator");
			frame.setSize(800,400);
			frame.setResizable(false);
			
			
			JPanel panel = new JPanel();
			panel.setLayout(null);
			
			JLabel label01 = new JLabel("Simple Calculator:");
			 label01.setBounds(200, 50, 400, 20);
			 panel.add(label01);
			 label01.setFont(new Font("Lucida",Font.BOLD,24));
			
			 JLabel label1 = new JLabel("First Number:");
			 label1.setBounds(100, 100, 200, 20);
			 panel.add(label1);
			 
			 JLabel label2 = new JLabel("Second Number: ");
			 label2.setBounds(400, 100, 200, 20);
			 panel.add(label2);
			 
			 JTextField text1 = new JTextField();
			 text1.setBounds(250, 100, 100, 20);
			 panel.add(text1);
			 
			 JTextField text2 = new JTextField();
			 text2.setBounds(600, 100, 100, 20);
			 panel.add(text2);
			 
			 JRadioButton radio1 =new JRadioButton("Add",true);
			 radio1.setBounds(100,130,100,20);
			 
			 JRadioButton radio2 =new JRadioButton("Subtract");
			 radio2.setBounds(250,130,100,20);
			 
			 JRadioButton radio3 =new JRadioButton("Multiply");
			 radio3.setBounds(400,130,100,20);
			 
			 JRadioButton radio4 =new JRadioButton("Divide");
			 radio4.setBounds(550,130,100,20);
			 
			 ButtonGroup bg = new ButtonGroup();
			 
			 JButton button = new JButton("ANSWER");
			 button.setBounds(350, 200, 100, 20);
			 
			 JTextField text3 = new JTextField();
			 text3.setBounds(250, 300, 400, 20);
			 panel.add(text3);
			 
			 
			 
			 button.addActionListener
				(
						new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{
								try
								{
									double temp1 = Double.parseDouble(text1.getText());
									double temp2 = Double.parseDouble(text2.getText());
									double result;
									if(radio1.isSelected())
									{
										result = temp1+temp2;
										text3.setText(String.valueOf(result));
									}
									else if(radio2.isSelected())
									{
										result = temp1-temp2;
										text3.setText(String.valueOf(result));
									}
									else if(radio3.isSelected())
									{
										result = temp1*temp2;
										text3.setText(String.valueOf(result));
									}
									else if(radio4.isSelected())
									{
										result = temp1/temp2;
										text3.setText(String.valueOf(result));
									}
								}
								catch(NumberFormatException nfe)
								{
									JFrame newFrame = new JFrame();
									JOptionPane.showMessageDialog(newFrame, "Please enter a number!");
								}
							}
						}
				);
			 
			 bg.add(radio1);
			 bg.add(radio2);
			 bg.add(radio3);
			 bg.add(radio4);
			 
			 panel.add(label1);
			 panel.add(label2);
			 panel.add(label01);
			// panel.add(label3);
			    panel.add(radio1);
				panel.add(radio2);
				panel.add(radio3);
				panel.add(radio4);
				panel.add(button);
			    frame.add(panel); // add the panel to the frame
				
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to terminate the program on closing the frame
				frame.setVisible(true);
		}

	}



