package Movies;

abstract public class Product
	{
	private String id = "";
	private String title = "";
	private Person person = null;

	abstract long getInvestment();

	public String getID()
		{
		return id;
		}

	public String getTitle()
		{
		return title;
		}
	}
