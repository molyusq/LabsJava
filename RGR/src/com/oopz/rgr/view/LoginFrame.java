package com.oopz.rgr.view;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {
	
	private JPanel topPanel = new JPanel();
	
	private JTextField loginTextField;
	private JTextField passwordTextField;
	
	private JLabel loginLabel;
	private JLabel passwordLabel;
	
	private JButton okButton;
	private JButton exitButton;
	
	
	public LoginFrame() {
		loginTextField = new JTextField(10);
		passwordTextField = new JTextField(10);
		
		loginLabel = new JLabel("Login");
		passwordLabel = new JLabel("Password");
		
		okButton = new JButton("OK");
		exitButton = new JButton("Exit");
		
		topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.PAGE_AXIS));
		
		JPanel labelTextPanel = new JPanel();
		labelTextPanel.setLayout(new BoxLayout(labelTextPanel, BoxLayout.LINE_AXIS));
		
		JPanel labelPanel = new JPanel();
		labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.PAGE_AXIS));
		labelPanel.add(loginLabel);
		labelPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		labelPanel.add(passwordLabel);
		labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));
		
		JPanel textPanel = new JPanel();
		textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.PAGE_AXIS));
		textPanel.add(loginTextField);
		textPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		textPanel.add(passwordTextField);
		textPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));
		
		labelTextPanel.add(labelPanel);
		labelTextPanel.add(textPanel);
		
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.LINE_AXIS));
		buttonPanel.add(Box.createHorizontalGlue());
		buttonPanel.add(okButton);
		buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
		buttonPanel.add(exitButton);
		buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 10));


		topPanel.add(labelTextPanel);
		topPanel.add(buttonPanel);
		
		add(topPanel);
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
	}


	public JTextField getLoginTextField() {
		return loginTextField;
	}


	public void setLoginTextField(JTextField loginTextField) {
		this.loginTextField = loginTextField;
	}


	public JTextField getPasswordTextField() {
		return passwordTextField;
	}


	public void setPasswordTextField(JTextField passwordTextField) {
		this.passwordTextField = passwordTextField;
	}


	public JButton getOkButton() {
		return okButton;
	}


	public void setOkButton(JButton okButton) {
		this.okButton = okButton;
	}


	public JButton getExitButton() {
		return exitButton;
	}


	public void setExitButton(JButton exitButton) {
		this.exitButton = exitButton;
	}
}
