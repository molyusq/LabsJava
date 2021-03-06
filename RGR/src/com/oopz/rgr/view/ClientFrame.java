package com.oopz.rgr.view;

import java.awt.Dimension;
import java.awt.Font;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.oopz.rgr.model.Client;

public class ClientFrame extends JFrame implements PropertyChangeListener {

	private JPanel topPanel;
	private JPanel clientInfoPanel;
	private JPanel actionsPanel;

	private JLabel clientInfoLabel;
	private JLabel nameLabel;
	private JLabel nameContentLabel;
	private JLabel surnameLabel;
	private JLabel surnameContentLabel;
	private JLabel accountLabel;
	private JLabel accountContentLabel;
	private JLabel creditCardLabel;
	private JLabel creditCardContentLabel;

	private JTextField orderText;
	private JButton payOrderButton;

	private JTextField toAccountText;
	private JTextField amountText;
	private JButton sendButton;

	private JButton blockCardButton;
	private JButton annAccountButton;
	private JButton logoutButton;

	private Client model;

	public ClientFrame() {

		setTitle("Client");

		topPanel = new JPanel();
		topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.LINE_AXIS));

		initInfoPanel();
		initActionsPanel();

		topPanel.add(clientInfoPanel);
		topPanel.add(Box.createRigidArea(new Dimension(25, 0)));
		topPanel.add(actionsPanel);

		add(topPanel);

		pack();
		setLocationRelativeTo(null);
	}

	private void initActionsPanel() {
		actionsPanel = new JPanel();
		actionsPanel
				.setLayout(new BoxLayout(actionsPanel, BoxLayout.PAGE_AXIS));

		orderText = new JTextField("Order ID", 15);
		payOrderButton = new JButton("Pay Order");

		toAccountText = new JTextField("Account ID", 15);
		amountText = new JTextField("Money Amount", 5);
		sendButton = new JButton("Send");

		JPanel actionsInnerPanel = new JPanel();
		GroupLayout layout = new GroupLayout(actionsInnerPanel);
		actionsInnerPanel.setLayout(layout);

		layout.setAutoCreateContainerGaps(true);
		layout.setAutoCreateGaps(true);
		layout.setHorizontalGroup(layout
				.createSequentialGroup()
				.addGroup(
						layout.createParallelGroup().addComponent(orderText)
								.addComponent(toAccountText)
								.addComponent(amountText))
				.addGroup(
						layout.createParallelGroup()
								.addComponent(payOrderButton)
								.addComponent(sendButton)));

		layout.setVerticalGroup(layout
				.createSequentialGroup()
				.addGroup(
						layout.createParallelGroup(GroupLayout.Alignment.CENTER)
								.addComponent(orderText)
								.addComponent(payOrderButton))
				.addGroup(
						layout.createParallelGroup(GroupLayout.Alignment.CENTER)
								.addGroup(
										layout.createSequentialGroup()
												.addComponent(toAccountText)
												.addComponent(amountText))
								.addComponent(sendButton)));

		JPanel buttonInnerPanel = new JPanel();
		buttonInnerPanel.setLayout(new BoxLayout(buttonInnerPanel,
				BoxLayout.LINE_AXIS));

		blockCardButton = new JButton("Block card");
		annAccountButton = new JButton("Annulate account");
		logoutButton = new JButton("Logout");

		buttonInnerPanel.add(blockCardButton);
		buttonInnerPanel.add(Box.createRigidArea(new Dimension(10, 0)));
		buttonInnerPanel.add(annAccountButton);
		buttonInnerPanel.add(Box.createRigidArea(new Dimension(10, 0)));
		buttonInnerPanel.add(logoutButton);
		buttonInnerPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10,
				10));

		actionsPanel.add(actionsInnerPanel);
		actionsPanel.add(buttonInnerPanel);
	}

	private void initInfoPanel() {

		clientInfoLabel = new JLabel("Client info");
		clientInfoLabel.setFont(new Font(clientInfoLabel.getName(), Font.PLAIN,
				16));

		nameLabel = new JLabel("Name :");
		surnameLabel = new JLabel("Surname :");
		accountLabel = new JLabel("Account :");
		creditCardLabel = new JLabel("Credit Card :");

		nameContentLabel = new JLabel("Unnamed");
		surnameContentLabel = new JLabel("Unnamed");
		accountContentLabel = new JLabel("No account info");
		creditCardContentLabel = new JLabel("No credit card info");

		clientInfoPanel = new JPanel();
		clientInfoPanel.setLayout(new BoxLayout(clientInfoPanel,
				BoxLayout.PAGE_AXIS));

		JPanel labelPanel = new JPanel();
		labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.PAGE_AXIS));

		labelPanel.add(nameLabel);
		labelPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		labelPanel.add(surnameLabel);
		labelPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		labelPanel.add(accountLabel);
		labelPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		labelPanel.add(creditCardLabel);

		JPanel contentPanel = new JPanel();
		contentPanel
				.setLayout(new BoxLayout(contentPanel, BoxLayout.PAGE_AXIS));

		contentPanel.add(nameContentLabel);
		contentPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		contentPanel.add(surnameContentLabel);
		contentPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		contentPanel.add(accountContentLabel);
		contentPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		contentPanel.add(creditCardContentLabel);

		JPanel labelContentPanel = new JPanel();
		labelContentPanel.setLayout(new BoxLayout(labelContentPanel,
				BoxLayout.LINE_AXIS));

		labelContentPanel.add(labelPanel);
		labelContentPanel.add(Box.createRigidArea(new Dimension(10, 0)));
		labelContentPanel.add(contentPanel);
		labelContentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 0,
				10));

		clientInfoPanel.add(clientInfoLabel);
		clientInfoPanel.add(Box.createRigidArea(new Dimension(0, 5)));
		clientInfoPanel.add(labelContentPanel);
	}

	public void setClient(Client model) {
		this.model = model;
		this.model.addChangeListener(this);
		nameContentLabel.setText(model.getFirstName());
		surnameContentLabel.setText(model.getLastName());
		accountContentLabel.setText(model.getAccount().getData());
		creditCardContentLabel.setText(model.getCard().getData());
	}

	public Client getClient() {
		return this.model;
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals("card")) {
			creditCardContentLabel.setText(model.getCard().getData());
		}
		if (evt.getPropertyName().equals("account")) {
			accountContentLabel.setText(model.getAccount().getData());
		}
	}

	public JButton getBlockCardButton() {
		return blockCardButton;
	}

	public JButton getPayOrderButton() {
		return payOrderButton;
	}

	public JButton getAnnulateAccountButton() {
		return annAccountButton;
	}

	public JButton getLogoutButton() {
		return logoutButton;
	}

	public JButton getSendButton() {
		return sendButton;
	}

	public JTextField getToAccountText() {
		return toAccountText;
	}

	public JTextField getAmountText() {
		return amountText;
	}
}
