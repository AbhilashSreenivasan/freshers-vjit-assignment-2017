## AIM : Creation of a Restaurant Management System Application using JAVA consisting of various functions
	to manage the functioning and working of a restaurant or a chain of restaurants.


What does RMS do?

	RMS application eases the ways of managing the functions of the restaurant from the
allotment of table to the customers to dine at the restaurant to the management of the function
of home delivery with automatic receipt being printed.


Technology Used : 

	1. Eclipse Java application - Giving the structured format of the application for 
					different modules and the respective functions
					within each module.
	
	2. Maven Compiler - Used for compilation and producing the JAR File of the entire project.

How does it work?

   
1. The First Application window contains two functional buttons named : Dine in and Home delivery.

2. Upon selection the dine in option, the control is given to the next applciation window
	consisting of two other functional butttons named: La Carte and BUffet. Selection
	of the respective buttons by the user would display their respective menus.

3. The selection of La Carte and the Buffet options displays respective application windows
	for Table Allotment. Selection of the respective table to the customers displays the
	next application window of the La carte dining menu and the buffet menu respectively.

4. The La Carte Menu has been divided into 3 coloumns named :Starters, Main Course, Desserts.
	Each of them contain a list of 5 dishes with their respective prices being displayed.
	A quantity text field has been provided adjacent to every dish for the selection
	by the user.

5. A drop down box containing options of five drinks and a quantity box for the user is placed below
	the first 3 coloumns of dishes.

6. Upon selection of the dishes, on clicking the Total button, the total amount is displayed.
	Along with this, a list for the Executive chef is produced for the dishes with the
	respective quantity required. This can be used by the executive chef for preparing
	the dishes by the line chefs present.

7. Under the Total button, "Reset" button is used for turning all the textfields to 0 and 
	start afresh. The "Print" button reads the values of the customer's order and sets
	the receipt text fields with individual prices of the ordered dishes and the total
	is displayed for the user. The "Exit" function is used to exit the Restaurant
	Management Application.

8. Similar functional buttons have been executed for the Buffet option where the menu is
	divided into "Veg" and "Non veg" buffet systems with their respective dishes 
	displayed under each. Add-ons of drinks can be given by the customer to the choice
	of buffet. It contains the similar functions of Total, Reset, Print and Exit.

9. The Home delivery button consists of the same menu as displayed for the La Carte 
	application window but the change is that, the executive chef field is replaced
	with the Home Address field given by the customer.

10. The receipt option consists of the combined prices for starters, Main course and 
	Desserts along with the Delivery Address displayed for the verification by the
	delivery executive for the proper delivery to the customer.

Why is RMS helpful?

	Incase of huge restaurant with various employees and various choices of dining,
manual management of the entire process could be a big issue with various errors. The RMS
could be used for continuous monitoring and management of the entire restaurant or a group
of restaurants. As the application involves an object oriented approach, the amount of time
for reading the customer's order, printing the receipt adn so on are greatly reduced and increasing
the efficiency of the entire process with a simplified UI to the user.

 It automatically sends the required dishes as ordered by the customer to the
Executive Chef thereby, simplifying the process of giving huge orders. The Receipt is
automatically printed by the system which results in avoidance of the manual errors.

In the Home Delivery application window, the address given by the customer is automatically 
read and displayed in the receipt option. It could help the delivery executive to verify the
correct delivery address.

Modules : 

1. The first module is for selection of Dine in or Home Delivery.

2. The second module is for the selection of type of Dine in i.e, La Carte or Buffet.

3. The third module deals with the table allotment for the respective customers for dining.

4. The fourth module is the menu for the la carte option consisting of Starters, Main Course and Desserts
	alongwith the option of drink selection. It consists of different function buttons as Total, Reset, Print.

5. The fifth module deals with the menu for the buffet option consisting of Veg and Non Veg selection of Buffet.
	It consists of the similar function buttons as that of the la carte menu.

6. The sixth Module is the home delivery application window consisting of the menu with an
	delivery address coloumn for the customer to enter the address where the food needs to
	be delivered.
