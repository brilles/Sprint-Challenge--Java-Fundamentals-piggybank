package piggybank;

public abstract class Money
{
	String name;
	int amount;

	public Money(String name, int amount)
	{
		this.name = name
		this.amount = amount
	}

	public String getName()
	{
		return name
	}

	public int getAmount()
	{
		return amount
	}
}