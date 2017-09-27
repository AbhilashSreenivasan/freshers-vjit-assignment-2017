package Dinein_m;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Allotmentbuff_m.AllotmentBuffet;
import allotment_m.Allotment;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dinein {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dinein window = new Dinein();
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
	public Dinein() {
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
		
		JButton btnNewButton = new JButton("La Carte");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Allotment info = new Allotment();
				Allotment.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(503, 112, 316, 75);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnBuffet = new JButton("Buffet");
		btnBuffet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AllotmentBuffet info = new AllotmentBuffet();
				AllotmentBuffet.main(null);
			}
		});
		btnBuffet.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnBuffet.setBounds(503, 240, 316, 75);
		frame.getContentPane().add(btnBuffet);
	}

}
