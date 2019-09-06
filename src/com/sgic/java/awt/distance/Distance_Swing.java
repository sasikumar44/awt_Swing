
package com.sgic.java.awt.distance;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Distance_Swing {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Distance_Swing window = new Distance_Swing();
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
	public Distance_Swing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 581, 190);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDistanceBetweenCities = new JLabel("Distance Between Cities");
		lblDistanceBetweenCities.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblDistanceBetweenCities.setBounds(166, 11, 231, 35);
		frame.getContentPane().add(lblDistanceBetweenCities);
		
		JButton btnEnterDistance = new JButton("Enter Distance");
		btnEnterDistance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Distance_AddDistance addDistance = new Distance_AddDistance();
				//addDistance.initialize();
				addDistance.frame.setVisible(true);
			}
		});
		btnEnterDistance.setBounds(87, 78, 108, 23);
		frame.getContentPane().add(btnEnterDistance);
		
		JButton btnFindDistance = new JButton("Find Distance");
		btnFindDistance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Distance_SelectDistance distance = new Distance_SelectDistance();
				distance.frame.setVisible(true);
				
			}
		});
		btnFindDistance.setBounds(327, 78, 108, 23);
		frame.getContentPane().add(btnFindDistance);
	}
}
