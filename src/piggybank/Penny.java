package piggybank;

public class Penny extends Money
{
	String name = "Penny";
	public Penny(double amount)
	{
		super(amount);
	}

	@Override
	public double getAmount()
	{
		return 0.01 * amount;
	}

	@Override
	public String getAmountString()
	{
		int i = (int) amount;
		if (this.getAmount() < 1.00)
		{
			if (this.amount > 1)
			{
				return Integer.toString(i) + " " + "Pennies";
			}
			return Integer.toString(i) + " " + name;
		}
		return "$" + Integer.toString(i);
	}
}