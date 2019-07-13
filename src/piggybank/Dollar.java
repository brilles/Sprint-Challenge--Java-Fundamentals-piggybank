package piggybank;

public class Dollar extends Money
{
	public Dollar(String name, int amount)
	{
		super(name, amount)
	}

	@Override
	public int getAmount()
	{
		return 1.00
	}
}