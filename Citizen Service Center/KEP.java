import java.awt.*;
import javax.swing.*;
public class KEP {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KEP window = new KEP();
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
	public KEP() {
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
		textField.setColumns(10);
		textField.setBackground(new Color(0, 139, 139));
		textField.setBounds(0, 0, 434, 38);
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 26));
		textField.setText("\u03A3\u03A5\u039D\u0394\u0395\u03A3\u0397");
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(0, 139, 139));
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_1.setEditable(false);
		textField_1.setText("\u039F\u039D\u039F\u039C\u0391 \u03A7\u03A1\u0397\u03A3\u03A4\u0397");
		textField_1.setBounds(10, 89, 145, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(207, 91, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(0, 139, 139));
		textField_3.setEditable(false);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_3.setText("\u039A\u03A9\u0394\u0399\u039A\u039F\u03A3");
		textField_3.setBounds(10, 155, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(207, 157, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton button = new JButton("\u03A3\u03A5\u039D\u0394\u0395\u03A3\u0397");
		button.setBounds(207, 205, 89, 23);
		frame.getContentPane().add(button);
	}
}
