package com.sgic.java.awt.skills;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;

public class Skill_table {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Skill_table window = new Skill_table();
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
	public Skill_table() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 746, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("CANDIDATE SKILL SET");
		label.setFont(new Font("Arial Black", Font.BOLD, 18));
		label.setBounds(234, 21, 242, 26);
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("Add New Data");
		btnNewButton.setBounds(515, 60, 131, 36);
		frame.getContentPane().add(btnNewButton);
		
		table = new JTable();
		table.setBorder(UIManager.getBorder("TextArea.border"));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"NIC Number", "Name", "Front End Skills", "Back End Skills", "Frame Works"},
				{null, null, null, "", null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"NIC Number", "Name", "Front End Skills", "Back End Skills", "Frame Works"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(99);
		table.getColumnModel().getColumn(1).setPreferredWidth(107);
		table.getColumnModel().getColumn(2).setPreferredWidth(111);
		table.getColumnModel().getColumn(3).setPreferredWidth(108);
		table.getColumnModel().getColumn(4).setPreferredWidth(120);
		table.setBounds(86, 107, 572, 185);
		frame.getContentPane().add(table);
	}
}
