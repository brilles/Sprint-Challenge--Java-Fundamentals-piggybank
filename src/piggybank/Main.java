package piggybank;

import java.util.*;
import java.text.DecimalFormat;

public class Main
{
	private static void workWithPiggyBank()
	{
		// Initalize format
		DecimalFormat fp = new DecimalFormat("$###,###.00");

		// Create collection
		ArrayList<Money> piggybank = new ArrayList<Money>();

		// add quarter 1
		piggybank.add(new Quarter(1));

		// add dime 1
		piggybank.add(new Dime(1));

		// add dollar 5
		piggybank.add(new Dollar(5));

		// add nickel 3
		piggybank.add(new Nickel(3));

		// add dime 7
		piggybank.add(new Dime(7));

		// add dollar 1
		piggybank.add(new Dollar(1));

		// add penny 10
		piggybank.add(new Penny(10));

		// add up the money in the piggybank
		double total = 0;
		for (Money value: piggybank)
		{	
			// print the contents of the piggybank
			System.out.println(value.getAmountString());
			total += value.getAmount();
		}

		// print the value of the piggybank
		System.out.println("The piggy bank holds " + fp.format(total));

		// Stretch: ability to remove coins from the piggybank
		double subtractValue = 1.50;
		total -= subtractValue;
		System.out.println("The piggy bank holds " + fp.format(total));
	}

	public static void main(String[] args)
	{
		workWithPiggyBank();
	}
}