package com.sgic.java.awt.skills;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class Skill_main {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Skill_main window = new Skill_main();
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
	public Skill_main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 666, 415);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCandidateSkillSet = new JLabel("CANDIDATE SKILL SET");
		lblCandidateSkillSet.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblCandidateSkillSet.setBounds(196, 25, 242, 26);
		frame.getContentPane().add(lblCandidateSkillSet);
		
		JLabel lblNic = new JLabel("NIC NO:");
		lblNic.setBounds(39, 87, 48, 14);
		frame.getContentPane().add(lblNic);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(366, 87, 48, 14);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(110, 84, 172, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(418, 84, 178, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblSkillSet = new JLabel("Skill Set:");
		lblSkillSet.setBounds(39, 140, 59, 14);
		frame.getContentPane().add(lblSkillSet);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("C");
		chckbxNewCheckBox.setBounds(110, 140, 122, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxJava = new JCheckBox("C++");
		chckbxJava.setBounds(110, 166, 122, 23);
		frame.getContentPane().add(chckbxJava);
		
		JCheckBox chckbxJava_1 = new JCheckBox("JAVA");
		chckbxJava_1.setBounds(110, 192, 122, 23);
		frame.getContentPane().add(chckbxJava_1);
		
		JCheckBox chckbxPhp = new JCheckBox("php");
		chckbxPhp.setBounds(110, 218, 122, 23);
		frame.getContentPane().add(chckbxPhp);
		
		JCheckBox chckbxPython = new JCheckBox("python");
		chckbxPython.setBounds(110, 244, 122, 23);
		frame.getContentPane().add(chckbxPython);
		
		JCheckBox chckbxReactJs = new JCheckBox("react js");
		chckbxReactJs.setBounds(250, 140, 122, 23);
		frame.getContentPane().add(chckbxReactJs);
		
		JCheckBox chckbxVueJs = new JCheckBox("vue js");
		chckbxVueJs.setBounds(250, 166, 122, 23);
		frame.getContentPane().add(chckbxVueJs);
		
		JCheckBox chckbxAngularJs = new JCheckBox("angular js");
		chckbxAngularJs.setBounds(250, 192, 122, 23);
		frame.getContentPane().add(chckbxAngularJs);
		
		JCheckBox chckbxAngular = new JCheckBox("angular");
		chckbxAngular.setBounds(250, 218, 122, 23);
		frame.getContentPane().add(chckbxAngular);
		
		JCheckBox chckbxJquery = new JCheckBox("jquery");
		chckbxJquery.setBounds(250, 244, 122, 23);
		frame.getContentPane().add(chckbxJquery);
		
		JCheckBox chckbxLaravel = new JCheckBox("Laravel");
		chckbxLaravel.setBounds(385, 140, 122, 23);
		frame.getContentPane().add(chckbxLaravel);
		
		JCheckBox chckbxLumen = new JCheckBox("Lumen");
		chckbxLumen.setBounds(385, 166, 122, 23);
		frame.getContentPane().add(chckbxLumen);
		
		JCheckBox chckbxSpringBoot = new JCheckBox("Spring Boot");
		chckbxSpringBoot.setBounds(385, 192, 122, 23);
		frame.getContentPane().add(chckbxSpringBoot);
		
		JCheckBox chckbxSpring = new JCheckBox("Spring");
		chckbxSpring.setBounds(385, 218, 122, 23);
		frame.getContentPane().add(chckbxSpring);
	}
}
