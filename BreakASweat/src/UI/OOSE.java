package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class OOSE {

	JFrame frame;
	private JTextField txt_username;
	private JPasswordField pf_loginpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OOSE window = new OOSE();
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
	public OOSE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txt_username = new JTextField();
		txt_username.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txt_username.setToolTipText("Please enter your username");
		txt_username.setBounds(150, 127, 132, 20);
		frame.getContentPane().add(txt_username);
		txt_username.setColumns(10);
		
		JButton btn_login = new JButton("Login");
		btn_login.setFont(new Font("Felix Titling", Font.PLAIN, 11));
		btn_login.setBounds(150, 195, 89, 23);
		frame.getContentPane().add(btn_login);
		
		JLabel lblNoAccount = new JLabel("No account?");
		lblNoAccount.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNoAccount.setBounds(248, 218, 66, 14);
		frame.getContentPane().add(lblNoAccount);
		
		JButton btn_register = new JButton("Register");
		btn_register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					OOSE2 window = new OOSE2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btn_register.setFont(new Font("Felix Titling", Font.PLAIN, 11));
		btn_register.setBounds(321, 214, 89, 23);
		frame.getContentPane().add(btn_register);
		
		JLabel lbl_username = new JLabel("Username");
		lbl_username.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_username.setBounds(66, 127, 74, 17);
		frame.getContentPane().add(lbl_username);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPassword.setBounds(66, 165, 66, 14);
		frame.getContentPane().add(lblPassword);
		
		pf_loginpassword = new JPasswordField();
		pf_loginpassword.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		pf_loginpassword.setBounds(150, 164, 132, 20);
		frame.getContentPane().add(pf_loginpassword);
		
		JLabel lblBreakASweat = new JLabel("Break a Sweat");
		lblBreakASweat.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 26));
		lblBreakASweat.setBounds(136, 11, 166, 38);
		frame.getContentPane().add(lblBreakASweat);
	}
}
