package com.sgic.java.awt.distance;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Distance_SelectDistance {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Distance_SelectDistance window = new Distance_SelectDistance();
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
	public Distance_SelectDistance() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 636, 311);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Distance Between Cities");
		label.setFont(new Font("Arial Black", Font.BOLD, 16));
		label.setBounds(194, 11, 231, 35);
		frame.getContentPane().add(label);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setBounds(58, 81, 48, 14);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setBounds(209, 81, 48, 14);
		frame.getContentPane().add(lblTo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("Select City");
		comboBox.setBounds(58, 106, 95, 22);
		frame.getContentPane().add(comboBox);
		comboBox.addItem("Jaffna");
		comboBox.addItem("Kilinochi");
		comboBox.addItem("Vavuniya");
		comboBox.addItem("Colombo");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setToolTipText("Select City");
		comboBox_1.setBounds(209, 106, 95, 22);
		frame.getContentPane().add(comboBox_1);
		comboBox_1.addItem("Jaffna");
		comboBox_1.addItem("Kilinochi");
		comboBox_1.addItem("Vavuniya");
		comboBox_1.addItem("Colombo");
		
		JButton btnGetDistance = new JButton("Get Distance");
		btnGetDistance.setBounds(374, 106, 115, 23);
		frame.getContentPane().add(btnGetDistance);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(58, 166, 431, 35);
		frame.getContentPane().add(label_1);
	}
}
