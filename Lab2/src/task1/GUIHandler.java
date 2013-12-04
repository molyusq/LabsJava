package task1;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.*;

public class GUIHandler extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel page1 = new JPanel();
	private JPanel page2 = new JPanel(new FlowLayout());
	private JTextField input;
	private ArrayList<JTextField> inputs = new ArrayList<JTextField>();
	private StringsModel model;

	public GUIHandler(int width, int height, String title) {
		setTitle(title);
		setSize(width, height);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void initGUI() {
		add(page1);
		Box iconPanel = new Box(BoxLayout.Y_AXIS);
		input = new JTextField(20);
		JButton confirmButton = new JButton("Next");
		confirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num = Integer.parseInt(input.getText());
					if (num < 1)
						num = 1;
					model = new StringsModel(num);
					gotoSecondPage();
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(page1, ex.toString(),
							"Error", getDefaultCloseOperation());
				}
			}
		});
		iconPanel.add(input);
		iconPanel.add(confirmButton);
		page1.add(iconPanel);
		pack();
	}

	private void gotoSecondPage() {
		remove(page1);
		add(page2);
		Box iconPanel = new Box(BoxLayout.Y_AXIS);
		for (int i = 0; i < model.count(); i++) {
			JTextField inp = new JTextField(20);
			inputs.add(inp);
			iconPanel.add(inp);
		}
		JButton resultButton = new JButton("Result");
		resultButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Iterator it = inputs.iterator();
				int i = 0;
				while (it.hasNext()) {
					JTextField inp = (JTextField) it.next();
					model.addString(i, inp.getText());
					i++;
				}
				String str = model.getMaxLengthString();
				JOptionPane.showMessageDialog(page1,
						str + " :len=" + str.length(), "Result",
						getDefaultCloseOperation());
			}
		});
		iconPanel.add(resultButton);
		page2.add(iconPanel);
		pack();
	}
}
