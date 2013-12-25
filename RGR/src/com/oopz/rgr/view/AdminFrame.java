package com.oopz.rgr.view;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AdminFrame extends JFrame {

	private JPanel topPanel;
	private JTextField blockCardText;
	private JButton blockCardButton;
	private JButton logoutButton;

	public AdminFrame() {

		setTitle("Administrator");

		topPanel = new JPanel();
		topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.LINE_AXIS));

		blockCardText = new JTextField(10);
		blockCardButton = new JButton("Block Card");
		logoutButton = new JButton("Logout");

		topPanel.add(blockCardText);
		topPanel.add(Box.createRigidArea(new Dimension(10, 0)));
		topPanel.add(blockCardButton);
		topPanel.add(Box.createRigidArea(new Dimension(10, 0)));
		topPanel.add(logoutButton);
		topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		add(topPanel);

		pack();
		setLocationRelativeTo(null);
	}

	public JButton getBlockCardButton() {
		return blockCardButton;
	}

	public JButton getLogoutButton() {
		return logoutButton;
	}

	public JTextField getBlockCardTextField() {
		return blockCardText;
	}
}
