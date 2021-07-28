import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Epikoinwnia {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Epikoinwnia window = new Epikoinwnia();
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
	public Epikoinwnia() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0395\u03A0\u0399\u039A\u039F\u0399\u039D\u03A9\u039D\u0399\u0391");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(85, -2, 712, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("\u03A3\u03C4\u03B1\u03B8\u03B5\u03C1\u03CC \u03A4\u03B7\u03BB\u03AD\u03C6\u03C9\u03BD\u03BF :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(219, 129, 184, 16);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("223 103 6222");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_1.setBounds(511, 129, 126, 16);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("223 104 6223");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_2.setBounds(511, 172, 126, 16);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\u039A\u03B9\u03BD\u03B7\u03C4\u03CC \u03A4\u03B7\u03BB\u03AD\u03C6\u03C9\u03BD\u03BF :");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_3.setBounds(219, 216, 184, 16);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("6989898514");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_4.setBounds(526, 216, 111, 16);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("6989898525");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_5.setBounds(526, 245, 111, 16);
		frame.getContentPane().add(label_5);
		
		JLabel lblEmail = new JLabel("E-Mail :");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmail.setBounds(219, 295, 157, 16);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblKephotmailgr = new JLabel("kep.lamias@kep.gov.gr");
		lblKephotmailgr.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblKephotmailgr.setBounds(442, 290, 195, 26);
		frame.getContentPane().add(lblKephotmailgr);
		
		JLabel label_6 = new JLabel("\u0394\u03B9\u03B5\u03CD\u03B8\u03C5\u03BD\u03C3\u03B7 :");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_6.setBounds(214, 345, 147, 16);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("\u0391\u03B8\u03B7\u03BD\u03CE\u03BD 18");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_7.setBounds(541, 340, 155, 26);
		frame.getContentPane().add(label_7);
		
		JButton button = new JButton("<");
		button.setFont(new Font("Tahoma", Font.BOLD, 24));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				ArxikhSelida kr=new ArxikhSelida();
				kr.setVisible(true);
				kr.NewScreen();
			}
		});
		button.setBounds(0, -3, 76, 29);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u0388\u03BE\u03BF\u03B4\u03BF\u03C2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose(); //KLEINEI TO PARATHYRO META TO BUTTON CLICK
				Exodos er= new Exodos(); //POIA SELIDA THA ANOIKSEI META TO CLICK
				er.NewScreen(); //ANOIGEI KAINOURGIO SCREEN
				er.setVisible(true);	
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button_1.setBounds(734, 449, 97, 41);
		frame.getContentPane().add(button_1);
		frame.setBackground(new Color(135, 206, 235));
		frame.setBounds(100, 100, 861, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
