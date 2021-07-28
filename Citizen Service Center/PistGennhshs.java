import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Window.Type;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class PistGennhshs {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_12;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PistGennhshs window = new PistGennhshs();
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
	public PistGennhshs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setFont(new Font("Dialog", Font.PLAIN, 14));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\xarhs\\OneDrive\\\u03A5\u03C0\u03BF\u03BB\u03BF\u03B3\u03B9\u03C3\u03C4\u03AE\u03C2\\KEP_(GR)_logo.png"));
		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.setBounds(100, 100, 963, 784);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("\u03A0\u0399\u03A3\u03A4\u039F\u03A0\u039F\u0399\u0397\u03A4\u0399\u039A\u039F \u0393\u0395\u039D\u039D\u0397\u03A3\u0397\u03A3");
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("\u0395\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_2 = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u03A6\u03CD\u03BB\u03BF");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_4 = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1 \u03C0\u03B1\u03C4\u03AD\u03C1\u03B1");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_5 = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1 \u03BC\u03B7\u03C4\u03AD\u03C1\u03B1\u03C2");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_7 = new JLabel("\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03AF\u03B1 \u03B3\u03AD\u03BD\u03BD\u03B7\u03C3\u03B7\u03C2");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_8 = new JLabel("\u0394\u03AE\u03BC\u03BF\u03C2 \u03B3\u03AD\u03BD\u03BD\u03B7\u03C3\u03B7\u03C2");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_9 = new JLabel("\u03A0\u03CC\u03BB\u03B7 \u03B3\u03AD\u03BD\u03BD\u03B7\u03C3\u03B7\u03C2");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_10 = new JLabel("\u039D\u03BF\u03BC\u03CC\u03C2 \u03B3\u03AD\u03BD\u03BD\u03B7\u03C3\u03B7\u03C2");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_11 = new JLabel("\u03A7\u03CE\u03C1\u03B1 \u03B3\u03AD\u03BD\u03BD\u03B7\u03C3\u03B7\u03C2");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_12 = new JLabel("\u0399\u03B8\u03B1\u03B3\u03AD\u03BD\u03B5\u03B9\u03B1");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_13 = new JLabel("\u03A0\u03B1\u03C1\u03B1\u03C4\u03B7\u03C1\u03AE\u03C3\u03B5\u03B9\u03C2:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		
		btnNewButton = new JButton("\u0388\u03BE\u03BF\u03B4\u03BF\u03C2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Exodos ar= new Exodos(); //POIA SELIDA THA ANOIKSEI META TO CLICK
				ar.NewScreen(); //ANOIGEI KAINOURGIO SCREEN
				ar.setVisible(true);
			}
		});
		
		btnNewButton_1 = new JButton("<");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Ipiresies pt=new Ipiresies();
				pt.NewScreen();
				pt.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btnNewButton_2 = new JButton("\u0395\u03BA\u03C4\u03CD\u03C0\u03C9\u03C3\u03B7");
		btnNewButton_2.setIcon(new ImageIcon(PistGennhshs.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(2)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addGap(49)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
					.addGap(66))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(38)
					.addComponent(lblNewLabel_13, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
					.addGap(757))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(38)
					.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 442, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(465, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(38)
					.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
					.addGap(663)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(12))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(231)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
										.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
										.addComponent(textField_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
										.addComponent(textField_5, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
										.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)))
								.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_10, GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
										.addComponent(textField_9, GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
										.addComponent(textField_6, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
										.addComponent(textField_7, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
										.addComponent(textField_8, GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
										.addComponent(textField_11, GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(152))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addGap(116)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(14)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
							.addGap(9)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(11)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
							.addGap(14)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(13)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addGap(14)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
							.addGap(13)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(14)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(7)
									.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))))
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addComponent(lblNewLabel_13, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(3)
					.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))
		);
		frame.getContentPane().setLayout(groupLayout);
		
		
		
		 try {

	        	

	            Class.forName("com.mysql.jdbc.Driver");

	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ergasiadb", "root", "");

	            PreparedStatement st = con.prepareStatement("select * from userpass where iduserpass=1;");
	            
	            
	            
	            ResultSet rs = st.executeQuery();
	            while (rs.next()) {

	                String s1 = rs.getString(5);

	                String s2 = rs.getString(4);

	                String s3 = rs.getString(24);

	                String s4 = rs.getString(6);

	                String s5 = rs.getString(7);
	                
	                String s6 = rs.getString(12);

	                String s7 = rs.getString(21);

	                String s8 = rs.getString(20);
	                
	                String s9 = rs.getString(19);
	                
	                String s10 = rs.getString(22);
	                
	                String s11 = rs.getString(23);
	              
	                
	                textField_1.setText(s1);

	                textField_2.setText(s2);

	                textField_3.setText(s3);
	                
	                textField_4.setText(s4);
	                
	                textField_5.setText(s5);

	                textField_6.setText(s6);
	               
	                textField_7.setText(s7);
	                
	                textField_8.setText(s8);
	              
	                textField_9.setText(s9);
	                
	                textField_10.setText(s10);
	                
	                textField_11.setText(s11);

	             
	            }
	              
	        } //Create Exception Handler

	        catch (Exception ex) {

	            System.out.println(ex);

	        }

	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}