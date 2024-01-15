package lab9;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTable;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class DisplayEmployee extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisplayEmployee frame = new DisplayEmployee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void populatedTable(int id, String name, int age, String department) {
		Object[] row = { id, name, age, department };

		DefaultTableModel model = (DefaultTableModel) table.getModel();

		model.addRow(row);
	}

	public void ReadData() {
		Connection con;
		try {
			con = DriverManager.getConnection(Employee.DB_URL, Employee.USER, Employee.PASS);

			// Query which needs parameters
			String query = "Select * from employee";

			// Prepare Statement
			PreparedStatement myStmt = con.prepareStatement(query);

			// Execute SQL query
			ResultSet myRs = myStmt.executeQuery();

			System.out.println("Name  Age  Department");

			// Display function to show the Resultset
			while (myRs.next()) {
				int id = myRs.getInt("id");
				String Name = myRs.getString("name");
				int age = myRs.getInt("age");
				String Department = myRs.getString("department");
				System.out.println(Name + "     " + age + "   " + Department);
				populatedTable(id, Name, age, Department);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public DisplayEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		table = new JTable();
		table.setModel(
				new DefaultTableModel(new Object[][] {}, new String[] { "Sr. No.", "Name", "Age", "Department" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(66);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setPreferredWidth(174);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 53, 416, 199);

		contentPane.add(scrollPane);
		contentPane.add(table.getTableHeader());
		ReadData();
	}

}
