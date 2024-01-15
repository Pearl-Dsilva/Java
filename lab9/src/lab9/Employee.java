package lab9;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Employee extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;

	static final String DB_URL = "jdbc:mysql://localhost:3306/mca";
	static final String USER = "root";
	static final String PASS = "Zombie@2347245";
	static final String QUERY = "SELECT id, first, last, age FROM Employees";
	private JLabel lblAge;
	private JTextField textField;
	private JLabel lblDepartment;
	private JTextField textField_2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee frame = new Employee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void insert(String name, String age, String department) {
		Connection conn;
		try {
			int newAge = Integer.parseInt(age);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			PreparedStatement stmt = conn.prepareStatement("insert into employee (name, age, department) values(?,?,?)");
			stmt.setInt(2, newAge);
			stmt.setString(1, name);
			stmt.setString(3, department);
			int rows = stmt.executeUpdate();
			if (rows > 0) {
				JOptionPane.showMessageDialog(this, "Inserted Successfully!");
			} else {
				JOptionPane.showMessageDialog(this, "Error");
			}
			conn.close();
		} catch (SQLException | NumberFormatException e) {
			e.printStackTrace();
		}
	}

	public Employee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField_1 = new JTextField();
		textField_1.setBounds(191, 51, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addActionListener((e) -> {

			insert(textField_1.getText(), textField.getText(), textField_2.getText());

		});
		btnNewButton.setBounds(159, 140, 85, 21);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(110, 51, 45, 13);
		contentPane.add(lblNewLabel);

		lblAge = new JLabel("Age");
		lblAge.setBounds(110, 80, 45, 13);
		contentPane.add(lblAge);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(191, 80, 96, 19);
		contentPane.add(textField);

		lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(110, 106, 71, 13);
		contentPane.add(lblDepartment);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(191, 106, 96, 19);
		contentPane.add(textField_2);
	}
}
