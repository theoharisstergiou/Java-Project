import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class BebaiwshMonimhsKatoikias {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BebaiwshMonimhsKatoikias window = new BebaiwshMonimhsKatoikias();
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
	public BebaiwshMonimhsKatoikias() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.setBounds(100, 100, 933, 721);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("<");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Ipiresies pt=new Ipiresies();
				pt.setVisible(true);
				pt.NewScreen();
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel label = new JLabel("\u0392\u0395\u0392\u0391\u0399\u03A9\u03A3\u0397 \u039C\u039F\u039D\u0399\u039C\u0397\u03A3 \u039A\u0391\u03A4\u039F\u0399\u039A\u0399\u0391\u03A3");
		label.setFont(new Font("Tahoma", Font.BOLD, 25));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_1 = new JLabel("\u039F \u0394\u03AE\u03BC\u03B1\u03C1\u03C7\u03BF\u03C2 \u039B\u03B1\u03BC\u03B9\u03AD\u03C9\u03BD \u03A6\u03B8\u03B9\u03CE\u03C4\u03B9\u03B4\u03B1\u03C2");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_2 = new JLabel("\u0392\u03B5\u03B2\u03B1\u03B9\u03CE\u03BD\u03B5\u03B9 \u03CC\u03C4\u03B9 :");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_3 = new JLabel("\u039F/\u0397");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		textField_1 = new JTextField(50);
		textField_1.setEditable(false);
		
		JLabel label_4 = new JLabel("\u03C4\u03BF\u03C5");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		textField_2 = new JTextField(100);
		textField_2.setEditable(false);
		
		JLabel label_5 = new JLabel("\u03BA\u03B1\u03B9 \u03C4\u03B7\u03C2");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		textField_3 = new JTextField(50);
		textField_3.setEditable(false);
		
		JLabel label_6 = new JLabel("\u03B5\u03AF\u03BD\u03B1\u03B9 \u03BC\u03CC\u03BD\u03B9\u03BC\u03BF\u03C2/\u03B7 \u03BA\u03AC\u03C4\u03BF\u03B9\u03BA\u03BF\u03C2 \u03C4\u03B7\u03C2 \u0394\u03B7\u03BC\u03BF\u03C4\u03B9\u03BA\u03AE\u03C2 \u0395\u03BD\u03CC\u03C4\u03B7\u03C4\u03B1\u03C2");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_7 = new JLabel("\u039B\u03B1\u03BC\u03AF\u03B1\u03C2 \u03C4\u03BF\u03C5 \u0394\u03AE\u03BC\u03BF\u03C5 \u039B\u03B1\u03BC\u03B9\u03AD\u03C9\u03BD \u03A6\u03B8\u03B9\u03CE\u03C4\u03B9\u03B4\u03B1\u03C2 \u03BA\u03B1\u03B9 \u03B4\u03B9\u03B1\u03BC\u03AD\u03BD\u03B5\u03B9 \u03B5\u03C0\u03AF \u03C4\u03B7\u03C2 \u03BF\u03B4\u03BF\u03CD");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		textField_4 = new JTextField(50);
		textField_4.setEditable(false);
		
		JLabel label_8 = new JLabel("\u03A4.\u039A.");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		
		JLabel label_9 = new JLabel(".");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_10 = new JLabel("\u0395\u03BA\u03B4\u03AF\u03B4\u03B5\u03C4\u03B1\u03B9 \u03B7 \u03C0\u03B1\u03C1\u03BF\u03CD\u03C3\u03B1 \u03BC\u03B5\u03C4\u03AC \u03B1\u03C0\u03CC \u03B1\u03AF\u03C4\u03B7\u03C3\u03B7 \u03C4\u03BF\u03C5/\u03B7\u03C2 \u03B5\u03BD\u03B4\u03B9\u03B1\u03C6\u03B5\u03C1\u03CC\u03BC\u03B5\u03BD\u03BF\u03C5/\u03B7\u03C2 \u03B3\u03B9\u03B1 \u03BD\u03B1 \u03C4\u03B7 \u03C7\u03C1\u03B7\u03C3\u03B9\u03BC\u03B5\u03CD\u03C3\u03B5\u03B9 \u03C3\u03B5 \u03BA\u03AC\u03B8\u03B5 \u03BD\u03CC\u03BC\u03B9\u03BC\u03B7 \u03C7\u03C1\u03AE\u03C3\u03B7.");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_11 = new JLabel("\u039C\u03B5 \u03B5\u03BD\u03C4\u03BF\u03BB\u03AE \u0394\u03B7\u03BC\u03AC\u03C1\u03C7\u03BF\u03C5");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_12 = new JLabel("\u039F/\u0397 \u03C5\u03C0\u03AC\u03BB\u03BB\u03B7\u03BB\u03BF\u03C2 \u03C4\u03BF\u03C5 \u0394\u03B7\u03BC\u03BF\u03C4\u03BF\u03BB\u03BF\u03B3\u03AF\u03BF\u03C5 ");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton button_1 = new JButton("\u0395\u03BA\u03C4\u03CD\u03C0\u03C9\u03C3\u03B7");
		button_1.setIcon(new ImageIcon(BebaiwshMonimhsKatoikias.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton button_2 = new JButton("\u0388\u03BE\u03BF\u03B4\u03BF\u03C2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Exodos rt= new Exodos(); //POIA SELIDA THA ANOIKSEI META TO CLICK
				rt.NewScreen(); //ANOIGEI KAINOURGIO SCREEN
				rt.setVisible(true);
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(label, GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
					.addGap(47))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_1, GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
							.addGap(19))
						.addComponent(label_2, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
					.addGap(560))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
					.addGap(12)
					.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
					.addGap(12)
					.addComponent(label_6)
					.addGap(14))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(label_7)
					.addGap(12)
					.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
					.addGap(12)
					.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(74))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(label_10, GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
					.addGap(657)
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addGap(14))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(389)
					.addComponent(label_11, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
					.addGap(347))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(338)
					.addComponent(label_12, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
					.addGap(288))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(47)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(42)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
					.addGap(54)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)))
					.addGap(36)
					.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(62)
					.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(96)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
		
		 try {

	        	

	            Class.forName("com.mysql.jdbc.Driver");

	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ergasiadb", "root", "");

	            PreparedStatement st = con.prepareStatement("select * from userpass where iduserpass=1;");
	            
	            
	            
	            ResultSet rs = st.executeQuery();
	            while (rs.next()) {

	            	String s=rs.getString(4);
	            	
	                String s1 = rs.getString(6);

	                String s2 = rs.getString(7);

	                String s3 = rs.getString(8);

	                String s4 = rs.getString(9);
	                
	                
	                textField_1.setText(s);

	                textField_2.setText(s1);

	                textField_3.setText(s2);

	                textField_4.setText(s3);
	                
	                textField_5.setText(s4);
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
