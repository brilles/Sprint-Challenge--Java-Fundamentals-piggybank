package piggybank;

public class Penny extends Money
{
	public Penny(String name, int amount)
	{
		super(name, amount)
	}

	@Override
	public int getAmount()
	{
		return 0.01
	}
}