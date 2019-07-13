package piggybank;

public abstract class Money 
{
	double amount = 1;
	String name;

	public Money(double amount)
	{
		this.amount = amount;
	}

	public double getAmount()
	{
		return 1 * amount;
	}

	public String getAmountString()
	{
		int i = (int) amount;
		if (this.getAmount() < 1.00)
		{

			if (this.amount > 1)
			{
				return Integer.toString(i) + " " + this.name + "s";
			}
			return Integer.toString(i) + " " + this.name;
		}
		return "$" + Integer.toString(i);
	}
}