package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import java.awt.FlowLayout;

import javax.swing.JLabel;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Dimension;

import javax.swing.JScrollBar;

import java.awt.Component;

import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;


public class OOse5 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OOse5 window = new OOse5();
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
	public OOse5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1104, 743);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JButton btn_back = new JButton("Back");
		btn_back.setPreferredSize(new Dimension(59, 30));
		btn_back.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(btn_back, BorderLayout.WEST);
		
		JLabel program_title = new JLabel("    My Programs");
		program_title.setPreferredSize(new Dimension(55, 30));
		program_title.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		program_title.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 25));
		panel.add(program_title, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(410, 10));
		frame.getContentPane().add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel program_sub_title = new JLabel("   Programs");
		program_sub_title.setBorder(new MatteBorder(1, 1, 1, 2, (Color) new Color(0, 0, 0)));
		program_sub_title.setPreferredSize(new Dimension(400, 30));
		program_sub_title.setMinimumSize(new Dimension(80, 16));
		program_sub_title.setMaximumSize(new Dimension(80, 16));
		program_sub_title.setFont(new Font("Trajan Pro 3", Font.BOLD, 20));
		panel_1.add(program_sub_title, BorderLayout.NORTH);
		
		DefaultListModel itemlist= new DefaultListModel();
		for (int i=1;i<=30;i++){
			itemlist.addElement("The Complete 4-Week Beginner's Workout Program" + i);
		}
		
		
		JList list = new JList();
		list.setFont(new Font("Tahoma", Font.PLAIN, 16));
		list.setModel(itemlist);
		
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setBorder(new MatteBorder(1, 1, 1, 2, (Color) new Color(0, 0, 0)));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panel_1.add(scrollPane, BorderLayout.CENTER);
		scrollPane.setPreferredSize(new Dimension(400, 2));
		scrollPane.setAutoscrolls(true);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 1, 1, 2, (Color) new Color(0, 0, 0)));
		panel_1.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnAddYourProgram = new JButton("Add Your Program");
		panel_2.add(btnAddYourProgram);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(1, 0, 0, 1, (Color) new Color(0, 0, 0)));
		panel_3.setAlignmentX(Component.RIGHT_ALIGNMENT);
		frame.getContentPane().add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPreview = new JLabel("   Preview");
		lblPreview.setBorder(new MatteBorder(0, 0, 1, 1, (Color) new Color(0, 0, 0)));
		lblPreview.setPreferredSize(new Dimension(45, 30));
		panel_3.add(lblPreview, BorderLayout.NORTH);
		lblPreview.setFont(new Font("Trajan Pro 3", Font.PLAIN, 16));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		panel_3.add(panel_5, BorderLayout.SOUTH);
		panel_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnJoinNow = new JButton("Join Now");
		panel_5.add(btnJoinNow);
		
		JPanel content = new JPanel();
		content.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		panel_3.add(content, BorderLayout.CENTER);
	}

}
