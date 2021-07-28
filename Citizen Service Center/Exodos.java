import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Window.Type;
import java.awt.Toolkit;

public class Exodos {

	private JFrame frmKe;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exodos window = new Exodos();
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
	public Exodos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKe = new JFrame();
		frmKe.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\xarhs\\OneDrive\\\u03A5\u03C0\u03BF\u03BB\u03BF\u03B3\u03B9\u03C3\u03C4\u03AE\u03C2\\KEP_(GR)_logo.png"));
		frmKe.setBackground(SystemColor.activeCaptionText);
		frmKe.getContentPane().setBackground(new Color(135, 206, 235));
		frmKe.setBounds(100, 100, 945, 720);
		frmKe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\u0395\u03C0\u03B9\u03C4\u03C5\u03C7\u03AE\u03C2 \u0388\u03BE\u03BF\u03B4\u03BF\u03C2 ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_1.setBounds(123, 273, 693, 40);
		frmKe.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u0395\u03C5\u03C7\u03B1\u03C1\u03B9\u03C3\u03C4\u03BF\u03CD\u03BC\u03B5!");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_2.setBounds(123, 326, 693, 40);
		frmKe.getContentPane().add(lblNewLabel_2);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}