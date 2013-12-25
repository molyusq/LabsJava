package com.oopz.rgr.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.oopz.rgr.model.Account;
import com.oopz.rgr.model.Admin;
import com.oopz.rgr.model.Client;
import com.oopz.rgr.model.CreditCard;
import com.oopz.rgr.model.User;
import com.oopz.rgr.view.AdminFrame;
import com.oopz.rgr.view.ClientFrame;
import com.oopz.rgr.view.LoginFrame;

public class Controller {

	private ArrayList<User> userList = new ArrayList<User>();

	private LoginFrame loginFrame;
	private AdminFrame adminFrame;
	private ClientFrame clientFrame;

	public Controller() {
		userList.add(new Admin("q", "q"));
		userList.add(new Client("Rus", "Had", 21, "r", "r"));
		userList.add(new Client("Zhu", "Zhu", 21, "z", "z"));

		loginFrame = new LoginFrame();
		loginFrame.getExitButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				loginFrame.dispose();
			}
		});
		loginFrame.getOkButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String login = loginFrame.getLoginTextField().getText();
				String pass = loginFrame.getPasswordTextField().getText();
				User user = tryLogin(login, pass);
				if (user == null) {
					JOptionPane.showMessageDialog(null,
							"Error at login. Try again");
				} else {
					loginFrame.setVisible(false);
					if (user.getClass() == Admin.class) {
						adminFrame.setTitle(user.getLogin());
						adminFrame.setVisible(true);
					} else {
						clientFrame.setVisible(true);
						Client client = (Client) user;
						clientFrame.setClient(client);
					}
				}
			}
		});
		adminFrame = new AdminFrame();
		ActionListener logoutListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				adminFrame.setVisible(false);
				clientFrame.setVisible(false);
				loginFrame.setVisible(true);
			}
		};
		adminFrame.getLogoutButton().addActionListener(logoutListener);
		adminFrame.getBlockCardButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String blockUserName = adminFrame.getBlockCardTextField()
						.getText();
				User user = getUser(blockUserName);
				if (user == null) {
					JOptionPane.showMessageDialog(null, "No such user");
				} else {
					if (user.getClass() == Admin.class) {
						JOptionPane
								.showMessageDialog(null, "Admin has no card");
					} else {
						Client client = (Client) user;
						client.blockCard();
						JOptionPane.showMessageDialog(null,
								"Card blocked successfully");
					}
				}
			}
		});
		clientFrame = new ClientFrame();
		clientFrame.getBlockCardButton().addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						clientFrame.getClient().blockCard();
					}
				});
		clientFrame.getPayOrderButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				double payAmount = 50;
				CreditCard acc = clientFrame.getClient().getCard();
				clientFrame.getClient().setCreditAmount(
						acc.getCredit() - payAmount);
				JOptionPane.showMessageDialog(null, "Order payed for "
						+ payAmount + "$");
			}
		});
		clientFrame.getAnnulateAccountButton().addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						clientFrame.getClient().nullifyAccount();
					}
				});
		clientFrame.getLogoutButton().addActionListener(logoutListener);
		clientFrame.getSendButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String userName = clientFrame.getToAccountText().getText();
				String amount = clientFrame.getAmountText().getText();
				User user = getUser(userName);
				if (user == null) {
					JOptionPane.showMessageDialog(null, "No such user");
				} else {
					Account acc = ((Client) user).getAccount();
					boolean status = clientFrame
							.getClient()
							.sendToAnotherAccount(Integer.parseInt(amount), acc);
					if (!status) {
						JOptionPane.showMessageDialog(null,
								"Transaction failed!");
					}
				}
			}
		});
	}

	public User tryLogin(String login, String pass) {
		for (User u : userList) {
			if (u.getLogin().equals(login) && u.getPassword().equals(pass))
				return u;
		}
		return null;
	}

	public User getUser(String login) {
		for (User u : userList) {
			if (u.getLogin().equals(login))
				return u;
		}
		return null;
	}

	public static void main(String[] args) {
		new Controller();
	}

}
