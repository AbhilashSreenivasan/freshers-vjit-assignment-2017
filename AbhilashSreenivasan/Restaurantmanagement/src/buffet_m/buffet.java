package buffet_m;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class buffet {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField jtxtVeg;
	private JTextField jtxtNonveg;
	private JTextField jtxtTotal2;
	private JTextField jtxtDrink2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					buffet window = new buffet();
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
	public buffet() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblStarters = new JLabel("Starters :");
		lblStarters.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStarters.setBounds(10, 100, 70, 14);
		frame.getContentPane().add(lblStarters);
		
		JLabel lblPaneerKebab = new JLabel("Paneer kebab");
		lblPaneerKebab.setBounds(47, 125, 107, 14);
		frame.getContentPane().add(lblPaneerKebab);
		
		JLabel lblGobiFry = new JLabel("Gobi fry");
		lblGobiFry.setBounds(47, 155, 46, 14);
		frame.getContentPane().add(lblGobiFry);
		
		JLabel lblCrispyCorn = new JLabel("Crispy Corn");
		lblCrispyCorn.setBounds(47, 192, 92, 14);
		frame.getContentPane().add(lblCrispyCorn);
		
		JLabel lblManchuria = new JLabel("Manchuria");
		lblManchuria.setBounds(47, 225, 70, 14);
		frame.getContentPane().add(lblManchuria);
		
		JLabel lblMainCourse = new JLabel("Main Course:");
		lblMainCourse.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMainCourse.setBounds(10, 264, 83, 14);
		frame.getContentPane().add(lblMainCourse);
		
		JLabel lblNaan = new JLabel("Naan");
		lblNaan.setBounds(47, 289, 46, 14);
		frame.getContentPane().add(lblNaan);
		
		JLabel lblPaneerMasala = new JLabel("Paneer masala");
		lblPaneerMasala.setBounds(47, 314, 107, 14);
		frame.getContentPane().add(lblPaneerMasala);
		
		JLabel lblMixedVeg = new JLabel("Mixed Veg");
		lblMixedVeg.setBounds(47, 387, 70, 14);
		frame.getContentPane().add(lblMixedVeg);
		
		JLabel lblAlooMasala = new JLabel("Aloo Masala");
		lblAlooMasala.setBounds(47, 364, 70, 14);
		frame.getContentPane().add(lblAlooMasala);
		
		JLabel lblVegBiryani = new JLabel("Veg biryani");
		lblVegBiryani.setBounds(47, 339, 70, 14);
		frame.getContentPane().add(lblVegBiryani);
		
		JLabel lblDesserts = new JLabel("Desserts:");
		lblDesserts.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDesserts.setBounds(10, 425, 83, 14);
		frame.getContentPane().add(lblDesserts);
		
		JLabel lblIceCreams = new JLabel("Ice creams");
		lblIceCreams.setBounds(47, 458, 70, 14);
		frame.getContentPane().add(lblIceCreams);
		
		JLabel lblGulabJamun = new JLabel("Gulab Jamun");
		lblGulabJamun.setBounds(47, 483, 107, 14);
		frame.getContentPane().add(lblGulabJamun);
		
		JLabel lblDoubleKaMeetha = new JLabel("Double ka Meetha");
		lblDoubleKaMeetha.setBounds(47, 511, 107, 14);
		frame.getContentPane().add(lblDoubleKaMeetha);
		
		JLabel label = new JLabel("Starters :");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(362, 100, 70, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Main Course:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(349, 264, 83, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Desserts:");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_2.setBounds(349, 425, 83, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Ice creams");
		label_3.setBounds(362, 458, 70, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Gulab Jamun");
		label_4.setBounds(362, 483, 92, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Double ka Meetha");
		label_5.setBounds(362, 511, 107, 14);
		frame.getContentPane().add(label_5);
		
		JLabel lblChickenKebabs = new JLabel("Chicken Kebabs");
		lblChickenKebabs.setBounds(362, 125, 107, 14);
		frame.getContentPane().add(lblChickenKebabs);
		
		JLabel lblApolloFish = new JLabel("Apollo Fish");
		lblApolloFish.setBounds(362, 155, 70, 14);
		frame.getContentPane().add(lblApolloFish);
		
		JLabel lblTandiMasala = new JLabel("Tangdi Masala");
		lblTandiMasala.setBounds(362, 192, 92, 14);
		frame.getContentPane().add(lblTandiMasala);
		
		JLabel lblChickenManchuria = new JLabel("Chicken Manchuria");
		lblChickenManchuria.setBounds(362, 225, 131, 14);
		frame.getContentPane().add(lblChickenManchuria);
		
		JLabel label_6 = new JLabel("Naan");
		label_6.setBounds(362, 289, 46, 14);
		frame.getContentPane().add(label_6);
		
		JLabel lblMuttonKheema = new JLabel("Mutton Kheema");
		lblMuttonKheema.setBounds(362, 314, 92, 14);
		frame.getContentPane().add(lblMuttonKheema);
		
		JLabel lblChickenBiryani = new JLabel("Chicken biryani");
		lblChickenBiryani.setBounds(362, 339, 92, 14);
		frame.getContentPane().add(lblChickenBiryani);
		
		JLabel lblEggBurji = new JLabel("Egg burji");
		lblEggBurji.setBounds(362, 364, 70, 14);
		frame.getContentPane().add(lblEggBurji);
		
		JLabel lblMuttonCurry = new JLabel("Mutton Curry");
		lblMuttonCurry.setBounds(362, 387, 92, 14);
		frame.getContentPane().add(lblMuttonCurry);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 562, 641, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblAddOns = new JLabel("Add - Ons :");
		lblAddOns.setBounds(113, 610, 106, 14);
		frame.getContentPane().add(lblAddOns);
		
		JComboBox jcmbDrink2 = new JComboBox();
		jcmbDrink2.setModel(new DefaultComboBoxModel(new String[] {"--Select Drink--", "Mocktails", "Cocktails", "Coke", "ThumpsUp", "Fanta"}));
		jcmbDrink2.setBounds(176, 606, 256, 22);
		frame.getContentPane().add(jcmbDrink2);
		
		JButton btnNewButton_1 = new JButton("TOTAL");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double VegBuffet = Double.parseDouble(jtxtVeg.getText());
				double ivegbuf = 499;
				double Veg;
				
				Veg = (VegBuffet * ivegbuf);
				String cveg = String.format("%.2f", Veg );
				jtxtTotal2.setText(cveg);
				
				
				double ChicBuffet = Double.parseDouble(jtxtNonveg.getText());
				double ichicbuf = 699;
				double Chic;
				
				Chic = (ChicBuffet * ichicbuf);
				String cnon = String.format("%.2f",Chic + Veg );
				jtxtTotal2.setText(cnon);
				
				double Drinks = Double.parseDouble(jtxtDrink2.getText());
				double Mocktails = 140 * Drinks;
				double Cocktails = 180 * Drinks;
				double Coke = 50 * Drinks;
				double ThumpsUp = 50 * Drinks;
				double Fanta = 40 * Drinks;
				
				if (jcmbDrink2.getSelectedItem().equals("Mocktails"))
				{
					String cMock2 = String.format("%.2f", Chic + Veg + Mocktails);
					jtxtTotal2.setText(cMock2);
					
				}
				
				if (jcmbDrink2.getSelectedItem().equals("Cocktails"))
				{
					String cCock2 = String.format("%.2f", Chic + Veg + Cocktails);
				    jtxtTotal2.setText(cCock2);
				}	
				
				if (jcmbDrink2.getSelectedItem().equals("Coke"))
				{
					String cCoke = String.format("%.2f", Chic + Veg + Coke);
				    jtxtTotal2.setText(cCoke);
				}
				
				if (jcmbDrink2.getSelectedItem().equals("ThumpsUp"))
				{
					String cThumpsUp = String.format("%.2f", Chic + Veg + ThumpsUp);
				    jtxtTotal2.setText(cThumpsUp);
				}
				
				if(jcmbDrink2.getSelectedItem().equals("Fanta"))
				{
					String cFanta = String.format("%.2f", Chic + Veg + Fanta);
				    jtxtTotal2.setText(cFanta);
				}
				
				if (jcmbDrink2.getSelectedItem().equals("--Select a drink--"))
				{
					String cSel = String.format("%.2f", Chic + Veg);
				    jtxtTotal2.setText(cSel);
				}
				
				
				
			}
		});
		btnNewButton_1.setBounds(620, 188, 91, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnReceipt = new JButton("RECEIPT");
		btnReceipt.setBounds(620, 264, 91, 23);
		frame.getContentPane().add(btnReceipt);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.setBounds(620, 314, 91, 23);
		frame.getContentPane().add(btnPrint);
		
		JPanel panel = new JPanel();
		panel.setBounds(909, 40, 441, 584);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 11, 421, 562);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblReceipt = new JLabel("Receipt:");
		lblReceipt.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblReceipt.setBounds(909, 18, 107, 14);
		frame.getContentPane().add(lblReceipt);
		
		JButton btnNewButton_2 = new JButton("EXIT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(620, 360, 91, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblVegetarian = new JLabel("Vegetarian ( Rs.499)");
		lblVegetarian.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblVegetarian.setBounds(10, 51, 144, 14);
		frame.getContentPane().add(lblVegetarian);
		
		jtxtVeg = new JTextField();
		jtxtVeg.setText("0");
		jtxtVeg.setBounds(153, 48, 86, 20);
		frame.getContentPane().add(jtxtVeg);
		jtxtVeg.setColumns(10);
		
		JLabel lblNonVegetarian = new JLabel("Non Vegetarian (Rs.699)");
		lblNonVegetarian.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNonVegetarian.setBounds(290, 51, 179, 14);
		frame.getContentPane().add(lblNonVegetarian);
		
		jtxtNonveg = new JTextField();
		jtxtNonveg.setText("0");
		jtxtNonveg.setBounds(479, 48, 86, 20);
		frame.getContentPane().add(jtxtNonveg);
		jtxtNonveg.setColumns(10);
		
		jtxtTotal2 = new JTextField();
		jtxtTotal2.setBounds(625, 222, 86, 20);
		frame.getContentPane().add(jtxtTotal2);
		jtxtTotal2.setColumns(10);
		
		jtxtDrink2 = new JTextField();
		jtxtDrink2.setText("0");
		jtxtDrink2.setBounds(479, 607, 86, 20);
		frame.getContentPane().add(jtxtDrink2);
		jtxtDrink2.setColumns(10);
		
		JLabel lblQty = new JLabel("QTY");
		lblQty.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblQty.setHorizontalAlignment(SwingConstants.CENTER);
		lblQty.setBounds(496, 582, 46, 14);
		frame.getContentPane().add(lblQty);
	}

}
