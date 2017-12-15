package UI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Canvas;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;

public class Music {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Music window = new Music();
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
	public Music() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1110, 623);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMusic = new JLabel("MUSIC");
		lblMusic.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMusic.setBounds(10, 11, 223, 22);
		frame.getContentPane().add(lblMusic);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 44, 526, 442);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(0, 57, 526, 10);
		panel.add(panel_2);
		
		JLabel lblMyMusic = new JLabel("MY MUSIC");
		lblMyMusic.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMyMusic.setBounds(10, 24, 223, 22);
		panel.add(lblMyMusic);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 127, 526, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 193, 526, 2);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 259, 526, 2);
		panel.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 319, 526, 2);
		panel.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(0, 374, 526, 2);
		panel.add(separator_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(546, 44, 538, 442);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.BLACK);
		panel_3.setBounds(0, 59, 538, 10);
		panel_1.add(panel_3);
		
		JLabel lblMyPlaylist = new JLabel("MY PLAYLIST");
		lblMyPlaylist.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMyPlaylist.setBounds(10, 26, 223, 22);
		panel_1.add(lblMyPlaylist);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(0, 128, 538, 2);
		panel_1.add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(0, 193, 538, 2);
		panel_1.add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(0, 258, 538, 2);
		panel_1.add(separator_7);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(0, 319, 538, 2);
		panel_1.add(separator_8);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setBounds(0, 375, 538, 2);
		panel_1.add(separator_9);
		
		JButton btnImport = new JButton("Import");
		btnImport.setBounds(995, 14, 89, 23);
		frame.getContentPane().add(btnImport);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Awesomekllr\\Desktop\\button_play_blue.png"));
		label.setBounds(519, 497, 53, 76);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Awesomekllr\\Desktop\\icon-next.gif"));
		label_1.setBounds(582, 497, 53, 76);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\Awesomekllr\\Desktop\\icon-prev.gif"));
		label_2.setBounds(456, 497, 53, 76);
		frame.getContentPane().add(label_2);
	}
}
