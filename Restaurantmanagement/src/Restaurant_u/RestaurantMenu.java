package Restaurant_u;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class RestaurantMenu {

	private JFrame frame;
	private JTextField jtxtChickenWings;
	private JTextField jtxtChickenKebabs;
	private JTextField jtxtPasta;
	private JTextField jtxtFries;
	private JTextField jtxtCrispyCorn;
	private JTextField jtxtVegRice;
	private JTextField jtxtChickenRice;
	private JTextField jtxtVegBiryani;
	private JTextField jtxtChicBiryani;
	private JTextField jtxtRotis;
	private JTextField jtxtShakes;
	private JTextField jtxtIce;
	private JTextField jtxtStone;
	private JTextField jtxtLassi;
	private JTextField jtxtRasgulla;
	private JTextField jtxtTotal;
	private JTextField jtxtDrink;
	private JTextField jtxtRecCWings;
	private JTextField jtxtRecCKebabs;
	private JTextField jtxtRecPasta;
	private JTextField jtxtRecFries;
	private JTextField jtxtRecCorn;
	private JTextField jtxtRecVRice;
	private JTextField jtxtRecCRice;
	private JTextField jtxtRecVBir;
	private JTextField jtxtRecCBir;
	private JTextField jtxtRecRotis;
	private JTextField jtxtRecShakes;
	private JTextField jtxtRecCream;
	private JTextField jtxtRecStone;
	private JTextField jtxtRecLassi;
	private JTextField jtxtRecRasg;
	private JTextField jtxtRecDrink;
	private JTextField jtxtRecTots;
	private JTextField jtxtChefCW;
	private JTextField jtxtChefCK;
	private JTextField jtxtChefPas;
	private JTextField jtxtChefFF;
	private JTextField jtxtChefCorn;
	private JTextField jtxtChefVR;
	private JTextField jtxtChefCR;
	private JTextField jtxtChefVB;
	private JTextField jtxtChefCB;
	private JTextField jtxtChefRT;
	private JTextField jtxtChefRG;
	private JTextField jtxtChefLassi;
	private JTextField jtxtChefSC;
	private JTextField jtxtChefIC;
	private JTextField jtxtChefShakes;
	private JTextField jtxtChefDrink;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestaurantMenu window = new RestaurantMenu();
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
	public RestaurantMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 30, 852, 275);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblStarters = new JLabel("STARTERS");
		lblStarters.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblStarters.setHorizontalAlignment(SwingConstants.CENTER);
		lblStarters.setBounds(0, 11, 100, 14);
		panel.add(lblStarters);
		
		JLabel lblMainCourse = new JLabel("MAIN COURSE");
		lblMainCourse.setHorizontalAlignment(SwingConstants.CENTER);
		lblMainCourse.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMainCourse.setBounds(303, 11, 148, 14);
		panel.add(lblMainCourse);
		
		JLabel lblDesserts = new JLabel("DESSERTS");
		lblDesserts.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDesserts.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesserts.setBounds(597, 11, 100, 14);
		panel.add(lblDesserts);
		
		JLabel lblChickenWings = new JLabel("Chicken Wings (Rs.120)");
		lblChickenWings.setBounds(0, 36, 148, 14);
		panel.add(lblChickenWings);
		
		JLabel lblChickenKebabsrs = new JLabel("Chicken Kebabs (Rs.180)");
		lblChickenKebabsrs.setBounds(0, 61, 148, 14);
		panel.add(lblChickenKebabsrs);
		
		JLabel lblPastars = new JLabel("Pasta (Rs.140)");
		lblPastars.setBounds(10, 86, 114, 14);
		panel.add(lblPastars);
		
		JLabel lblFriesrs = new JLabel("Fries (Rs. 80) ");
		lblFriesrs.setBounds(10, 112, 100, 14);
		panel.add(lblFriesrs);
		
		JLabel lblCripsyCornrs = new JLabel("Cripsy Corn (Rs.150)");
		lblCripsyCornrs.setBounds(0, 137, 148, 14);
		panel.add(lblCripsyCornrs);
		
		JLabel lblQty = new JLabel("QTY");
		lblQty.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblQty.setBounds(173, 13, 46, 14);
		panel.add(lblQty);
		
		jtxtChickenWings = new JTextField();
		jtxtChickenWings.setText("0");
		jtxtChickenWings.setBounds(143, 33, 86, 20);
		panel.add(jtxtChickenWings);
		jtxtChickenWings.setColumns(10);
		
		jtxtChickenKebabs = new JTextField();
		jtxtChickenKebabs.setText("0");
		jtxtChickenKebabs.setColumns(10);
		jtxtChickenKebabs.setBounds(143, 58, 86, 20);
		panel.add(jtxtChickenKebabs);
		
		jtxtPasta = new JTextField();
		jtxtPasta.setText("0");
		jtxtPasta.setColumns(10);
		jtxtPasta.setBounds(143, 83, 86, 20);
		panel.add(jtxtPasta);
		
		jtxtFries = new JTextField();
		jtxtFries.setText("0");
		jtxtFries.setColumns(10);
		jtxtFries.setBounds(145, 109, 86, 20);
		panel.add(jtxtFries);
		
		jtxtCrispyCorn = new JTextField();
		jtxtCrispyCorn.setText("0");
		jtxtCrispyCorn.setColumns(10);
		jtxtCrispyCorn.setBounds(145, 134, 86, 20);
		panel.add(jtxtCrispyCorn);
		
		JLabel lblVegFriedRice = new JLabel("Veg Fried Rice (Rs.110)");
		lblVegFriedRice.setBounds(313, 36, 138, 14);
		panel.add(lblVegFriedRice);
		
		JLabel lblChickenFriedRice = new JLabel("Chicken Fried Rice (Rs.140)");
		lblChickenFriedRice.setBounds(289, 61, 168, 14);
		panel.add(lblChickenFriedRice);
		
		JLabel lblVegBiryani = new JLabel("Veg Biryani (Rs.180)");
		lblVegBiryani.setBounds(310, 86, 141, 14);
		panel.add(lblVegBiryani);
		
		JLabel lblChickenBiryani = new JLabel("Chicken Biryani (Rs.220)");
		lblChickenBiryani.setBounds(303, 112, 148, 14);
		panel.add(lblChickenBiryani);
		
		JLabel lblRotis = new JLabel("Rotis (Rs.6)");
		lblRotis.setBounds(325, 137, 100, 14);
		panel.add(lblRotis);
		
		jtxtVegRice = new JTextField();
		jtxtVegRice.setText("0");
		jtxtVegRice.setBounds(467, 33, 86, 20);
		panel.add(jtxtVegRice);
		jtxtVegRice.setColumns(10);
		
		jtxtChickenRice = new JTextField();
		jtxtChickenRice.setText("0");
		jtxtChickenRice.setColumns(10);
		jtxtChickenRice.setBounds(467, 58, 86, 20);
		panel.add(jtxtChickenRice);
		
		jtxtVegBiryani = new JTextField();
		jtxtVegBiryani.setText("0");
		jtxtVegBiryani.setColumns(10);
		jtxtVegBiryani.setBounds(467, 83, 86, 20);
		panel.add(jtxtVegBiryani);
		
		jtxtChicBiryani = new JTextField();
		jtxtChicBiryani.setText("0");
		jtxtChicBiryani.setColumns(10);
		jtxtChicBiryani.setBounds(467, 109, 86, 20);
		panel.add(jtxtChicBiryani);
		
		jtxtRotis = new JTextField();
		jtxtRotis.setText("0");
		jtxtRotis.setColumns(10);
		jtxtRotis.setBounds(467, 137, 86, 20);
		panel.add(jtxtRotis);
		
		JLabel lblMilkshakesrs = new JLabel("Milkshakes (Rs.85)");
		lblMilkshakesrs.setBounds(607, 36, 119, 14);
		panel.add(lblMilkshakesrs);
		
		JLabel lblIcecreamrs = new JLabel("Ice-cream (Rs.135)");
		lblIcecreamrs.setBounds(597, 61, 129, 14);
		panel.add(lblIcecreamrs);
		
		JLabel lblStoneConceptsrs = new JLabel("Stone Concepts (Rs.360)");
		lblStoneConceptsrs.setBounds(575, 86, 151, 14);
		panel.add(lblStoneConceptsrs);
		
		JLabel lblLassirs = new JLabel("Lassi (Rs.60)");
		lblLassirs.setBounds(613, 112, 86, 14);
		panel.add(lblLassirs);
		
		JLabel lblRasgullars = new JLabel("Rasgulla (Rs.110)");
		lblRasgullars.setBounds(597, 137, 129, 14);
		panel.add(lblRasgullars);
		
		jtxtShakes = new JTextField();
		jtxtShakes.setText("0");
		jtxtShakes.setBounds(736, 36, 86, 20);
		panel.add(jtxtShakes);
		jtxtShakes.setColumns(10);
		
		jtxtIce = new JTextField();
		jtxtIce.setText("0");
		jtxtIce.setColumns(10);
		jtxtIce.setBounds(736, 58, 86, 20);
		panel.add(jtxtIce);
		
		jtxtStone = new JTextField();
		jtxtStone.setText("0");
		jtxtStone.setColumns(10);
		jtxtStone.setBounds(736, 83, 86, 20);
		panel.add(jtxtStone);
		
		jtxtLassi = new JTextField();
		jtxtLassi.setText("0");
		jtxtLassi.setColumns(10);
		jtxtLassi.setBounds(736, 109, 86, 20);
		panel.add(jtxtLassi);
		
		jtxtRasgulla = new JTextField();
		jtxtRasgulla.setText("0");
		jtxtRasgulla.setColumns(10);
		jtxtRasgulla.setBounds(736, 134, 86, 20);
		panel.add(jtxtRasgulla);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 185, 812, 2);
		panel.add(separator);
		
		JLabel label = new JLabel("QTY");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(496, 13, 46, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("QTY");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(776, 13, 46, 14);
		panel.add(label_1);
		
		JLabel lblChooseADrink = new JLabel("Choose a drink : ");
		lblChooseADrink.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblChooseADrink.setBounds(206, 222, 123, 14);
		panel.add(lblChooseADrink);
		
		JComboBox jcmbDrink = new JComboBox();
		jcmbDrink.setModel(new DefaultComboBoxModel(new String[] {"--Select a drink--", "Mocktails", "Cocktails", "Coke", "Thumpsup", "Fanta "}));
		jcmbDrink.setBounds(325, 220, 206, 22);
		panel.add(jcmbDrink);
		
		
		jtxtDrink = new JTextField();
		jtxtDrink.setText("0");
		jtxtDrink.setBounds(611, 221, 86, 20);
		panel.add(jtxtDrink);
		jtxtDrink.setColumns(10);
		
		JLabel lblQty_1 = new JLabel("QTY");
		lblQty_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblQty_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblQty_1.setBounds(613, 196, 71, 14);
		panel.add(lblQty_1);
		
	
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 351, 617, 300);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel jpanel1 = new JPanel();
		jpanel1.setBackground(Color.WHITE);
		jpanel1.setBounds(10, 11, 597, 278);
		panel_1.add(jpanel1);
		jpanel1.setLayout(null);
		
		JLabel label_2 = new JLabel("Chicken Wings");
		label_2.setBounds(10, 11, 93, 14);
		jpanel1.add(label_2);
		
		JLabel label_3 = new JLabel("Chicken Kebabs");
		label_3.setBounds(10, 52, 93, 14);
		jpanel1.add(label_3);
		
		JLabel label_4 = new JLabel("Pasta");
		label_4.setBounds(10, 100, 69, 14);
		jpanel1.add(label_4);
		
		JLabel label_5 = new JLabel("French Fries");
		label_5.setBounds(10, 152, 93, 14);
		jpanel1.add(label_5);
		
		JLabel label_6 = new JLabel("Corn");
		label_6.setBounds(10, 200, 73, 14);
		jpanel1.add(label_6);
		
		JLabel label_7 = new JLabel("Veg Rice");
		label_7.setBounds(236, 11, 88, 14);
		jpanel1.add(label_7);
		
		JLabel label_8 = new JLabel("Chicken Rice");
		label_8.setBounds(236, 52, 88, 14);
		jpanel1.add(label_8);
		
		JLabel label_9 = new JLabel("Veg Biryani");
		label_9.setBounds(236, 100, 88, 14);
		jpanel1.add(label_9);
		
		JLabel label_10 = new JLabel("Chicken Biryani");
		label_10.setBounds(236, 152, 107, 14);
		jpanel1.add(label_10);
		
		JLabel label_11 = new JLabel("Rotis");
		label_11.setBounds(247, 200, 46, 14);
		jpanel1.add(label_11);
		
		JLabel label_12 = new JLabel("Shakes ");
		label_12.setBounds(396, 11, 46, 14);
		jpanel1.add(label_12);
		
		JLabel label_13 = new JLabel("Ice cream");
		label_13.setBounds(396, 52, 101, 14);
		jpanel1.add(label_13);
		
		JLabel label_14 = new JLabel("Stone Concepts");
		label_14.setBounds(396, 100, 113, 14);
		jpanel1.add(label_14);
		
		JLabel label_15 = new JLabel("Lassi");
		label_15.setBounds(398, 152, 60, 14);
		jpanel1.add(label_15);
		
		JLabel label_16 = new JLabel("Rasgulla");
		label_16.setBounds(396, 200, 73, 14);
		jpanel1.add(label_16);
		
		JLabel label_17 = new JLabel("Drink");
		label_17.setBounds(396, 239, 46, 14);
		jpanel1.add(label_17);
		
		jtxtChefCW = new JTextField();
		jtxtChefCW.setText("0");
		jtxtChefCW.setColumns(10);
		jtxtChefCW.setBounds(113, 11, 39, 20);
		jpanel1.add(jtxtChefCW);
		
		jtxtChefCK = new JTextField();
		jtxtChefCK.setText("0");
		jtxtChefCK.setColumns(10);
		jtxtChefCK.setBounds(113, 49, 39, 20);
		jpanel1.add(jtxtChefCK);
		
		jtxtChefPas = new JTextField();
		jtxtChefPas.setText("0");
		jtxtChefPas.setColumns(10);
		jtxtChefPas.setBounds(113, 97, 39, 20);
		jpanel1.add(jtxtChefPas);
		
		jtxtChefFF = new JTextField();
		jtxtChefFF.setText("0");
		jtxtChefFF.setColumns(10);
		jtxtChefFF.setBounds(113, 149, 39, 20);
		jpanel1.add(jtxtChefFF);
		
		jtxtChefCorn = new JTextField();
		jtxtChefCorn.setText("0");
		jtxtChefCorn.setColumns(10);
		jtxtChefCorn.setBounds(113, 197, 39, 20);
		jpanel1.add(jtxtChefCorn);
		
		jtxtChefVR = new JTextField();
		jtxtChefVR.setText("0");
		jtxtChefVR.setColumns(10);
		jtxtChefVR.setBounds(334, 8, 37, 20);
		jpanel1.add(jtxtChefVR);
		
		jtxtChefCR = new JTextField();
		jtxtChefCR.setText("0");
		jtxtChefCR.setColumns(10);
		jtxtChefCR.setBounds(347, 49, 39, 20);
		jpanel1.add(jtxtChefCR);
		
		jtxtChefVB = new JTextField();
		jtxtChefVB.setText("0");
		jtxtChefVB.setColumns(10);
		jtxtChefVB.setBounds(336, 97, 37, 20);
		jpanel1.add(jtxtChefVB);
		
		jtxtChefCB = new JTextField();
		jtxtChefCB.setText("0");
		jtxtChefCB.setColumns(10);
		jtxtChefCB.setBounds(353, 149, 35, 20);
		jpanel1.add(jtxtChefCB);
		
		jtxtChefRT = new JTextField();
		jtxtChefRT.setText("0");
		jtxtChefRT.setColumns(10);
		jtxtChefRT.setBounds(303, 197, 35, 20);
		jpanel1.add(jtxtChefRT);
		
		jtxtChefRG = new JTextField();
		jtxtChefRG.setText("0");
		jtxtChefRG.setColumns(10);
		jtxtChefRG.setBounds(502, 194, 35, 20);
		jpanel1.add(jtxtChefRG);
		
		jtxtChefLassi = new JTextField();
		jtxtChefLassi.setText("0");
		jtxtChefLassi.setColumns(10);
		jtxtChefLassi.setBounds(552, 146, 35, 20);
		jpanel1.add(jtxtChefLassi);
		
		jtxtChefSC = new JTextField();
		jtxtChefSC.setText("0");
		jtxtChefSC.setColumns(10);
		jtxtChefSC.setBounds(535, 94, 37, 20);
		jpanel1.add(jtxtChefSC);
		
		jtxtChefIC = new JTextField();
		jtxtChefIC.setText("0");
		jtxtChefIC.setColumns(10);
		jtxtChefIC.setBounds(546, 46, 39, 20);
		jpanel1.add(jtxtChefIC);
		
		jtxtChefShakes = new JTextField();
		jtxtChefShakes.setText("0");
		jtxtChefShakes.setColumns(10);
		jtxtChefShakes.setBounds(533, 5, 37, 20);
		jpanel1.add(jtxtChefShakes);
		
		jtxtChefDrink = new JTextField();
		jtxtChefDrink.setText("0");
		jtxtChefDrink.setColumns(10);
		jtxtChefDrink.setBounds(502, 236, 35, 20);
		jpanel1.add(jtxtChefDrink);
		
		JLabel lblExecutiveChef = new JLabel("Executive Chef");
		lblExecutiveChef.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblExecutiveChef.setBounds(20, 316, 322, 24);
		frame.getContentPane().add(lblExecutiveChef);
		
		JButton btnNewButton = new JButton("Total (Incl. Taxes)");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ChickenWings = Double.parseDouble(jtxtChickenWings.getText());
				double iChickenWings = 120;
				double Wings;
				
				Wings = (ChickenWings * iChickenWings);
				String cwings = String.format("%.2f", Wings);
				jtxtTotal.setText(cwings);
				
				double ChickenKebabs = Double.parseDouble(jtxtChickenKebabs.getText());
				double iChickenKebabs = 180;
				double Kebabs;
				
				Kebabs = (ChickenKebabs * iChickenKebabs);
				String ckebab = String.format("%.2f", Kebabs + Wings);
				jtxtTotal.setText(ckebab);
				
				double Pasta = Double.parseDouble(jtxtPasta.getText());
				double iPasta = 140;
				double Pas;
				
				Pas = (Pasta * iPasta);
				String cpas = String.format("%.2f", Pas + Kebabs + Wings);
				jtxtTotal.setText(cpas);
				
				double FrenchFries = Double.parseDouble(jtxtFries.getText());
				double iFrenchFries = 80;
				double Fries;
				
				Fries = (FrenchFries * iFrenchFries);
				String cfries = String.format("%.2f", Fries + Pas + Kebabs + Wings );
				jtxtTotal.setText(cfries);
				
				double CrispyCorn = Double.parseDouble(jtxtCrispyCorn.getText());
				double iCrispyCorn = 150;
				double Corn;
				
				Corn = (CrispyCorn * iCrispyCorn);
				String ccorn = String.format("%.2f", Corn + Fries + Pas + Kebabs + Wings);
				jtxtTotal.setText(ccorn);
				
				double VegRice = Double.parseDouble(jtxtVegRice.getText());
				double iVegRice = 110;
				double VegFRice;
				
				VegFRice = (VegRice * iVegRice);
				String cvegrice = String.format("%.2f", VegFRice + Corn + Fries + Pas + Kebabs + Wings);
				jtxtTotal.setText(cvegrice);
				
				double ChickenRice = Double.parseDouble(jtxtChickenRice.getText());
				double iChickenRice = 140;
				double ChickFRice;
				
				ChickFRice = (ChickenRice * iChickenRice);
				String cchicrice = String.format("%.2f", ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings);
				jtxtTotal.setText(cchicrice);
				
				double VegBiryani = Double.parseDouble(jtxtVegBiryani.getText());
				double iVegBiryani = 180;
				double VBiryani;
				
				VBiryani = (VegBiryani * iVegBiryani);
				String vbiryani = String.format("%.2f", VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings);
				jtxtTotal.setText(vbiryani);
				
				double ChicBiryani = Double.parseDouble(jtxtChicBiryani.getText());
				double iChicBiryani = 220;
				double CBiryani;
				
				CBiryani = (ChicBiryani * iChicBiryani);
				String cbiryani = String.format("%.2f", CBiryani + VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings);
				jtxtTotal.setText(cbiryani);
				double Rotis = Double.parseDouble(jtxtRotis.getText());
				double iRotis = 6;
				double VRotis;
				
				VRotis = (Rotis * iRotis);
				String vrotis = String.format("%.2f", VRotis + CBiryani + VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings);
				jtxtTotal.setText(vrotis);
				
				double Shakes = Double.parseDouble(jtxtShakes.getText());
				double iShakes = 85;
				double VShakes;
				
				VShakes = (Shakes * iShakes);
				String vshakes = String.format("%.2f", VShakes + VRotis + CBiryani + VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings);
				jtxtTotal.setText(vshakes);
				
				double Ice = Double.parseDouble(jtxtIce.getText());
				double iIce = 135;
				double Vice;
				
				Vice = (Ice * iIce);
				String vice = String.format("%.2f", Vice + VShakes + VRotis + CBiryani + VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings);
				jtxtTotal.setText(vice);
				
				double Stone = Double.parseDouble(jtxtStone.getText());
				double iStone = 360;
				double VStone;
				
				VStone = (Stone * iStone);
				String vstone = String.format("%.2f", VStone + Vice + VShakes + VRotis + CBiryani + VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings);
				jtxtTotal.setText(vstone);
				
				double Lassi = Double.parseDouble(jtxtLassi.getText());
				double iLassi = 60;
				double VLassi;
				
				VLassi = (Lassi * iLassi);
				String vlassi = String.format("%.2f", VLassi + VStone + Vice + VShakes + VRotis + CBiryani + VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings);
				jtxtTotal.setText(vlassi);
				
				double Rasgulla = Double.parseDouble(jtxtRasgulla.getText());
				double iRasgulla = 110;
				double VRasgulla;
				
				VRasgulla = (Rasgulla * iRasgulla);
				String vras = String.format("%.2f", VRasgulla + VLassi + VStone + Vice + VShakes + VRotis + CBiryani + VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings + 18);
				jtxtTotal.setText(vras);
				
				double Drinks = Double.parseDouble(jtxtDrink.getText());
				double Mocktails = 140 * Drinks;
				double Cocktails = 180 * Drinks;
				double Coke = 50 * Drinks;
				double ThumpsUp = 50 * Drinks;
				double Fanta = 40 * Drinks;
				
				if (jcmbDrink.getSelectedItem().equals("Mocktails"))
				{
					 
					String cMock = String.format("%.2f", VRasgulla + VLassi + VStone + Vice + VShakes + VRotis + CBiryani + VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings + Mocktails + 18);
					jtxtTotal.setText(cMock);
				}
				
				if (jcmbDrink.getSelectedItem().equals("Cocktails"))
				{
					String cCocktail = String.format("%.2f", VRasgulla + VLassi + VStone + Vice + VShakes + VRotis + CBiryani + VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings + Cocktails + 18);
					jtxtTotal.setText(cCocktail);
				}
				
				if (jcmbDrink.getSelectedItem().equals("Coke"))
				{
					String cCoke = String.format("%.2f", VRasgulla + VLassi + VStone + Vice + VShakes + VRotis + CBiryani + VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings + Coke + 18);
					jtxtTotal.setText(cCoke);
				}
				
				if (jcmbDrink.getSelectedItem().equals("ThumpsUp"))
				{
					String cThum = String.format("%.2f", VRasgulla + VLassi + VStone + Vice + VShakes + VRotis + CBiryani + VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings + ThumpsUp + 18);
					jtxtTotal.setText(cThum);
			    }
				
				if (jcmbDrink.getSelectedItem().equals("Fanta"))
				{
					String cFanta = String.format("%.2f", VRasgulla + VLassi + VStone + Vice + VShakes + VRotis + CBiryani + VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings + Fanta + 18);
					jtxtTotal.setText(cFanta);
				}
				
				if (jcmbDrink.getSelectedItem().equals("--Select a drink--"))
				{
					String cSel = String.format("%.2f", VRasgulla + VLassi + VStone + Vice + VShakes + VRotis + CBiryani + VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings + 18);
					jtxtTotal.setText(cSel);
				}
		
				double ChicWings = Double.parseDouble(jtxtChickenWings.getText());
				double iChicWings = 1;
				double Wing;
				
				Wing = (ChicWings * iChicWings);
				String cwing = String.format("%.2f", Wing);
				jtxtChefCW.setText(cwing);
				
				double ChicKebabs = Double.parseDouble(jtxtChickenKebabs.getText());
				double iChicKebabs = 1;
				double Kebab;
				
				Kebab = (ChicKebabs * iChicKebabs);
				String ckeba = String.format("%.2f", Kebab);
				jtxtChefCK.setText(ckeba);
				
				double Past = Double.parseDouble(jtxtPasta.getText());
				double iPast = 1;
				double Pa;
				
				Pa = (Past * iPast);
				String cpa = String.format("%.2f", Pa);
				jtxtChefPas.setText(cpa);
				
				double FrenchFrie = Double.parseDouble(jtxtFries.getText());
				double iFrenchFrie = 1;
				double Frie;
				
				Frie = (FrenchFrie * iFrenchFrie);
				String cfrie = String.format("%.2f", Frie);
				jtxtChefFF.setText(cfrie);
				
				double CrispyCor = Double.parseDouble(jtxtCrispyCorn.getText());
				double iCrispyCor = 1;
				double Cor;
				
				Cor = (CrispyCor * iCrispyCor);
				String ccor = String.format("%.2f", Cor);
				jtxtChefCorn.setText(ccor);
				
				double VegRic = Double.parseDouble(jtxtVegRice.getText());
				double iVegRic = 1;
				double VegFRic;
				
				VegFRic = (VegRic * iVegRic);
				String cvegric = String.format("%.2f", VegFRic);
				jtxtChefVR.setText(cvegric);
				
				double ChickenRic = Double.parseDouble(jtxtChickenRice.getText());
				double iChickenRic = 1;
				double ChickFRic;
				
				ChickFRic = (ChickenRic * iChickenRic);
				String cchicric = String.format("%.2f", ChickFRic);
				jtxtChefCR.setText(cchicric);
				
				double VegBiryan = Double.parseDouble(jtxtVegBiryani.getText());
				double iVegBiryan = 1;
				double VBiryan;
				
				VBiryan = (VegBiryan * iVegBiryan);
				String vbiryan = String.format("%.2f", VBiryan);
				jtxtChefVB.setText(vbiryan);
				
				double ChicBiryan = Double.parseDouble(jtxtChicBiryani.getText());
				double iChicBiryan = 1;
				double CBiryan;
				
				CBiryan = (ChicBiryan * iChicBiryan);
				String cbiryan = String.format("%.2f", CBiryan);
				jtxtChefCB.setText(cbiryan);
				
				double Roti = Double.parseDouble(jtxtRotis.getText());
				double iRoti = 1;
				double VRoti;
				
				VRoti = (Roti * iRoti);
				String vroti = String.format("%.2f", VRoti);
				jtxtChefRT.setText(vroti);
				
				double Shake = Double.parseDouble(jtxtShakes.getText());
				double iShake = 1;
				double VShake;
				
				VShake = (Shake * iShake);
				String vshake = String.format("%.2f", VShake);
				jtxtChefShakes.setText(vshake);
				
				double Ic = Double.parseDouble(jtxtIce.getText());
				double iIc = 1;
				double Vic;
				
				Vic = (Ic * iIc);
				String vic = String.format("%.2f", Vic);
				jtxtChefIC.setText(vic);
				
				double Ston = Double.parseDouble(jtxtStone.getText());
				double iSton = 1;
				double VSton;
				
				VSton = (Ston * iSton);
				String vston = String.format("%.2f", VSton);
				jtxtChefSC.setText(vston);
				
				double Lass = Double.parseDouble(jtxtLassi.getText());
				double iLass = 1;
				double VLass;
				
				VLass = (Lass * iLass);
				String vlass = String.format("%.2f", VLass);
				jtxtChefLassi.setText(vlass);
				
				double Rasgull = Double.parseDouble(jtxtRasgulla.getText());
				double iRasgull = 1;
				double VRasgull;
				
				VRasgull = (Rasgull * iRasgull);
				String vra = String.format("%.2f", VRasgull);
				jtxtChefRG.setText(vra);
				
				double Drink = Double.parseDouble(jtxtDrink.getText());
				double Mocktail = 1 * Drinks;
				double Cocktail = 1 * Drinks;
				double Cok = 1 * Drinks;
				double ThumpsU = 1 * Drinks;
				double Fant = 1 * Drinks;
				
				if (jcmbDrink.getSelectedItem().equals("Mocktails"))
				{
					 
					String cMoc = String.format("%.2f", Mocktail);
					jtxtChefDrink.setText(cMoc);
				}
				
				if (jcmbDrink.getSelectedItem().equals("Cocktails"))
				{
					String cCocktai = String.format("%.2f",Cocktail);
					jtxtChefDrink.setText(cCocktai);
				}
				
				if (jcmbDrink.getSelectedItem().equals("Coke"))
				{
					String cCok = String.format("%.2f",Cok);
					jtxtChefDrink.setText(cCok);
				}
				
				if (jcmbDrink.getSelectedItem().equals("ThumpsUp"))
				{
					String cThum = String.format("%.2f",ThumpsU);
					jtxtChefDrink.setText(cThum);
			    }
				
				if (jcmbDrink.getSelectedItem().equals("Fanta"))
				{
					String cFant = String.format("%.2f", Fant);
					jtxtChefDrink.setText(cFant);
				}
				
				if (jcmbDrink.getSelectedItem().equals("--Select a drink--"))
				{
					String cSele = String.format("%.2f", VRasgulla + VLassi + VStone + Vice + VShakes + VRotis + CBiryani + VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings + 18);
					jtxtChefDrink.setText("0");
				}
		
			
			
			
			}
		
		}
		);
		btnNewButton.setBounds(667, 368, 163, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				jtxtTotal.setText("0");
				jtxtChickenWings.setText("0");
				jtxtChickenKebabs.setText("0");
				jtxtPasta.setText("0");
				jtxtFries.setText("0");
				jtxtCrispyCorn.setText("0");
				jtxtVegRice.setText("0");
				jtxtChickenRice.setText("0");
				jtxtVegBiryani.setText("0");
				jtxtChicBiryani.setText("0");
				jtxtRotis.setText("0");
				jtxtShakes.setText("0");
				jtxtIce.setText("0");
				jtxtStone.setText("0");
				jtxtLassi.setText("0");
				jtxtRasgulla.setText("0");
				jtxtDrink.setText("0");
				jtxtRecCWings.setText("0");
				jtxtRecCKebabs.setText("0");
				jtxtRecPasta.setText("0");
				jtxtRecFries.setText("0");
				jtxtRecCorn.setText("0");
				jtxtRecVRice.setText("0");
				jtxtRecCRice.setText("0");
				jtxtRecVBir.setText("0");
				jtxtRecCBir.setText("0");
				jtxtRecRotis.setText("0");
				jtxtRecShakes.setText("0");
				jtxtRecCream.setText("0");
				jtxtRecStone.setText("0");
				jtxtRecLassi.setText("0");
				jtxtRecRasg.setText("0");
				jtxtRecDrink.setText("0");
				jtxtChefCW.setText("0");
				jtxtChefCK.setText("0");
				jtxtChefPas.setText("0");
				jtxtChefCorn.setText("0");
				jtxtChefFF.setText("0");
				jtxtChefVR.setText("0");
				jtxtChefCR.setText("0");
				jtxtChefVB.setText("0");
				jtxtChefCB.setText("0");
				jtxtChefRT.setText("0");
				jtxtChefShakes.setText("0");
				jtxtChefIC.setText("0");
				jtxtChefSC.setText("0");
				jtxtChefLassi.setText("0");
				jtxtChefRG.setText("0");
				jtxtRecTots.setText("0");
				jtxtChefDrink.setText("0");
				jcmbDrink.setSelectedItem("--Select a drink--");
				
				}
		});
		btnReset.setBounds(699, 439, 91, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(699, 489, 91, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Print");
		btnNewButton_2.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				
				double ChickenWings = Double.parseDouble(jtxtChickenWings.getText());
				double iChickenWings = 120;
				double Wings;
				
				Wings = (ChickenWings * iChickenWings);
				String cwings = String.format("%.2f", Wings);
				jtxtRecCWings.setText(cwings);
				
				double ChickenKebabs = Double.parseDouble(jtxtChickenKebabs.getText());
				double iChickenKebabs = 180;
				double Kebabs;
				
				Kebabs = (ChickenKebabs * iChickenKebabs);
				String ckebab = String.format("%.2f", Kebabs);
				jtxtRecCKebabs.setText(ckebab);
				
				double Pasta = Double.parseDouble(jtxtPasta.getText());
				double iPasta = 140;
				double Pas;
				
				Pas = (Pasta * iPasta);
				String cpas = String.format("%.2f", Pas);
				jtxtRecPasta.setText(cpas);
				
				double FrenchFries = Double.parseDouble(jtxtFries.getText());
				double iFrenchFries = 80;
				double Fries;
				
				Fries = (FrenchFries * iFrenchFries);
				String cfries = String.format("%.2f", Fries);
				jtxtRecFries.setText(cfries);
				
				double CrispyCorn = Double.parseDouble(jtxtCrispyCorn.getText());
				double iCrispyCorn = 150;
				double Corn;
				
				Corn = (CrispyCorn * iCrispyCorn);
				String ccorn = String.format("%.2f", Corn);
				jtxtRecCorn.setText(ccorn);
				
				double VegRice = Double.parseDouble(jtxtVegRice.getText());
				double iVegRice = 110;
				double VegFRice;
				
				VegFRice = (VegRice * iVegRice);
				String cvegrice = String.format("%.2f", VegFRice);
				jtxtRecVRice.setText(cvegrice);
				
				double ChickenRice = Double.parseDouble(jtxtChickenRice.getText());
				double iChickenRice = 140;
				double ChickFRice;
				
				ChickFRice = (ChickenRice * iChickenRice);
				String cchicrice = String.format("%.2f", ChickFRice);
				jtxtRecCRice.setText(cchicrice);
				
				double VegBiryani = Double.parseDouble(jtxtVegBiryani.getText());
				double iVegBiryani = 180;
				double VBiryani;
				
				VBiryani = (VegBiryani * iVegBiryani);
				String vbiryani = String.format("%.2f", VBiryani);
				jtxtRecVBir.setText(vbiryani);
				
				double ChicBiryani = Double.parseDouble(jtxtChicBiryani.getText());
				double iChicBiryani = 220;
				double CBiryani;
				
				CBiryani = (ChicBiryani * iChicBiryani);
				String cbiryani = String.format("%.2f", CBiryani);
				jtxtRecCBir.setText(cbiryani);
				
				double Rotis = Double.parseDouble(jtxtRotis.getText());
				double iRotis = 6;
				double VRotis;
				
				VRotis = (Rotis * iRotis);
				String vrotis = String.format("%.2f", VRotis);
				jtxtRecRotis.setText(vrotis);
				
				double Shakes = Double.parseDouble(jtxtShakes.getText());
				double iShakes = 85;
				double VShakes;
				
				VShakes = (Shakes * iShakes);
				String vshakes = String.format("%.2f", VShakes);
				jtxtRecShakes.setText(vshakes);
				
				double Ice = Double.parseDouble(jtxtIce.getText());
				double iIce = 135;
				double Vice;
				
				Vice = (Ice * iIce);
				String vice = String.format("%.2f", Vice);
				jtxtRecCream.setText(vice);
				
				double Stone = Double.parseDouble(jtxtStone.getText());
				double iStone = 360;
				double VStone;
				
				VStone = (Stone * iStone);
				String vstone = String.format("%.2f", VStone);
				jtxtRecStone.setText(vstone);
				
				double Lassi = Double.parseDouble(jtxtLassi.getText());
				double iLassi = 60;
				double VLassi;
				
				VLassi = (Lassi * iLassi);
				String vlassi = String.format("%.2f", VLassi);
				jtxtRecLassi.setText(vlassi);
				
				double Rasgulla = Double.parseDouble(jtxtRasgulla.getText());
				double iRasgulla = 110;
				double VRasgulla;
				
				VRasgulla = (Rasgulla * iRasgulla);
				String vras = String.format("%.2f", VRasgulla);
				jtxtRecRasg.setText(vras);
				
				double Drinks = Double.parseDouble(jtxtDrink.getText());
				double Mocktails = 140 * Drinks;
				double Cocktails = 180 * Drinks;
				double Coke = 50 * Drinks;
				double ThumpsUp = 50 * Drinks;
				double Fanta = 40 * Drinks;
				
				if (jcmbDrink.getSelectedItem().equals("Mocktails"))
				{
					 
					String cMock = String.format("%.2f",Mocktails);
					jtxtRecDrink.setText(cMock);
				}
				
				if (jcmbDrink.getSelectedItem().equals("Cocktails"))
				{
					String cCocktail = String.format("%.2f", Cocktails);
					jtxtRecDrink.setText(cCocktail);
				}
				
				if (jcmbDrink.getSelectedItem().equals("Coke"))
				{
					String cCoke = String.format("%.2f",Coke);
					jtxtRecDrink.setText(cCoke);
				}
				
				if (jcmbDrink.getSelectedItem().equals("ThumpsUp"))
				{
					String cThum = String.format("%.2f",ThumpsUp);
					jtxtRecDrink.setText(cThum);
			    }
				
				if (jcmbDrink.getSelectedItem().equals("Fanta"))
				{
					String cFanta = String.format("%.2f", Fanta);
					jtxtRecDrink.setText(cFanta);
				}
				
				if (jcmbDrink.getSelectedItem().equals("--Select a drink--"))
				{
					String cSel = String.format("%.2f", VRasgulla + VLassi + VStone + Vice + VShakes + VRotis + CBiryani + VBiryani + ChickFRice + VegFRice + Corn + Fries + Pas + Kebabs + Wings + 18);
					jtxtTotal.setText("0");
				}
				
				double Tot = Double.parseDouble(jtxtTotal.getText());
				double iTot = 1;
				double Tots;
				
				Tots = (Tot * iTot);
				String ctot = String.format("%.2f", Tots);
				jtxtRecTots.setText(ctot);
				
				
				
				
			}
				
				
			});
		btnNewButton_2.setBounds(699, 539, 91, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(903, 30, 447, 597);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 427, 575);
		panel_2.add(tabbedPane);
		
		JPanel jpanelReceipt = new JPanel();
		jpanelReceipt.setBackground(Color.WHITE);
		tabbedPane.addTab("Receipt", null, jpanelReceipt, null);
		jpanelReceipt.setLayout(null);
		
		JLabel lblChickenWings_1 = new JLabel("Chicken Wings");
		lblChickenWings_1.setBounds(10, 48, 113, 14);
		jpanelReceipt.add(lblChickenWings_1);
		
		JLabel lblChickenKebabs = new JLabel("Chicken Kebabs");
		lblChickenKebabs.setBounds(10, 73, 113, 14);
		jpanelReceipt.add(lblChickenKebabs);
		
		JLabel lblPasta = new JLabel("Pasta");
		lblPasta.setBounds(10, 98, 46, 14);
		jpanelReceipt.add(lblPasta);
		
		JLabel lblFrenchFries = new JLabel("French Fries");
		lblFrenchFries.setBounds(10, 122, 113, 14);
		jpanelReceipt.add(lblFrenchFries);
		
		JLabel lblCorn = new JLabel("Corn");
		lblCorn.setBounds(10, 147, 46, 14);
		jpanelReceipt.add(lblCorn);
		
		JLabel lblVegRice = new JLabel("Veg Rice");
		lblVegRice.setBounds(10, 174, 113, 14);
		jpanelReceipt.add(lblVegRice);
		
		JLabel lblChickenRice = new JLabel("Chicken Rice");
		lblChickenRice.setBounds(10, 199, 88, 14);
		jpanelReceipt.add(lblChickenRice);
		
		JLabel lblVegBiryani_1 = new JLabel("Veg Biryani");
		lblVegBiryani_1.setBounds(10, 223, 88, 14);
		jpanelReceipt.add(lblVegBiryani_1);
		
		JLabel lblChickenBiryani_1 = new JLabel("Chicken Biryani");
		lblChickenBiryani_1.setBounds(10, 248, 126, 14);
		jpanelReceipt.add(lblChickenBiryani_1);
		
		JLabel lblRotis_1 = new JLabel("Rotis");
		lblRotis_1.setBounds(10, 273, 46, 14);
		jpanelReceipt.add(lblRotis_1);
		
		JLabel lblShakes = new JLabel("Shakes ");
		lblShakes.setBounds(10, 300, 46, 14);
		jpanelReceipt.add(lblShakes);
		
		JLabel lblIceCream = new JLabel("Ice cream");
		lblIceCream.setBounds(10, 325, 101, 14);
		jpanelReceipt.add(lblIceCream);
		
		JLabel lblStoneConcepts = new JLabel("Stone Concepts");
		lblStoneConcepts.setBounds(10, 350, 113, 14);
		jpanelReceipt.add(lblStoneConcepts);
		
		JLabel lblLassi = new JLabel("Lassi");
		lblLassi.setBounds(10, 375, 60, 14);
		jpanelReceipt.add(lblLassi);
		
		JLabel lblRasgulla = new JLabel("Rasgulla");
		lblRasgulla.setBounds(10, 400, 73, 14);
		jpanelReceipt.add(lblRasgulla);
		
		jtxtRecCWings = new JTextField();
		jtxtRecCWings.setBounds(301, 45, 86, 20);
		jpanelReceipt.add(jtxtRecCWings);
		jtxtRecCWings.setColumns(10);
		
		jtxtRecCKebabs = new JTextField();
		jtxtRecCKebabs.setColumns(10);
		jtxtRecCKebabs.setBounds(301, 70, 86, 20);
		jpanelReceipt.add(jtxtRecCKebabs);
		
		jtxtRecPasta = new JTextField();
		jtxtRecPasta.setColumns(10);
		jtxtRecPasta.setBounds(301, 95, 86, 20);
		jpanelReceipt.add(jtxtRecPasta);
		
		jtxtRecFries = new JTextField();
		jtxtRecFries.setColumns(10);
		jtxtRecFries.setBounds(301, 119, 86, 20);
		jpanelReceipt.add(jtxtRecFries);
		
		jtxtRecCorn = new JTextField();
		jtxtRecCorn.setColumns(10);
		jtxtRecCorn.setBounds(301, 144, 86, 20);
		jpanelReceipt.add(jtxtRecCorn);
		
		jtxtRecVRice = new JTextField();
		jtxtRecVRice.setColumns(10);
		jtxtRecVRice.setBounds(301, 171, 86, 20);
		jpanelReceipt.add(jtxtRecVRice);
		
		jtxtRecCRice = new JTextField();
		jtxtRecCRice.setColumns(10);
		jtxtRecCRice.setBounds(301, 196, 86, 20);
		jpanelReceipt.add(jtxtRecCRice);
		
		jtxtRecVBir = new JTextField();
		jtxtRecVBir.setColumns(10);
		jtxtRecVBir.setBounds(301, 220, 86, 20);
		jpanelReceipt.add(jtxtRecVBir);
		
		jtxtRecCBir = new JTextField();
		jtxtRecCBir.setColumns(10);
		jtxtRecCBir.setBounds(301, 245, 86, 20);
		jpanelReceipt.add(jtxtRecCBir);
		
		jtxtRecRotis = new JTextField();
		jtxtRecRotis.setColumns(10);
		jtxtRecRotis.setBounds(301, 270, 86, 20);
		jpanelReceipt.add(jtxtRecRotis);
		
		jtxtRecShakes = new JTextField();
		jtxtRecShakes.setColumns(10);
		jtxtRecShakes.setBounds(301, 297, 86, 20);
		jpanelReceipt.add(jtxtRecShakes);
		
		jtxtRecCream = new JTextField();
		jtxtRecCream.setColumns(10);
		jtxtRecCream.setBounds(301, 322, 86, 20);
		jpanelReceipt.add(jtxtRecCream);
		
		jtxtRecStone = new JTextField();
		jtxtRecStone.setColumns(10);
		jtxtRecStone.setBounds(301, 347, 86, 20);
		jpanelReceipt.add(jtxtRecStone);
		
		jtxtRecLassi = new JTextField();
		jtxtRecLassi.setColumns(10);
		jtxtRecLassi.setBounds(301, 372, 86, 20);
		jpanelReceipt.add(jtxtRecLassi);
		
		jtxtRecRasg = new JTextField();
		jtxtRecRasg.setColumns(10);
		jtxtRecRasg.setBounds(301, 397, 86, 20);
		jpanelReceipt.add(jtxtRecRasg);
		
		JLabel lblCustomerCopy = new JLabel("CUSTOMER COPY");
		lblCustomerCopy.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCustomerCopy.setBounds(142, 11, 138, 14);
		jpanelReceipt.add(lblCustomerCopy);
		
		JLabel lblQty_2 = new JLabel("Price");
		lblQty_2.setBounds(329, 22, 46, 14);
		jpanelReceipt.add(lblQty_2);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setBounds(10, 425, 46, 14);
		jpanelReceipt.add(lblDrink);
		
		jtxtRecDrink = new JTextField();
		jtxtRecDrink.setColumns(10);
		jtxtRecDrink.setBounds(301, 428, 86, 20);
		jpanelReceipt.add(jtxtRecDrink);
		
		JLabel lblPleaseVisitAgain = new JLabel("Please Visit Again!");
		lblPleaseVisitAgain.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPleaseVisitAgain.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseVisitAgain.setBounds(142, 525, 138, 14);
		jpanelReceipt.add(lblPleaseVisitAgain);
		
		JLabel lblTotalIncl = new JLabel("TOTAL ( Incl. Tax)");
		lblTotalIncl.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTotalIncl.setBounds(10, 459, 179, 14);
		jpanelReceipt.add(lblTotalIncl);
		
		jtxtRecTots = new JTextField();
		jtxtRecTots.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jtxtRecTots.setBounds(249, 459, 138, 20);
		jpanelReceipt.add(jtxtRecTots);
		jtxtRecTots.setColumns(10);
		
		JLabel lblReceipt = new JLabel("Receipt: ");
		lblReceipt.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblReceipt.setBounds(903, 7, 113, 14);
		frame.getContentPane().add(lblReceipt);
		
		jtxtTotal = new JTextField();
		jtxtTotal.setBounds(659, 402, 183, 20);
		frame.getContentPane().add(jtxtTotal);
		jtxtTotal.setColumns(10);
		
		JButton btnFeedback = new JButton("Feedback");
		btnFeedback.setBounds(699, 590, 91, 23);
		frame.getContentPane().add(btnFeedback);
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
