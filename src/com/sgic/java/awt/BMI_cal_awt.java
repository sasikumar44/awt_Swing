package com.sgic.java.awt;


import java.awt.Font;
import java.awt.*;
import java.awt.event.*;

public class BMI_cal_awt {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	     Cal();
		}
		
		public static  void Cal() {
			
			
			Frame frame = new Frame("BMI Calculator");
			frame.setSize(400,400);
			frame.setResizable(false);
			
			
			Panel panel = new Panel();
			panel.setLayout(null);
			
			Label label01 = new Label("BMI Calculator:");
			 label01.setBounds(150, 50, 400, 20);
			 panel.add(label01);
			 label01.setFont(new Font("Lucida",Font.BOLD,24));
			
			 Label label1 = new Label("Height(m):");
			 label1.setBounds(100, 100, 100, 20);
			 panel.add(label1);
			 
			 Label label2 = new Label("Weight(kg): ");
			 label2.setBounds(100, 120, 100, 20);
			 panel.add(label2);
			 
			 TextField text1 = new TextField();
			 text1.setBounds(180, 100, 100, 20);
			 panel.add(text1);
			 
			 TextField text2 = new TextField();
			 text2.setBounds(180, 120, 100, 20);
			 panel.add(text2);
			 
			 
			 Button button = new Button("CALCULATE");
			 button.setBounds(150, 150, 150, 20);
			 
			 Label label3 = new Label("");
			 label3.setBounds(150, 200, 100, 20);
			 panel.add(label3);
			 
			 Label label4 = new Label("");
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
			 
			 frame.addWindowListener(new WindowAdapter() {
		            public void windowClosing(WindowEvent we) {
		                System.exit(0);
		            }
		        });
			    
				panel.add(button);
			    frame.add(panel); // add the panel to the frame
				
				//frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); // to terminate the program on closing the frame
				frame.setVisible(true);
		}

	}



