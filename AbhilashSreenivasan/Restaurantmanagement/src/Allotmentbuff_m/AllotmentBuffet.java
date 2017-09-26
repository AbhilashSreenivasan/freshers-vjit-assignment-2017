package Allotmentbuff_m;

import java.awt.EventQueue;

import javax.swing.JFrame;

import buffet_m.buffet;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AllotmentBuffet {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AllotmentBuffet window = new AllotmentBuffet();
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
	public AllotmentBuffet() {
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
		
		JButton btnTable = new JButton("Table 1");
		btnTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				buffet info = new buffet();
				buffet.main(null);
				
				
			}
		});
		btnTable.setBounds(351, 94, 162, 45);
		frame.getContentPane().add(btnTable);
		
		JButton btnTable_1 = new JButton("Table 2");
		btnTable_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				buffet info = new buffet();
				buffet.main(null);
				
			}
		});
		btnTable_1.setBounds(351, 172, 162, 45);
		frame.getContentPane().add(btnTable_1);
		
		JButton btnTable_2 = new JButton("Table 3");
		btnTable_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				buffet info = new buffet();
				buffet.main(null);
				
			}
		});
		btnTable_2.setBounds(351, 255, 162, 45);
		frame.getContentPane().add(btnTable_2);
		
		JButton btnTable_3 = new JButton("Table 4");
		btnTable_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				buffet info = new buffet();
				buffet.main(null);
				
			}
		});
		btnTable_3.setBounds(756, 94, 162, 45);
		frame.getContentPane().add(btnTable_3);
		
		JButton btnTable_4 = new JButton("Table 5");
		btnTable_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				buffet info = new buffet();
				buffet.main(null);
				
			}
		});
		btnTable_4.setBounds(756, 172, 162, 45);
		frame.getContentPane().add(btnTable_4);
		
		JButton btnTable_5 = new JButton("Table 6");
		btnTable_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				buffet info = new buffet();
				buffet.main(null);
				
			}
		});
		btnTable_5.setBounds(756, 255, 162, 45);
		frame.getContentPane().add(btnTable_5);
	}
}
