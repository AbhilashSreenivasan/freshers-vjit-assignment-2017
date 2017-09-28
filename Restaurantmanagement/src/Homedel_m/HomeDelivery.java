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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class HomeDelivery {

	private JFrame frame;
	private JTextField jtxtHomeCW;
	private JTextField jtxtHomeCK;
	private JTextField jtxtHomePas;
	private JTextField jtxtHomeFries;
	private JTextField jtxtHomeCC;
	private JTextField jtxtHomeVR;
	private JTextField jtxtHomeCR;
	private JTextField jtxtHomeVB;
	private JTextField jtxtHomeCB;
	private JTextField jtxtHomeRT;
	private JTextField jtxtHomeShakes;
	private JTextField jtxtHomeIC;
	private JTextField jtxtHomeSC;
	private JTextField jtxtHomeLassi;
	private JTextField jtxtHomeRG;
	private JTextField jtxtHomeAdd;
	private JTextField jtxtHomeDrink;
	private JTextField jtxtHomeSTR;
	private JTextField jtxtHomeMCR;
	private JTextField jtxtHomeDSR;
	private JTextField jtxtHomeAddR;
	private JTextField jtxtHomeTot;
	private JTextField jtxtHomeTotal;
	private JTextField jtxtHomeDRI;

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
		
		JLabel jlblHomeCK = new JLabel("Chicken Kebabs (Rs.180)");
		jlblHomeCK.setBounds(0, 61, 148, 14);
		panel.add(jlblHomeCK);
		
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
		
		jtxtHomeCW = new JTextField();
		jtxtHomeCW.setText("0");
		jtxtHomeCW.setColumns(10);
		jtxtHomeCW.setBounds(143, 33, 86, 20);
		panel.add(jtxtHomeCW);
		
		jtxtHomeCK = new JTextField();
		jtxtHomeCK.setText("0");
		jtxtHomeCK.setColumns(10);
		jtxtHomeCK.setBounds(143, 58, 86, 20);
		panel.add(jtxtHomeCK);
		
		jtxtHomePas = new JTextField();
		jtxtHomePas.setText("0");
		jtxtHomePas.setColumns(10);
		jtxtHomePas.setBounds(143, 83, 86, 20);
		panel.add(jtxtHomePas);
		
		jtxtHomeFries = new JTextField();
		jtxtHomeFries.setText("0");
		jtxtHomeFries.setColumns(10);
		jtxtHomeFries.setBounds(145, 109, 86, 20);
		panel.add(jtxtHomeFries);
		
		jtxtHomeCC = new JTextField();
		jtxtHomeCC.setText("0");
		jtxtHomeCC.setColumns(10);
		jtxtHomeCC.setBounds(145, 134, 86, 20);
		panel.add(jtxtHomeCC);
		
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
		
		jtxtHomeVR = new JTextField();
		jtxtHomeVR.setText("0");
		jtxtHomeVR.setColumns(10);
		jtxtHomeVR.setBounds(467, 33, 86, 20);
		panel.add(jtxtHomeVR);
		
		jtxtHomeCR = new JTextField();
		jtxtHomeCR.setText("0");
		jtxtHomeCR.setColumns(10);
		jtxtHomeCR.setBounds(467, 58, 86, 20);
		panel.add(jtxtHomeCR);
		
		jtxtHomeVB = new JTextField();
		jtxtHomeVB.setText("0");
		jtxtHomeVB.setColumns(10);
		jtxtHomeVB.setBounds(467, 83, 86, 20);
		panel.add(jtxtHomeVB);
		
		jtxtHomeCB = new JTextField();
		jtxtHomeCB.setText("0");
		jtxtHomeCB.setColumns(10);
		jtxtHomeCB.setBounds(467, 109, 86, 20);
		panel.add(jtxtHomeCB);
		
		jtxtHomeRT = new JTextField();
		jtxtHomeRT.setText("0");
		jtxtHomeRT.setColumns(10);
		jtxtHomeRT.setBounds(467, 137, 86, 20);
		panel.add(jtxtHomeRT);
		
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
		
		jtxtHomeShakes = new JTextField();
		jtxtHomeShakes.setText("0");
		jtxtHomeShakes.setColumns(10);
		jtxtHomeShakes.setBounds(736, 36, 86, 20);
		panel.add(jtxtHomeShakes);
		
		jtxtHomeIC = new JTextField();
		jtxtHomeIC.setText("0");
		jtxtHomeIC.setColumns(10);
		jtxtHomeIC.setBounds(736, 58, 86, 20);
		panel.add(jtxtHomeIC);
		
		jtxtHomeSC = new JTextField();
		jtxtHomeSC.setText("0");
		jtxtHomeSC.setColumns(10);
		jtxtHomeSC.setBounds(736, 83, 86, 20);
		panel.add(jtxtHomeSC);
		
		jtxtHomeLassi = new JTextField();
		jtxtHomeLassi.setText("0");
		jtxtHomeLassi.setColumns(10);
		jtxtHomeLassi.setBounds(736, 109, 86, 20);
		panel.add(jtxtHomeLassi);
		
		jtxtHomeRG = new JTextField();
		jtxtHomeRG.setText("0");
		jtxtHomeRG.setColumns(10);
		jtxtHomeRG.setBounds(736, 134, 86, 20);
		panel.add(jtxtHomeRG);
		
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
		
		JComboBox jcmbHomeDrink = new JComboBox();
		jcmbHomeDrink.setModel(new DefaultComboBoxModel(new String[] {"--Select Drink--", "Coke", "ThumpsUp", "Fanta", "Sprite", "Mirinda"}));
		jcmbHomeDrink.setBounds(325, 220, 206, 22);
		panel.add(jcmbHomeDrink);
		
		jtxtHomeDrink = new JTextField();
		jtxtHomeDrink.setText("0");
		jtxtHomeDrink.setBounds(611, 221, 86, 20);
		panel.add(jtxtHomeDrink);
		jtxtHomeDrink.setColumns(10);
		
		JLabel label_4 = new JLabel("QTY");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_4.setBounds(640, 198, 46, 14);
		panel.add(label_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(903, 54, 447, 597);
		panel_1.setLayout(null);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(10, 11, 427, 575);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCustomerCopy = new JLabel("CUSTOMER COPY");
		lblCustomerCopy.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCustomerCopy.setBounds(163, 11, 112, 14);
		panel_2.add(lblCustomerCopy);
		
		JLabel lblItem = new JLabel("Item");
		lblItem.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblItem.setBounds(55, 44, 46, 14);
		panel_2.add(lblItem);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrice.setBounds(334, 44, 46, 14);
		panel_2.add(lblPrice);
		
		JLabel lblStarters = new JLabel("Starters");
		lblStarters.setBounds(41, 86, 80, 14);
		panel_2.add(lblStarters);
		
		JLabel lblMainCourse = new JLabel("Main Course");
		lblMainCourse.setBounds(41, 125, 80, 14);
		panel_2.add(lblMainCourse);
		
		JLabel lblDesserts = new JLabel("Desserts");
		lblDesserts.setBounds(41, 170, 80, 14);
		panel_2.add(lblDesserts);
		
		jtxtHomeSTR = new JTextField();
		jtxtHomeSTR.setBounds(294, 83, 86, 20);
		panel_2.add(jtxtHomeSTR);
		jtxtHomeSTR.setColumns(10);
		
		jtxtHomeMCR = new JTextField();
		jtxtHomeMCR.setBounds(294, 122, 86, 20);
		panel_2.add(jtxtHomeMCR);
		jtxtHomeMCR.setColumns(10);
		
		jtxtHomeDSR = new JTextField();
		jtxtHomeDSR.setForeground(Color.BLACK);
		jtxtHomeDSR.setBounds(294, 167, 86, 20);
		panel_2.add(jtxtHomeDSR);
		jtxtHomeDSR.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(41, 278, 80, 14);
		panel_2.add(lblAddress);
		
		jtxtHomeAddR = new JTextField();
		jtxtHomeAddR.setBounds(10, 303, 407, 119);
		panel_2.add(jtxtHomeAddR);
		jtxtHomeAddR.setColumns(10);
		
		JLabel lblTotal = new JLabel("TOTAL");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotal.setBounds(10, 433, 46, 14);
		panel_2.add(lblTotal);
		
		jtxtHomeTot = new JTextField();
		jtxtHomeTot.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jtxtHomeTot.setBounds(203, 430, 214, 20);
		panel_2.add(jtxtHomeTot);
		jtxtHomeTot.setColumns(10);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setBounds(41, 218, 46, 14);
		panel_2.add(lblDrink);
		
		jtxtHomeDRI = new JTextField();
		jtxtHomeDRI.setBounds(294, 215, 86, 20);
		panel_2.add(jtxtHomeDRI);
		jtxtHomeDRI.setColumns(10);
		
		JLabel lblHomeDelivery = new JLabel("Home Delivery");
		lblHomeDelivery.setBounds(412, 11, 196, 25);
		lblHomeDelivery.setFont(new Font("Tahoma", Font.BOLD, 19));
		frame.getContentPane().add(lblHomeDelivery);
		
		JLabel lblDeliveryCharges_1 = new JLabel("Delivery Address:");
		lblDeliveryCharges_1.setBounds(57, 364, 125, 14);
		frame.getContentPane().add(lblDeliveryCharges_1);
		
		jtxtHomeAdd = new JTextField();
		jtxtHomeAdd.setBounds(155, 364, 463, 275);
		frame.getContentPane().add(jtxtHomeAdd);
		jtxtHomeAdd.setColumns(10);
		
		JLabel lblReceipt = new JLabel("RECEIPT:");
		lblReceipt.setBounds(901, 29, 225, 14);
		lblReceipt.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblReceipt);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ChickeWings = Double.parseDouble(jtxtHomeCW.getText());
				double iChickeWings = 120;
				double Wings;
				
				Wings = (ChickeWings * iChickeWings);
				String cwin = String.format("%.2f", Wings);
				jtxtHomeTotal.setText(cwin);
				
				double ChickeKebabs = Double.parseDouble(jtxtHomeCK.getText());
				double iChickeKebabs = 180;
				double Kebabs;
				
				Kebabs = (ChickeKebabs * iChickeKebabs);
				String ckeb = String.format("%.2f", Kebabs + Wings);
				jtxtHomeTotal.setText(ckeb);
				
				double Past1 = Double.parseDouble(jtxtHomePas.getText());
				double iPast1 = 140;
				double Pas;
				
				Pas = (Past1 * iPast1);
				String cp1 = String.format("%.2f", Pas + Kebabs + Wings);
				jtxtHomeTotal.setText(cp1);
				
				double FrencFries = Double.parseDouble(jtxtHomeFries.getText());
				double iFrencFries = 80;
				double Fries;
				
				Fries = (FrencFries * iFrencFries);
				String cfris = String.format("%.2f", Fries + Pas + Kebabs + Wings );
				jtxtHomeTotal.setText(cfris);
				
				double CrispyCorn = Double.parseDouble(jtxtHomeCC.getText());
				double iCrispyCorn = 150;
				double Corn;
				
				Corn = (CrispyCorn * iCrispyCorn);
				String ccorn = String.format("%.2f", Corn + Fries + Pas + Kebabs + Wings);
				jtxtHomeTotal.setText(ccorn);
				
				double VegRice = Double.parseDouble(jtxtHomeVR.getText());
				double iVegRice = 110;
				double VegFRice;
				
				VegFRice = (VegRice * iVegRice);
				String cvegrice = String.format("%.2f", VegFRice + Corn + Fries + Pas + Kebabs + Wings);
				jtxtHomeTotal.setText(cvegrice);
				
				double ChickenRice = Double.parseDouble(jtxtHomeCR.getText());
				double iChickenRice = 140;
				double ChickFRice;
				
				ChickFRice = (ChickenRice * iChickenRice);
				String cchicrice = String.format("%.2f", ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings);
				jtxtHomeTotal.setText(cchicrice);
				
				double VegBiryani = Double.parseDouble(jtxtHomeVB.getText());
				double iVegBiryani = 180;
				double VBiryani;
				
				VBiryani = (VegBiryani * iVegBiryani);
				String vbiryani = String.format("%.2f", VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings);
				jtxtHomeTotal.setText(vbiryani);
				
				double ChicBiryani = Double.parseDouble(jtxtHomeCB.getText());
				double iChicBiryani = 220;
				double CBiryani;
				
				CBiryani = (ChicBiryani * iChicBiryani);
				String cbiryani = String.format("%.2f", CBiryani + VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings);
				jtxtHomeTotal.setText(cbiryani);
				
				
				double Rotis = Double.parseDouble(jtxtHomeRT.getText());
				double iRotis = 6;
				double VRotis;
				
				VRotis = (Rotis * iRotis);
				String vrotis = String.format("%.2f", VRotis + CBiryani + VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings);
				jtxtHomeTotal.setText(vrotis);
				
				double Shakes = Double.parseDouble(jtxtHomeShakes.getText());
				double iShakes = 85;
				double VShakes;
				
				VShakes = (Shakes * iShakes);
				String vshakes = String.format("%.2f", VShakes + VRotis + CBiryani + VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings);
				jtxtHomeTotal.setText(vshakes);
				
				double Ice = Double.parseDouble(jtxtHomeIC.getText());
				double iIce = 135;
				double Vice;
				
				Vice = (Ice * iIce);
				String vice = String.format("%.2f", Vice + VShakes + VRotis + CBiryani + VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings);
				jtxtHomeTotal.setText(vice);
				
				double Stone = Double.parseDouble(jtxtHomeSC.getText());
				double iStone = 360;
				double VStone;
				
				VStone = (Stone * iStone);
				String vstone = String.format("%.2f", VStone + Vice + VShakes + VRotis + CBiryani + VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings);
				jtxtHomeTotal.setText(vstone);
				
				double Lassi = Double.parseDouble(jtxtHomeLassi.getText());
				double iLassi = 60;
				double VLassi;
				
				VLassi = (Lassi * iLassi);
				String vlassi = String.format("%.2f", VLassi + VStone + Vice + VShakes + VRotis + CBiryani + VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings);
				jtxtHomeTotal.setText(vlassi);
				
				double Rasgulla = Double.parseDouble(jtxtHomeRG.getText());
				double iRasgulla = 110;
				double VRasgulla;
				
				VRasgulla = (Rasgulla * iRasgulla);
				String vras = String.format("%.2f", VRasgulla + VLassi + VStone + Vice + VShakes + VRotis + CBiryani + VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings);
				jtxtHomeTotal.setText(vras);
				
				double Drinks = Double.parseDouble(jtxtHomeDrink.getText());
				double Mocktails = 140 * Drinks;
				double Cocktails = 180 * Drinks;
				double Coke = 50 * Drinks;
				double ThumpsUp = 50 * Drinks;
				double Fanta = 40 * Drinks;
				
				if (jcmbHomeDrink.getSelectedItem().equals("Mocktails"))
				{
					 
					String cMock = String.format("%.2f", VRasgulla + VLassi + VStone + Vice + VShakes + VRotis + CBiryani + VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings + Mocktails);
					jtxtHomeTotal.setText(cMock);
				}
				
				if (jcmbHomeDrink.getSelectedItem().equals("Cocktails"))
				{
					String cCocktail = String.format("%.2f", VRasgulla + VLassi + VStone + Vice + VShakes + VRotis + CBiryani + VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings + Cocktails);
					jtxtHomeTotal.setText(cCocktail);
				}
				
				if (jcmbHomeDrink.getSelectedItem().equals("Coke"))
				{
					String cCoke = String.format("%.2f", VRasgulla + VLassi + VStone + Vice + VShakes + VRotis + CBiryani + VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings + Coke);
					jtxtHomeTotal.setText(cCoke);
				}
				
				if (jcmbHomeDrink.getSelectedItem().equals("ThumpsUp"))
				{
					String cThum = String.format("%.2f", VRasgulla + VLassi + VStone + Vice + VShakes + VRotis + CBiryani + VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings + ThumpsUp);
					jtxtHomeTotal.setText(cThum);
			    }
				
				if (jcmbHomeDrink.getSelectedItem().equals("Fanta"))
				{
					String cFanta = String.format("%.2f", VRasgulla + VLassi + VStone + Vice + VShakes + VRotis + CBiryani + VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings + Fanta);
					jtxtHomeTotal.setText(cFanta);
				}
				
				if (jcmbHomeDrink.getSelectedItem().equals("--Select a drink--"))
				{
					String cSel = String.format("%.2f", VRasgulla + VLassi + VStone + Vice + VShakes + VRotis + CBiryani + VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings);
					jtxtHomeTotal.setText(cSel);
				}
		
			}
		});
		btnTotal.setBounds(657, 385, 91, 23);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtHomeCW.setText("0");
				jtxtHomeCK.setText("0");
				jtxtHomePas.setText("0");
				jtxtHomeFries.setText("0");
				jtxtHomeCC.setText("0");
				jtxtHomeVB.setText("0");
				jtxtHomeCB.setText("0");
				jtxtHomeVR.setText("0");
				jtxtHomeCR.setText("0");
				jtxtHomeRT.setText("0");
				jtxtHomeShakes.setText("0");
				jtxtHomeIC.setText("0");
				jtxtHomeSC.setText("0");
				jtxtHomeLassi.setText("0");
				jtxtHomeRG.setText("0");
				jtxtHomeTot.setText("0");
				jtxtHomeSTR.setText("0");
				jtxtHomeMCR.setText("0");
				jtxtHomeDSR.setText("0");
				jtxtHomeTotal.setText("0");
				jtxtHomeDrink.setText("0");
				jtxtHomeDRI.setText("0");
				jtxtHomeAdd.setText("");
				jtxtHomeAddR.setText("");
				jcmbHomeDrink.setSelectedItem("--Select Drink--");
				
			}
		});
		btnReset.setBounds(657, 442, 91, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			System.exit(0);
			}
		});
		btnExit.setBounds(657, 512, 91, 23);
		frame.getContentPane().add(btnExit);
		
		jtxtHomeTotal = new JTextField();
		jtxtHomeTotal.setText("");
		jtxtHomeTotal.setBounds(628, 411, 147, 20);
		frame.getContentPane().add(jtxtHomeTotal);
		jtxtHomeTotal.setColumns(10);
		
		JButton btnNewButton = new JButton("Print");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ChickeWings = Double.parseDouble(jtxtHomeCW.getText());
				double iChickeWings = 120;
				double Wings;
				
				Wings = (ChickeWings * iChickeWings);
				String cwin = String.format("%.2f", Wings);
				jtxtHomeSTR.setText(cwin);
				
				double ChickeKebabs = Double.parseDouble(jtxtHomeCK.getText());
				double iChickeKebabs = 180;
				double Kebabs;
				
				Kebabs = (ChickeKebabs * iChickeKebabs);
				String ckeb = String.format("%.2f", Kebabs + Wings);
				jtxtHomeSTR.setText(ckeb);
				
				double Past1 = Double.parseDouble(jtxtHomePas.getText());
				double iPast1 = 140;
				double Pas;
				
				Pas = (Past1 * iPast1);
				String cp1 = String.format("%.2f", Pas + Kebabs + Wings);
				jtxtHomeSTR.setText(cp1);
				
				double FrencFries = Double.parseDouble(jtxtHomeFries.getText());
				double iFrencFries = 80;
				double Fries;
				
				Fries = (FrencFries * iFrencFries);
				String cfris = String.format("%.2f", Fries + Pas + Kebabs + Wings );
				jtxtHomeSTR.setText(cfris);
				
				double CrispyCorn = Double.parseDouble(jtxtHomeCC.getText());
				double iCrispyCorn = 150;
				double Corn;
				
				Corn = (CrispyCorn * iCrispyCorn);
				String ccorn = String.format("%.2f", Corn + Fries + Pas + Kebabs + Wings);
				jtxtHomeSTR.setText(ccorn);
				
				double VegRice = Double.parseDouble(jtxtHomeVR.getText());
				double iVegRice = 110;
				double VegFRice;
				
				VegFRice = (VegRice * iVegRice);
				String cvegrice = String.format("%.2f", VegFRice);
				jtxtHomeMCR.setText(cvegrice);
				
				double ChickenRice = Double.parseDouble(jtxtHomeCR.getText());
				double iChickenRice = 140;
				double ChickFRice;
				
				ChickFRice = (ChickenRice * iChickenRice);
				String cchicrice = String.format("%.2f", ChickFRice + VegFRice);
				jtxtHomeMCR.setText(cchicrice);
				
				double VegBiryani = Double.parseDouble(jtxtHomeVB.getText());
				double iVegBiryani = 180;
				double VBiryani;
				
				VBiryani = (VegBiryani * iVegBiryani);
				String vbiryani = String.format("%.2f", VBiryani + ChickFRice + VegFRice);
				jtxtHomeMCR.setText(vbiryani);
				
				double ChicBiryani = Double.parseDouble(jtxtHomeCB.getText());
				double iChicBiryani = 220;
				double CBiryani;
				
				CBiryani = (ChicBiryani * iChicBiryani);
				String cbiryani = String.format("%.2f", CBiryani + VBiryani + ChickFRice + VegFRice);
				jtxtHomeMCR.setText(cbiryani);
				
				
				double Rotis = Double.parseDouble(jtxtHomeRT.getText());
				double iRotis = 6;
				double VRotis;
				
				VRotis = (Rotis * iRotis);
				String vrotis = String.format("%.2f", VRotis + CBiryani + VBiryani + ChickFRice + VegFRice);
				jtxtHomeMCR.setText(vrotis);
				
				double Shakes = Double.parseDouble(jtxtHomeShakes.getText());
				double iShakes = 85;
				double VShakes;
				
				VShakes = (Shakes * iShakes);
				String vshakes = String.format("%.2f", VShakes);
				jtxtHomeDSR.setText(vshakes);
				
				double Ice = Double.parseDouble(jtxtHomeIC.getText());
				double iIce = 135;
				double Vice;
				
				Vice = (Ice * iIce);
				String vice = String.format("%.2f", Vice + VShakes);
				jtxtHomeDSR.setText(vice);
				
				double Stone = Double.parseDouble(jtxtHomeSC.getText());
				double iStone = 360;
				double VStone;
				
				VStone = (Stone * iStone);
				String vstone = String.format("%.2f", VStone + Vice + VShakes);
				jtxtHomeDSR.setText(vstone);
				
				double Lassi = Double.parseDouble(jtxtHomeLassi.getText());
				double iLassi = 60;
				double VLassi;
				
				VLassi = (Lassi * iLassi);
				String vlassi = String.format("%.2f", VLassi + VStone + Vice + VShakes);
				jtxtHomeDSR.setText(vlassi);
				
				double Rasgulla = Double.parseDouble(jtxtHomeRG.getText());
				double iRasgulla = 110;
				double VRasgulla;
				
				VRasgulla = (Rasgulla * iRasgulla);
				String vras = String.format("%.2f", VRasgulla + VLassi + VStone + Vice + VShakes);
				jtxtHomeDSR.setText(vras);
				
				jtxtHomeAddR.setText(jtxtHomeAdd.getText());
			
				jtxtHomeTot.setText(jtxtHomeTotal.getText());
				
				double Drink = Double.parseDouble(jtxtHomeDrink.getText());
				double Cok = 50 * Drink;
				double ThumpsU = 50 * Drink;
				double Fant = 40 * Drink;
				double Sprite = 30 * Drink;
				double Mirinda = 40 * Drink;
				
				if (jcmbHomeDrink.getSelectedItem().equals("Coke"))
				{
					String cCoke = String.format("%.2f",Cok);
					jtxtHomeDRI.setText(cCoke);
				}
				
				if (jcmbHomeDrink.getSelectedItem().equals("ThumpsUp"))
				{
					String cThum = String.format("%.2f",ThumpsU);
					jtxtHomeDRI.setText(cThum);
			    }
				
				if (jcmbHomeDrink.getSelectedItem().equals("Fanta"))
				{
					String cFanta = String.format("%.2f",Fant);
					jtxtHomeDRI.setText(cFanta);
				}
				
				if (jcmbHomeDrink.getSelectedItem().equals("Sprite"))
				{
					String cSprite = String.format("%.2f",Sprite);
					jtxtHomeDRI.setText(cSprite);
				}
				
				if (jcmbHomeDrink.getSelectedItem().equals("Mirinda"))
				{
					String cMir = String.format("%.2f", Mirinda);
					jtxtHomeDRI.setText(cMir);
				}
				
				if (jcmbHomeDrink.getSelectedItem().equals("--Select a drink--"))
				{
					String cSel = String.format("%.2f",Fant);
					jtxtHomeDRI.setText("0");
				}
		
			}
		});
		btnNewButton.setBounds(657, 478, 91, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
