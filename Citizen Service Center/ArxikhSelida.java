import javax.swing.JFrame;
import javax.swing.SwingConstants;
import java.awt.*;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;


public class ArxikhSelida {

	private JFrame frmKe;

	/**
	 * Launch the application.
	 */
	public static void NewScreen(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArxikhSelida window = new ArxikhSelida();
					window.frmKe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ArxikhSelida() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKe = new JFrame();
		frmKe.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\xarhs\\OneDrive\\\u03A5\u03C0\u03BF\u03BB\u03BF\u03B3\u03B9\u03C3\u03C4\u03AE\u03C2\\KEP_(GR)_logo.png"));
		frmKe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKe.getContentPane().setBackground(new Color(135, 206, 235));
		frmKe.setBounds(100, 100, 948, 755);
		
		JButton btnNewButton = new JButton("\u03A5\u03A0\u0397\u03A1\u0395\u03A3\u0399\u0395\u03A3");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmKe.dispose();
				Ipiresies nk = new Ipiresies();
				nk.NewScreen();
				nk.setVisible(true);
				 
			}
		});
		btnNewButton.setBackground(new Color(192, 192, 192));
		
		JButton btnNewButton_1 = new JButton("\u039B\u039F\u0393\u0391\u03A1\u0399\u0391\u03A3\u039C\u039F\u03A3");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmKe.dispose();
				Logariasmos nr=new Logariasmos();
				nr.setVisible(true);
				nr.NewScreen();
			}
		});
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		
		JButton btnNewButton_2 = new JButton("\u0395\u03A0\u0399\u039A\u039F\u0399\u039D\u03A9\u039D\u0399\u0391");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmKe.dispose();
				Epikoinwnia kp=new Epikoinwnia();
				kp.setVisible(true);
				kp.NewScreen();
		
			}
		});
		btnNewButton_2.setBackground(new Color(192, 192, 192));
		
		JLabel label = new JLabel("\u0391\u03A1\u03A7\u0399\u039A\u0397 \u03A3\u0395\u039B\u0399\u0394\u0391");
		label.setBackground(new Color(32, 178, 170));
		label.setFont(new Font("Tahoma", Font.BOLD, 25));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnNewButton_3 = new JButton("\u0388\u03BE\u03BF\u03B4\u03BF\u03C2");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmKe.dispose();
				Exodos bv= new Exodos(); //POIA SELIDA THA ANOIKSEI META TO CLICK
				bv.NewScreen(); //ANOIGEI KAINOURGIO SCREEN
				bv.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GroupLayout groupLayout = new GroupLayout(frmKe.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(152)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE))
					.addGap(157))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton_3))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(21)
							.addComponent(label, GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE)))
					.addGap(20))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addGap(89)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addGap(69)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addGap(58)
					.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
					.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		frmKe.getContentPane().setLayout(groupLayout);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}


}
