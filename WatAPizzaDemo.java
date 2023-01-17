//package online;

import java.util.Scanner;

class Print
{
	static void printWelcome()
	{
		System.out.println("\n\tWelcome to Wat-a-Pizza!\n\n\tNow Order Your Pizzas Online!\n");
	}//printWelcome()

	static void printMainMenu()
	{
		System.out.println("\t*Main Menu*");
		System.out.println("\n\tS. No.\t\tItem Category");
		System.out.println("\t1\t\tPizza");
		System.out.println("\t2\t\tGarlic Bread");
		System.out.println("\t3\t\tBeverages\n");
	}//printMainMenu()

	static void prinPizzaMenu()
	{
		System.out.println("\n\t*Pizza Menu*");
		System.out.println("\n\tS. No.\t\tPizza\t\t\t\tRegular\t\tMedium\t\tLarge");
		System.out.println("\t1\t\tAfrican Peri Peri Veg\t\tNA\t\t350/-\t\t450/-");
		System.out.println("\t2\t\tBabecue Veg\t\t\tNA\t\t300/-\t\t400/-");
		System.out.println("\t3\t\tJamaican Jerk Veg\t\t250/-\t\t350/-\t\t450/-");
		System.out.println("\t4\t\tWhat-a-Pizza Exotic\t\t200/-\t\t300/-\t\t400/-");
		System.out.println("\t5\t\tEnglish Cheddar and Veggies\t175/-\t\t375/-\t\t500/-\n");
	}//printPizzaMenu()

	static void printCrustChoices()
	{
		System.out.println("\n\t*Crust Choices*");
		System.out.println("\n\tS. No.\t\tCrust\t\t\t\tPrice");
		System.out.println("\t1\t\tWheat Thin Crust\t\t60/-");
		System.out.println("\t2\t\tFresh Pan Base\t\t\t80/-");
		System.out.println("\t3\t\tHand Tossed\t\t\t70/-\n");
	}//printCrustChoices()

	static void printToppings()
	{
		System.out.println("\n\t*Toppings*");
		System.out.println("\n\tS. No.\t\tToppings\t\t\tPrice");
		System.out.println("\t1\t\tExtra Cheese\t\t\t80/-");
		System.out.println("\t2\t\tVeg Toppings\t\t\t120/-\n");
	}//printToppings()

	static void printGarlicBread()
	{
		System.out.println("\n\t*Garlic Bread*");
		System.out.println("\n\tS. No.\t\tBread\t\t\t\tPrice");
		System.out.println("\t1\t\tStuffed Garlic Bread\t\t90/-");
		System.out.println("\t2\t\tPlain Garlic Bread Sticks\t80/-\n");
	}//printGarlicBread()

	static void printBeverages()
	{
		System.out.println("\n\t*Beverages*");
		System.out.println("\n\tS. No.\t\tBeverage\t\t\tPrice");
		System.out.println("\t1\t\tPepsi\t\t\t\t60/-");
		System.out.println("\t2\t\tCoke\t\t\t\t60/-\n");
	}//printBeverages()

	static void printHomeDeliveryFees()
	{
		System.out.println("\tHome Deliver Fees : Rs 100/-\n");
	}//printHomeDeliveryFees()
}//Print

