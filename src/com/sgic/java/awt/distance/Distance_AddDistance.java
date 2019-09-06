package com.sgic.java.awt.distance;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Distance_AddDistance {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private int[] city = new int[16];
	private static int[][] city1 = new int[4][4];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Distance_AddDistance window = new Distance_AddDistance();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Distance_AddDistance() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 636, 346);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDistanceBetweenCities = new JLabel("Distance Between Cities");
		lblDistanceBetweenCities.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblDistanceBetweenCities.setBounds(220, 25, 234, 23);
		frame.getContentPane().add(lblDistanceBetweenCities);
		
		JLabel lblJaffna = new JLabel("Kilinochi");
		lblJaffna.setBounds(35, 135, 63, 14);
		frame.getContentPane().add(lblJaffna);
		
		JLabel label = new JLabel("Jaffna");
		label.setBounds(35, 100, 48, 14);
		frame.getContentPane().add(label);
		
		JLabel lblVavuniya = new JLabel("Vavuniya");
		lblVavuniya.setBounds(35, 171, 63, 14);
		frame.getContentPane().add(lblVavuniya);
		
		JLabel lblColombo = new JLabel("Colombo");
		lblColombo.setBounds(35, 206, 63, 14);
		frame.getContentPane().add(lblColombo);
		
		JLabel label_1 = new JLabel("Colombo");
		label_1.setBounds(455, 72, 57, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Vavuniya");
		label_2.setBounds(347, 72, 57, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Kilinochi");
		label_3.setBounds(243, 72, 57, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Jaffna");
		label_4.setBounds(134, 72, 48, 14);
		frame.getContentPane().add(label_4);
		
		textField = new JTextField();
		textField.setBounds(108, 97, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(220, 97, 96, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(326, 97, 96, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(435, 97, 96, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(108, 132, 96, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(220, 132, 96, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(326, 132, 96, 20);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(435, 132, 96, 20);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(108, 168, 96, 20);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(220, 168, 96, 20);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(326, 168, 96, 20);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(435, 168, 96, 20);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(108, 203, 96, 20);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(220, 203, 96, 20);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(326, 203, 96, 20);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(435, 203, 96, 20);
		frame.getContentPane().add(textField_15);
		
		JButton btnEnterData = new JButton("Enter Data");
		btnEnterData.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(insertData()) {
					label_4.setText("Success!");
				}
				else {
					label_4.setText("Failed!");
				}
				
			}
			
		});
		
		btnEnterData.setBounds(442, 248, 89, 23);
		frame.getContentPane().add(btnEnterData);
	}
	
	
	public boolean insertData() {
		city[0]=Integer.parseInt(textField.getText());
		city[1]=Integer.parseInt(textField_1.getText());
		city[2]=Integer.parseInt(textField_2.getText());
		city[3]=Integer.parseInt(textField_3.getText());
		city[4]=Integer.parseInt(textField_4.getText());
		city[5]=Integer.parseInt(textField_5.getText());
		city[6]=Integer.parseInt(textField_6.getText());
		city[7]=Integer.parseInt(textField_7.getText());
		city[8]=Integer.parseInt(textField_8.getText());
		city[9]=Integer.parseInt(textField_9.getText());
		city[10]=Integer.parseInt(textField_10.getText());
		city[11]=Integer.parseInt(textField_11.getText());
		city[12]=Integer.parseInt(textField_12.getText());
		city[13]=Integer.parseInt(textField_13.getText());
		city[14]=Integer.parseInt(textField_14.getText());
		city[15]=Integer.parseInt(textField_15.getText());
		
		int k=0;
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				city1[i][j]=city[k];
				k++;
			}
		}
		
		return true;
	}
	
	public static int getDistance(int a, int b) {
		return city1[a][b];
	}
}
