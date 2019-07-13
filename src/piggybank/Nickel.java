package piggybank;

public class Nickel extends Money
{
	String name = "Nickel";
	public Nickel(double amount)
	{
		super(amount);
	}

	@Override
	public double getAmount()
	{
		return 0.05 * amount;
	}

	@Override
	public String getAmountString()
	{
		int i = (int) amount;
		if (this.getAmount() < 1.00)
		{
			if (this.amount > 1)
			{
				return Integer.toString(i) + " " + name + "s";
			}
			return Integer.toString(i) + " " + name;
		}
		return "$" + Integer.toString(i);
	}
}