class WatAPizzaDemo
{
	static float order(float bill)
	{
		Print p = new Print();
		Scanner s = new Scanner(System.in);

		p.printMainMenu();
		System.out.println("What would you like to order today?\nEnter serial number : )");
		int a = s.nextInt();
		switch(a)
		{
			case 1: //Pizza
				System.out.println("You have selected pizza.");
				p.prinPizzaMenu();
				System.out.println("Which pizza would you like to have?\nEnter serial number : )");
				int d = s.nextInt();
				switch(d)
				{
					case 1: //Pizza - African Peri Peri Veg
						System.out.println("You have selected African Peri Peri Veg pizza.");
						System.out.println("Select the size.\nEnter 1 for Medium.\tEnter 2 for Large. : )");
						int e = s.nextInt();
						switch(e)
						{
							case 1: //Pizza - African Peri Peri Veg - Medium
								bill = (float)(bill + 350);
								break;
							case 2: //Pizza - African Peri Peri Veg - Large
								bill = (float)(bill + 450);
								break;
						}
						break;
					case 2: //Pizza - Barbecue Veg
						System.out.println("You have selected Barbecue Veg pizza.");
						System.out.println("Select the size.\nEnter 1 for Medium.\tEnter 2 for Large. : )");
						int f = s.nextInt();
						switch(f)
						{
							case 1: //Pizza - Barbecue Veg - Medium
								bill = (float)(bill + 300);
								break;
							case 2: //Pizza - Barbecue Veg - Large
								bill = (float)(bill + 400);
								break;
						}
						break;
					case 3: //Pizza - Jamaican Jerk Veg
						System.out.println("You have selected Jamaican Jerk Veg pizza.");
						System.out.println("Select the size.\nEnter 1 for Regular.\tEnter 2 for Medium.\tEnter 3 for Large. : )");
						int g = s.nextInt();
						switch(g)
						{
							case 1: //Pizza - Jamaican Jerk Veg - Regular
								bill =(float) (bill + 250);
								break;
							case 2: //Pizza - Jamaican Jerk Veg - Medium
								bill =(float)( bill + 350);
								break;
							case 3: //Pizza - Jamaican Jerk Veg - Large
								bill = (float)(bill + 450);
								break;
						}
						break;
					case 4: //Pizza - Wat-a-Pizza Exotic
						System.out.println("You have selected Wat-a-Pizza Exotic pizza.");
						System.out.println("Select the size.\nEnter 1 for Regular.\tEnter 2 for Medium.\tEnter 3 for Large. : )");
						int h = s.nextInt();
						switch(h)
						{
							case 1: //Pizza - Wat-a-Pizza Exotic - Regular
								bill = (float)(bill + 200);
								break;
							case 2: //Pizza - Wat-a-Pizza Exotic - Medium
								bill = (float)(bill + 300);
								break;
							case 3: //Pizza - Wat-a-Pizza Exotic - Large
								bill = (float)(bill + 400);
								break;
						}
						break;
					case 5: //Pizza - English Cheddar and Veggies
						System.out.println("You have selected English Cheddar and Veggies pizza.");
						System.out.println("Select the size.\nEnter 1 for Regular\tEnter 2 for Medium.\tEnter 3 for Large : )");
						int j = s.nextInt();
						switch(j)
						{
							case 1: //Pizza - English Cheddar and Veggies - Regular
								bill = (float)(bill + 175);
								break;
							case 2: //Pizza - English Cheddar and Veggies - Medium
								bill = (float)(bill + 375);
								break;
							case 3: //Pizza - English Cheddar and Veggies - Large
								bill = (float)(bill + 500);
								break;
						}
						break;
				}

				p.printCrustChoices();
				System.out.println("Which crust would you like to have?\nEnter serial number : )");
				int k = s.nextInt();
				switch(k)
				{
					case 1: //Pizza - Wheat Thin Crust
						bill = (float)(bill + 60);
						break;
					case 2: //Pizza - Fresh Pan Base
						bill = (float)(bill + 80);
						break;
					case 3: //Pizza - Hand Tossed
						bill = (float)(bill + 70);
						break;
				}

				p.printToppings();
				System.out.println("Which topping would you like to have?\nEnter serial number : )");
				int l = s.nextInt();
				switch(l)
				{
					case 1: //Pizza - Extra Cheese
						bill =(float) (bill + 80);
						break;
					case 2: //Pizza - Veg Toppings
						bill =(float)( bill + 120);
						break;
				}
				break;

			case 2: //Garlic Bread
				System.out.println("You have selected garlic bread.");
				p.printGarlicBread();
				System.out.println("Which garlic bread would you like to have?\nEnter serial number : )");
				int b = s.nextInt();
				switch(b)
				{
					case 1: //Garlic Bread - Stuffed Garlic Bread
						bill = (float) (bill + 90);
						break;
					case 2: //Garlic Bread - Plain Garlic Bread Sticks
						bill = (float) (bill + 80);
						break;
				}
				break;

			case 3: //Beverages
				System.out.println("You have selected beverages.");
				p.printBeverages();
				System.out.println("Which beverage would you like to have?\nEnter serial number : )");
				int c = s.nextInt();
				switch(c)
				{
					case 1: //Beverages - Pepsi
						bill = (float) (bill + 60);
						break;
					case 2: //Beverages - Coke
						bill = (float) (bill + 60);
						break;
				}
				break;
		}
		return bill;
	}//order()

	public static void main(String[] args)
	{
		Print p = new Print();
		Scanner s = new Scanner(System.in);

		float totalBill = 0;
		p.printWelcome();

		int x = 1;
		while(x == 1)
		{
			totalBill = order(totalBill);
			System.out.println("Would you like to order something else?\nEnter 1 for Yes.\tEnter 2 for NO.");
			x = s.nextInt();
		}

		System.out.println("Total bill without discount : "+totalBill);

		if(totalBill >= 500 && totalBill < 1000) {
			totalBill = (float) (totalBill * 0.95);
		}
		else if(totalBill >= 1000 && totalBill < 1500 ) {
			totalBill = (float) (totalBill * 0.90);
		}

		System.out.println("Total bill after discount : "+totalBill);
		System.out.println("Thanks for ordering!\nHAPPY MEAL!");
	}//main()
}//WatAPizza