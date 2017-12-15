package UI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;

public class Workout {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Workout window = new Workout();
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
	public Workout() {
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
		
		JLabel lblWorkoutExpert = new JLabel("WORKOUT EXPERT");
		lblWorkoutExpert.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblWorkoutExpert.setBounds(10, 0, 185, 36);
		frame.getContentPane().add(lblWorkoutExpert);
		
		JLabel lblWorkoutRoutine = new JLabel("Workout Routine");
		lblWorkoutRoutine.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWorkoutRoutine.setBounds(10, 28, 185, 25);
		frame.getContentPane().add(lblWorkoutRoutine);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(10, 159, 239, 25);
		frame.getContentPane().add(label_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(545, 11, 539, 219);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblWorkouts = new JLabel("Workouts");
		lblWorkouts.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblWorkouts.setBounds(226, 11, 183, 24);
		panel.add(lblWorkouts);
		
		JCheckBox chckbxPushups = new JCheckBox("Push Ups");
		chckbxPushups.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxPushups.setBounds(20, 42, 146, 23);
		panel.add(chckbxPushups);
		
		JCheckBox chckbxBenchedPress = new JCheckBox("Benched Press");
		chckbxBenchedPress.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxBenchedPress.setBounds(20, 68, 146, 23);
		panel.add(chckbxBenchedPress);
		
		JCheckBox chckbxPullUps = new JCheckBox("Pull Ups");
		chckbxPullUps.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxPullUps.setBounds(20, 94, 146, 23);
		panel.add(chckbxPullUps);
		
		JCheckBox chckbxBackPress = new JCheckBox("Back Press");
		chckbxBackPress.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxBackPress.setBounds(20, 120, 146, 23);
		panel.add(chckbxBackPress);
		
		JCheckBox chckbxCableFly = new JCheckBox("Cable Fly");
		chckbxCableFly.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxCableFly.setBounds(20, 150, 146, 23);
		panel.add(chckbxCableFly);
		
		JCheckBox chckbxDeadLift = new JCheckBox("Dead Lift");
		chckbxDeadLift.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxDeadLift.setBounds(20, 178, 146, 23);
		panel.add(chckbxDeadLift);
		
		JCheckBox chckbxDumbbellFlys = new JCheckBox("Dumbbell Flys");
		chckbxDumbbellFlys.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxDumbbellFlys.setBounds(311, 42, 173, 23);
		panel.add(chckbxDumbbellFlys);
		
		JCheckBox chckbxParellelBarDips = new JCheckBox("Parellel Bar Dips");
		chckbxParellelBarDips.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxParellelBarDips.setBounds(311, 68, 173, 23);
		panel.add(chckbxParellelBarDips);
		
		JCheckBox chckbxBarbellCurls = new JCheckBox("Barbell Curls");
		chckbxBarbellCurls.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxBarbellCurls.setBounds(311, 94, 173, 23);
		panel.add(chckbxBarbellCurls);
		
		JCheckBox chckbxHammerCurls = new JCheckBox("Hammer Curls");
		chckbxHammerCurls.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxHammerCurls.setBounds(311, 120, 173, 23);
		panel.add(chckbxHammerCurls);
		
		JCheckBox chckbxCardio = new JCheckBox("Cardio");
		chckbxCardio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxCardio.setBounds(311, 150, 173, 23);
		panel.add(chckbxCardio);
		
		JCheckBox chckbxUprightRows = new JCheckBox("Upright Rows");
		chckbxUprightRows.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxUprightRows.setBounds(311, 178, 173, 23);
		panel.add(chckbxUprightRows);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(545, 241, 539, 332);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblWorkoutsThreshold = new JLabel("Workout Threshold");
		lblWorkoutsThreshold.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblWorkoutsThreshold.setBounds(199, 11, 204, 24);
		panel_1.add(lblWorkoutsThreshold);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(0, 56, 535, 517);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setIconTextGap(6);
		btnAdd.setBorder(null);
		btnAdd.setBounds(10, 457, 97, 49);
		panel_2.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(428, 457, 97, 49);
		panel_2.add(btnDelete);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 62, 239, 25);
		panel_2.add(label);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 51, 662, 2);
		panel_2.add(separator_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(10, 11, 239, 25);
		panel_2.add(label_2);
		
		JLabel lblDsasd = new JLabel("");
		lblDsasd.setBounds(10, 51, 119, 25);
		panel_2.add(lblDsasd);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 98, 662, 2);
		panel_2.add(separator_2);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setBounds(0, 444, 535, 2);
		panel_2.add(separator_9);
		
		JLabel label_8 = new JLabel("");
		label_8.setBounds(10, 408, 239, 25);
		panel_2.add(label_8);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(0, 395, 535, 2);
		panel_2.add(separator_8);
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(10, 359, 239, 25);
		panel_2.add(label_7);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(0, 346, 535, 2);
		panel_2.add(separator_7);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(10, 310, 239, 25);
		panel_2.add(label_6);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(0, 297, 535, 2);
		panel_2.add(separator_6);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(10, 257, 239, 25);
		panel_2.add(label_5);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(0, 244, 535, 2);
		panel_2.add(separator_5);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(10, 208, 239, 25);
		panel_2.add(label_4);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(0, 195, 662, 2);
		panel_2.add(separator_4);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(10, 159, 239, 25);
		panel_2.add(label_3);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 146, 662, 2);
		panel_2.add(separator_3);
	}
}
