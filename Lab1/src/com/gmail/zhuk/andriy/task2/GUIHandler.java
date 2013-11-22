package com.gmail.zhuk.andriy.task2;

import java.awt.event.*;

import javax.swing.*;

public class GUIHandler extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel panel = new JPanel();
	private JButton confirmButton;
	private JTextField input;
	private JLabel label;
	private DividendFinder finder;
	private JLabel result;
	private boolean clickedOnce = false;
	private int count;

	public GUIHandler(int width, int height, String title, DividendFinder finder) {
		setTitle(title);
		setSize(width, height);
		setVisible(true);
		this.finder = finder;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void initGUI() {
		add(panel);
		input = new JTextField(20);
		label = new JLabel("Enter quantity:");
		result = new JLabel();
		confirmButton = new JButton("OK");
		confirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!clickedOnce) {
					clickedOnce = true;
					count = Integer.parseInt(input.getText());
					input.setText("");
				}
				else if(count != 0) {
					finder.add(Integer.parseInt(input.getText()));
					String message = finder.findDividends().toString();
					input.setText("");
					result.setText("Result: " + message);
					count--;
					if(count == 0) {
						JOptionPane.showMessageDialog(panel, "Done!");
						input.setEditable(false);
						confirmButton.setEnabled(false);
					}
				}
				label.setText("Enter elements: (" + count + ") left");
				input.requestFocus();
			}
		});
		panel.add(label);
		panel.add(input);
		panel.add(confirmButton);
		panel.add(result);
		//pack();
	}
}

