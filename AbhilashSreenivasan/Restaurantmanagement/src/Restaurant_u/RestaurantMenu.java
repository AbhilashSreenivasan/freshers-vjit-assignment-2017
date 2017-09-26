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
	private JTextField textField_16;
	private JTextField jtxtTotal;
	private JTextField jtxtDrink;
	private JTextField jtxtReceipt;

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
		
		textField_16 = new JTextField();
		textField_16.setBounds(10, 11, 597, 278);
		panel_1.add(textField_16);
		textField_16.setColumns(10);
		
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
				
				double Qty1 = Double.parseDouble(jtxtChickenWings.getText());
				double Qty2 = Double.parseDouble(jtxtChickenKebabs.getText());
				double Qty3 = Double.parseDouble(jtxtPasta.getText());
				double Qty4 = Double.parseDouble(jtxtFries.getText());
				double Qty5 = Double.parseDouble(jtxtCrispyCorn.getText());
				double Qty6 = Double.parseDouble(jtxtVegRice.getText());
				double Qty7 = Double.parseDouble(jtxtChickenRice.getText());
				double Qty8 = Double.parseDouble(jtxtVegBiryani.getText());
				double Qty9 = Double.parseDouble(jtxtChicBiryani.getText());
				double Qty10 = Double.parseDouble(jtxtRotis.getText());
				double Qty11 = Double.parseDouble(jtxtShakes.getText());
				double Qty12 = Double.parseDouble(jtxtIce.getText());
				double Qty13 = Double.parseDouble(jtxtStone.getText());
				double Qty14 = Double.parseDouble(jtxtLassi.getText());
				double Qty15 = Double.parseDouble(jtxtRasgulla.getText());
				double Qty16 = Double.parseDouble(jtxtDrink.getText());
				
			    jtxtReceipt.setText("Customer Copy" + "\n Chicken Wings Rs.140:\t\t"
				+ Qty1 + "\n Chicken Kebabs Rs.180:\t\t" + Qty2 + "\n Pasta Rs.60:\t\t" +
				Qty3 + "\n French Fries Rs.60:\t\t" + Qty4 + "\n Crispy Corn Rs.80:\t\t" + 		
				Qty5 + "\nVeg Fried Rice Rs.110:\t\t" + Qty6 + "\nChicken Fried Rice Rs.120:\t\t" + 
				Qty7 + "\nVeg Biryani Rs.120:\t\t" + Qty8 + "\nChicken Biryani Rs.180\t\t" + 
				Qty9 + "\nRotis Rs.6:\t\t" + Qty10 + "\nMilkShakes Rs.160:\t\t" + 
				Qty11 + "\nIce Cream Rs.150:\t\t" + Qty12 + "\nStone Concepts Rs.360:\t\t" + 
				Qty13 + "\nLassi Rs.60:\t\t" + Qty14 +"\nRasgulla Rs.120:\t\t" + Qty15 +
				"\nDrinks" + Qty16);
		
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
		
		jtxtReceipt = new JTextField();
		jtxtReceipt.setBounds(0, 0, 422, 550);
		jpanelReceipt.add(jtxtReceipt);
		jtxtReceipt.setColumns(10);
		
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
