package com.oopz.lab3.task2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiHandler extends JFrame {

	private JPanel panel = new JPanel();
	private JTextField vectorInput1;
	private JTextField vectorInput2;
	
	private JLabel collinearLabel;
	private JLabel orthogonalLabel;
	
	private Vector vector1;
	private Vector vector2;

	private VectorChecker checker;

	public GuiHandler() {
		setTitle("Lab #3 Task #2");
		setSize(300, 200);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void initGui() {
		
		GroupLayout layout = new GroupLayout(panel);
		panel.setLayout(layout);
		
		layout.setAutoCreateContainerGaps(true);
		layout.setAutoCreateGaps(true);
		
		add(panel);
		
		collinearLabel = new JLabel("Enter vectors");
		orthogonalLabel= new JLabel("to see results");
		
		vectorInput1 = new JTextField(20);
		vectorInput2 = new JTextField(20);

		JButton checkButton = new JButton("Check Vectors");
		checkButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					vector1 = new Vector(vectorInput1.getText());
					vector2 = new Vector(vectorInput2.getText());
					checker = new VectorChecker(vector1, vector2);
					
					collinearLabel.setText("Vectors are " + (checker.areCollinear() ? "" : "not ") + "collinear");
					orthogonalLabel.setText("Vectors are " + (checker.areOrthogonal() ? "" : "not ") + "orthogonal");
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(panel, e.getMessage(), "Error",
							getDefaultCloseOperation());
				}
			}
		});
		
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER).
										addGroup(layout.createSequentialGroup().
									                        addGroup(layout.createParallelGroup().
									                        	                addComponent(vectorInput1).
									                        	                addComponent(vectorInput2)).
									                        addComponent(checkButton)).
				                        addGroup(layout.createParallelGroup().
				                        		            addComponent(collinearLabel).
				                        		            addComponent(orthogonalLabel)));
		
		layout.setVerticalGroup(layout.createSequentialGroup().addGroup(
				 					layout.createParallelGroup(GroupLayout.Alignment.CENTER).
				 							addGroup(layout.createSequentialGroup().
																addComponent(vectorInput1).
																addComponent(vectorInput2)).
											addComponent(checkButton)).addGroup(
									layout.createSequentialGroup().
											addComponent(collinearLabel).
											addComponent(orthogonalLabel)));

		pack();
	}

	public static void main(String[] args) {
		GuiHandler handler = new GuiHandler();
		handler.initGui();
	}
}
