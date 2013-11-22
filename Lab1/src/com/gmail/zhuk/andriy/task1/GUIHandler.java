package com.gmail.zhuk.andriy.task1;

import java.awt.event.*;

import javax.swing.*;

public class GUIHandler extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel = new JPanel();
	private JButton confirmButton;
	private JTextField input;
	private PasswordChecker checker;

	public GUIHandler(int width, int height, String title, PasswordChecker checker) {
		setTitle(title);
		setSize(width, height);
		setVisible(true);
		this.checker = checker;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void initGUI() {
		add(panel);
		input = new JTextField(20);
		confirmButton = new JButton("Confirm");
		confirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message;
				boolean checked = checker.checkPassword(input.getText());
				if (checked)
					message = "Welcome!";
				else message = "Access denied!";
				JOptionPane.showMessageDialog(panel, message, "Result", getDefaultCloseOperation());
				input.setText("");
			}
		});
		panel.add(input);
		panel.add(confirmButton);
		pack();
	}
}
