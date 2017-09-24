package Homedel_m;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class HomeDelivery {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_17;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeDelivery window = new HomeDelivery();
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
	public HomeDelivery() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 54, 852, 275);
		panel.setLayout(null);
		frame.getContentPane().add(panel);
		
		JLabel label = new JLabel("STARTERS");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(0, 11, 100, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("MAIN COURSE");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(303, 11, 148, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("DESSERTS");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(597, 11, 100, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Chicken Wings (Rs.120)");
		label_3.setBounds(0, 36, 148, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Chicken Kebabs (Rs.180)");
		label_4.setBounds(0, 61, 148, 14);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Pasta (Rs.140)");
		label_5.setBounds(10, 86, 114, 14);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Fries (Rs. 80) ");
		label_6.setBounds(10, 112, 100, 14);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Cripsy Corn (Rs.150)");
		label_7.setBounds(10, 137, 123, 14);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("QTY");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_8.setBounds(173, 13, 46, 14);
		panel.add(label_8);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(143, 33, 86, 20);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(143, 58, 86, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(143, 83, 86, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(145, 109, 86, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(145, 134, 86, 20);
		panel.add(textField_4);
		
		JLabel label_9 = new JLabel("Veg Fried Rice (Rs.110)");
		label_9.setBounds(325, 36, 158, 14);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("Chicken Fried Rice (Rs.140)");
		label_10.setBounds(303, 61, 158, 14);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("Veg Biryani (Rs.180)");
		label_11.setBounds(325, 86, 126, 14);
		panel.add(label_11);
		
		JLabel label_12 = new JLabel("Chicken Biryani (Rs.220)");
		label_12.setBounds(313, 112, 138, 14);
		panel.add(label_12);
		
		JLabel label_13 = new JLabel("Rotis (Rs.6)");
		label_13.setBounds(325, 137, 100, 14);
		panel.add(label_13);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(467, 33, 86, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(467, 58, 86, 20);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(467, 83, 86, 20);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(467, 109, 86, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(467, 137, 86, 20);
		panel.add(textField_9);
		
		JLabel label_14 = new JLabel("Milkshakes (Rs.85)");
		label_14.setBounds(597, 36, 114, 14);
		panel.add(label_14);
		
		JLabel label_15 = new JLabel("Ice-cream (Rs.135)");
		label_15.setBounds(597, 61, 114, 14);
		panel.add(label_15);
		
		JLabel label_16 = new JLabel("Stone Concepts (Rs.360)");
		label_16.setBounds(580, 86, 167, 14);
		panel.add(label_16);
		
		JLabel label_17 = new JLabel("Lassi (Rs.60)");
		label_17.setBounds(613, 112, 113, 14);
		panel.add(label_17);
		
		JLabel label_18 = new JLabel("Rasgulla (Rs.110)");
		label_18.setBounds(597, 137, 138, 14);
		panel.add(label_18);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(736, 36, 86, 20);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(736, 58, 86, 20);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(736, 83, 86, 20);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(736, 109, 86, 20);
		panel.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(736, 134, 86, 20);
		panel.add(textField_14);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 185, 812, 2);
		panel.add(separator);
		
		JLabel label_19 = new JLabel("QTY");
		label_19.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_19.setBounds(496, 13, 46, 14);
		panel.add(label_19);
		
		JLabel label_20 = new JLabel("QTY");
		label_20.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_20.setBounds(776, 13, 46, 14);
		panel.add(label_20);
		
		JLabel label_21 = new JLabel("Choose a drink : ");
		label_21.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_21.setBounds(206, 222, 123, 14);
		panel.add(label_21);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(325, 220, 206, 22);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(903, 54, 447, 597);
		panel_1.setLayout(null);
		frame.getContentPane().add(panel_1);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(10, 11, 427, 575);
		panel_1.add(textField_15);
		
		JLabel lblHomeDelivery = new JLabel("Home Delivery");
		lblHomeDelivery.setBounds(412, 11, 196, 25);
		lblHomeDelivery.setFont(new Font("Tahoma", Font.BOLD, 19));
		frame.getContentPane().add(lblHomeDelivery);
		
		JLabel lblDeliveryCharges_1 = new JLabel("Delivery Address:");
		lblDeliveryCharges_1.setBounds(57, 364, 125, 14);
		frame.getContentPane().add(lblDeliveryCharges_1);
		
		textField_17 = new JTextField();
		textField_17.setBounds(155, 364, 463, 275);
		frame.getContentPane().add(textField_17);
		textField_17.setColumns(10);
		
		JLabel lblReceipt = new JLabel("RECEIPT:");
		lblReceipt.setBounds(901, 29, 225, 14);
		lblReceipt.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblReceipt);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.setBounds(657, 385, 91, 23);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(657, 442, 91, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(657, 503, 91, 23);
		frame.getContentPane().add(btnExit);
	}

}
