package piggybank;

public class Dime extends Money
{
	public Dime(String name, int amount)
	{
		super(name, amount)
	}

	@Override
	public int getAmount()
	{
		return 0.10
	}
}