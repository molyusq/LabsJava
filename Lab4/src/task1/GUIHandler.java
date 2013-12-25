package task1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

public class GUIHandler extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel main = new JPanel(new BorderLayout());
	StudentOfFaculty newStudent = new StudentOfFaculty("name", "surname", 0, 0, "faculty");

	public GUIHandler(int width, int height, String title) {
		setTitle(title);
		setSize(width, height);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void initGUI() {
		add(main);
		JPanel top = new JPanel(new BorderLayout());
		main.add(top, BorderLayout.NORTH);
		JPanel bottom = new JPanel(new BorderLayout());
		main.add(bottom, BorderLayout.SOUTH);
		final String[] columnNames = { "First Name", "Last Name", "Age",
				"Grade", "Faculty" };
		final DefaultTableModel newRecordModel = new DefaultTableModel(
				new Object[][] { newStudent.getObjectData() }, columnNames);
		newRecordModel.addTableModelListener(new TableModelListener() {

			@Override
			public void tableChanged(TableModelEvent e) {
				int row = e.getFirstRow();
				int column = e.getColumn();
				TableModel model = (TableModel) e.getSource();
				Object data = model.getValueAt(row, column);
				switch (column) {
				case (0):
					newStudent.setName(data.toString());
					break;
				case (1):
					newStudent.setSurname(data.toString());
					break;
				case (2):
					newStudent.setAge(Integer.parseInt(data.toString()));
					break;
				case (3):
					newStudent.setCourse(Integer.parseInt(data.toString()));
					break;
				case (4):
					newStudent.setFacultyName(data.toString());
					break;
				}
			}
		});
		final JTable editTable = new JTable(newRecordModel);
		JTableHeader header = editTable.getTableHeader();
		top.add(header, BorderLayout.NORTH);
		top.add(editTable, BorderLayout.CENTER);
		JButton newBtn = new JButton("Add new");
		top.add(newBtn, BorderLayout.SOUTH);
		final JTable listTable = new JTable();
		final DefaultTableModel listModel = new DefaultTableModel(null,
				columnNames) {

			private static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable(int row, int col) {
				return false;
			}
		};
		listTable.setModel(listModel);
		listTable.setPreferredScrollableViewportSize(new Dimension(this
				.getWidth(), 200));
		listTable.setFillsViewportHeight(true);
		bottom.add(new JScrollPane(listTable), BorderLayout.NORTH);
		JButton delBtn = new JButton("Remove selected");
		bottom.add(delBtn, BorderLayout.SOUTH);
		newBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				listModel.addRow(newStudent.getObjectData());				
			}

		});
		delBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel) listTable
						.getModel();
				int[] rows = listTable.getSelectedRows();
				for (int i = 0; i < rows.length; i++) {
					model.removeRow(rows[i] - i);
				}
			}

		});
		pack();
	}
}
