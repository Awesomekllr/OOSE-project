package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class OOSE4 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OOSE4 window = new OOSE4();
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
	public OOSE4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_features = new JLabel("Features");
		lbl_features.setFont(new Font("Stencil", Font.BOLD, 20));
		lbl_features.setBounds(10, 63, 114, 32);
		frame.getContentPane().add(lbl_features);
		
		JButton btn_bmi = new JButton("BMI");
		btn_bmi.setFont(new Font("Stencil", Font.BOLD, 18));
		btn_bmi.setBounds(5, 106, 89, 38);
		frame.getContentPane().add(btn_bmi);
		
		JButton btn_workout = new JButton("Workout");
		btn_workout.setFont(new Font("Stencil", Font.BOLD, 18));
		btn_workout.setBounds(5, 166, 137, 38);
		frame.getContentPane().add(btn_workout);
		
		JButton btn_music = new JButton("Music");
		btn_music.setFont(new Font("Stencil", Font.BOLD, 18));
		btn_music.setBounds(5, 226, 114, 38);
		frame.getContentPane().add(btn_music);
		
		JButton btn_myprogram = new JButton("My Programs");
		btn_myprogram.setFont(new Font("Stencil", Font.BOLD, 18));
		btn_myprogram.setBounds(5, 286, 175, 38);
		frame.getContentPane().add(btn_myprogram);
		
		JButton btn_logout = new JButton("Logout");
		btn_logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				try {
					OOSE window = new OOSE();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btn_logout.setBackground(Color.LIGHT_GRAY);
		btn_logout.setForeground(Color.BLACK);
		btn_logout.setFont(new Font("Stencil", Font.BOLD, 18));
		btn_logout.setBounds(5, 346, 114, 38);
		frame.getContentPane().add(btn_logout);
		
		JLabel lbl_mainmenu = new JLabel("Main Menu");
		lbl_mainmenu.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 26));
		lbl_mainmenu.setBounds(343, 11, 114, 32);
		frame.getContentPane().add(lbl_mainmenu);
		
		JLabel lbl_tips = new JLabel("Tips of the day");
		lbl_tips.setFont(new Font("Stencil", Font.BOLD, 20));
		lbl_tips.setBounds(521, 63, 175, 14);
		frame.getContentPane().add(lbl_tips);
		
		JTextArea ta_first = new JTextArea();
		ta_first.setEditable(false);
		ta_first.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		ta_first.setText("Grow Muscle, Save Time\r\nKeep your weight workouts under an hour. \r\nAfter 1 hour, your body starts producing \r\nmore of the stress hormone cortisol, \r\nwhich can have a testosterone-blocking, \r\nmuscle-wasting effect.");
		ta_first.setBounds(521, 88, 253, 152);
		frame.getContentPane().add(ta_first);
		
		JTextArea ta_second = new JTextArea();
		ta_second.setEditable(false);
		ta_second.setText("Exercise in Order\r\nUse dumbbells, barbells, and machines\r\n\u2014in that order. \"The smaller, stabilizer \r\nmuscles you use with dumbbells fatigue \r\nbefore your larger muscle groups,\" \r\nsays Charles Staley, a strength coach in \r\nLas Vegas. So progress to machines, which \r\nrequire less help from your smaller muscles,\r\nas you grow tired.");
		ta_second.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		ta_second.setBounds(521, 257, 253, 193);
		frame.getContentPane().add(ta_second);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\1.png"));
		lblNewLabel.setBounds(204, 47, 292, 193);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\2.jpg"));
		lblNewLabel_1.setBounds(202, 240, 294, 210);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
