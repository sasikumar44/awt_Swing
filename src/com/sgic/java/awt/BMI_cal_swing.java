package com.sgic.java.awt;
import javax.swing.JFrame;

import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

public class BMI_cal_swing {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	     Cal();
		}
		
		public static  void Cal() {
			
			
			JFrame frame = new JFrame("BMI Calculator");
			frame.setSize(400,400);
			frame.setResizable(false);
			
			
			JPanel panel = new JPanel();
			panel.setLayout(null);
			
			JLabel label01 = new JLabel("BMI Calculator:");
			 label01.setBounds(150, 50, 400, 20);
			 panel.add(label01);
			 label01.setFont(new Font("Lucida",Font.BOLD,24));
			
			 JLabel label1 = new JLabel("Height(m):");
			 label1.setBounds(100, 100, 100, 20);
			 panel.add(label1);
			 
			 JLabel label2 = new JLabel("Weight(kg): ");
			 label2.setBounds(100, 120, 100, 20);
			 panel.add(label2);
			 
			 JTextField text1 = new JTextField();
			 text1.setBounds(180, 100, 100, 20);
			 panel.add(text1);
			 
			 JTextField text2 = new JTextField();
			 text2.setBounds(180, 120, 100, 20);
			 panel.add(text2);
			 
			 
			 JButton button = new JButton("CALCULATE");
			 button.setBounds(150, 150, 150, 20);
			 
			 JLabel label3 = new JLabel("");
			 label3.setBounds(150, 200, 100, 20);
			 panel.add(label3);
			 
			 JLabel label4 = new JLabel("");
			 label4.setBounds(150, 220, 100, 20);
			 panel.add(label4);
			 
			 
			 
			 
			 
			 
			 
			 button.addActionListener
				(
						new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{
								double height = Double.parseDouble(text1.getText());
								double weight = Double.parseDouble(text2.getText());
								double bmi;
								
						        bmi = weight /(height*height);
						        
						       label3.setText(String.valueOf("Your BMI is "+bmi));
							
						       if (bmi<16) {
						    	   label4.setText("You are Thin");
						       }
						       else if (16<bmi && bmi>23) {
						    	   label4.setText("You are Normal");
						    	   }
						       else if(bmi >23) {
						    	   label4.setText("You are Obeious");
						       }
							}
						}
				);
			 
			
			 
			 panel.add(label1);
			 panel.add(label2);
			 panel.add(label01);
			 panel.add(label3);
			 panel.add(label4);
			    
				panel.add(button);
			    frame.add(panel); // add the panel to the frame
				
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to terminate the program on closing the frame
				frame.setVisible(true);
		}

	}



