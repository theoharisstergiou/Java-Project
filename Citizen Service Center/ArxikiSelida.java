import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class ArxikiSelida {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArxikiSelida window = new ArxikiSelida();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ArxikiSelida() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 139, 139));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(0, 139, 139));
		textField.setFont(new Font("Tahoma", Font.BOLD, 26));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setText("\u0391\u03A1\u03A7\u0399\u039A\u0397 \u03A3\u0395\u039B\u0399\u0394\u0391");
		textField.setBounds(10, 11, 414, 53);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u03A5\u03A0\u0397\u03A1\u0395\u03A3\u0399\u0395\u03A3");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(160, 100, 122, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u039B\u039F\u0393\u0391\u03A1\u0399\u0391\u03A3\u039C\u039F\u03A3");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(160, 151, 122, 40);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u0395\u03A0\u0399\u039A\u039F\u0399\u039D\u03A9\u039D\u0399\u0391");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(160, 202, 122, 40);
		frame.getContentPane().add(btnNewButton_2);
	}
}
