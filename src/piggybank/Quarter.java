package piggybank;

public class Quarter extends Money
{
	public Quarter(String name, int amount)
	{
		super(name, amount)
	}

	@Override
	public int getAmount()
	{
		return 0.25
	}
}