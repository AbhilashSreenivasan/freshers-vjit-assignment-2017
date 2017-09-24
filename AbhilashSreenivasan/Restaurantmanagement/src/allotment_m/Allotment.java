package allotment_m;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Restaurant_u.RestaurantMenu;

import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Allotment {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Allotment window = new Allotment();
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
	public Allotment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton jbtnTable1 = new JButton("Table 1");
		jbtnTable1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			RestaurantMenu info = new RestaurantMenu();
			RestaurantMenu.main(null);
			}
		});
		jbtnTable1.setBounds(355, 71, 134, 42);
		frame.getContentPane().add(jbtnTable1);
		
		JButton jbtnTable2 = new JButton("Table 2");
		jbtnTable2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RestaurantMenu info = new RestaurantMenu();
				RestaurantMenu.main(null);
			}
		});
		jbtnTable2.setBounds(355, 145, 134, 42);
		frame.getContentPane().add(jbtnTable2);
		
		JButton jbtnTable3 = new JButton("Table 3");
		jbtnTable3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RestaurantMenu info = new RestaurantMenu();
				RestaurantMenu.main(null);
			}
		});
		jbtnTable3.setBounds(355, 219, 134, 42);
		frame.getContentPane().add(jbtnTable3);
		
		JButton jbtnTable4 = new JButton("Table 4");
		jbtnTable4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RestaurantMenu info = new RestaurantMenu();
				RestaurantMenu.main(null);
			}
		});
		jbtnTable4.setBounds(355, 298, 134, 42);
		frame.getContentPane().add(jbtnTable4);
		
		JButton jbtnTable5 = new JButton("Table 5");
		jbtnTable5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RestaurantMenu info = new RestaurantMenu();
				RestaurantMenu.main(null);
			}
		});
		jbtnTable5.setBounds(667, 71, 134, 42);
		frame.getContentPane().add(jbtnTable5);
		
		JButton jbtnTable6 = new JButton("Table 6");
		jbtnTable6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				RestaurantMenu info = new RestaurantMenu();
				RestaurantMenu.main(null);
			}
			
		});
		jbtnTable6.setBounds(667, 145, 134, 42);
		frame.getContentPane().add(jbtnTable6);
		
		JButton jbtnTable7 = new JButton("Table 7");
		jbtnTable7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RestaurantMenu info = new RestaurantMenu();
				RestaurantMenu.main(null);
			}
		});
		jbtnTable7.setBounds(667, 219, 134, 42);
		frame.getContentPane().add(jbtnTable7);
		
		JButton jbtnTable8 = new JButton("Table 8");
		jbtnTable8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RestaurantMenu info = new RestaurantMenu();
				RestaurantMenu.main(null);
			}
		});
		jbtnTable8.setBounds(667, 298, 134, 42);
		frame.getContentPane().add(jbtnTable8);
	
		
	}
	
		
}
