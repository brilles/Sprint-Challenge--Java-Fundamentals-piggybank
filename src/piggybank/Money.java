package piggybank;

public abstract class Animal
{
	String name;
	int amount;

	public Animal(String name, int amount)
	{
		this.name = name
		this.amount = amount
	}

	public String getName()
	{
		return name
	}

	public String getAmount()
	{
		return amount
	}
}