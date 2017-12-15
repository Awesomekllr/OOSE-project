package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class OOSE3 {

	JFrame frame;
	private JTextField txt_profession;
	private JTextField txt_contactno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OOSE3 window = new OOSE3();
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
	public OOSE3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 230);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_gender = new JLabel("Gender");
		lbl_gender.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbl_gender.setBounds(31, 26, 50, 14);
		frame.getContentPane().add(lbl_gender);
		
		JComboBox cb_gender = new JComboBox();
		cb_gender.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		cb_gender.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		cb_gender.setBounds(126, 24, 64, 20);
		frame.getContentPane().add(cb_gender);
		
		JLabel lbl_profession = new JLabel("Profession");
		lbl_profession.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbl_profession.setBounds(31, 70, 70, 14);
		frame.getContentPane().add(lbl_profession);
		
		txt_profession = new JTextField();
		txt_profession.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txt_profession.setBounds(126, 68, 116, 20);
		frame.getContentPane().add(txt_profession);
		txt_profession.setColumns(10);
		
		JLabel lbl_contactno = new JLabel("Contact no.");
		lbl_contactno.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbl_contactno.setBounds(31, 114, 82, 14);
		frame.getContentPane().add(lbl_contactno);
		
		txt_contactno = new JTextField();
		txt_contactno.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txt_contactno.setBounds(126, 112, 116, 20);
		frame.getContentPane().add(txt_contactno);
		txt_contactno.setColumns(10);
		
		JButton btn_save = new JButton("Save");
		btn_save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
			}
		});
		btn_save.setFont(new Font("Felix Titling", Font.PLAIN, 11));
		btn_save.setBounds(153, 157, 89, 23);
		frame.getContentPane().add(btn_save);
	}
}
