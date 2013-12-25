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
		
		JPanel loginPanel = new JPanel();
		loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.LINE_AXIS));
		loginPanel.add(loginLabel);
		loginPanel.add(Box.createRigidArea(new Dimension(10, 0)));
		loginPanel.add(loginTextField);
		loginPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));
		
		JPanel passwordPanel = new JPanel();
		passwordPanel.setLayout(new BoxLayout(passwordPanel, BoxLayout.LINE_AXIS));
		passwordPanel.add(passwordLabel);
		passwordPanel.add(Box.createRigidArea(new Dimension(10, 0)));
		passwordPanel.add(passwordTextField);
		passwordPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.LINE_AXIS));
		buttonPanel.add(Box.createHorizontalGlue());
		buttonPanel.add(okButton);
		buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
		buttonPanel.add(exitButton);
		buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 10));


		topPanel.add(loginPanel);
		topPanel.add(passwordPanel);
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
