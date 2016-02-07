package Movies;

public class Book extends Product
	{
	private Person author = null;

	public Person getAuthor()
		{
		return author;
		}

	public void setAuhtor(Person author)
		{
		this.author = author;
		}

	long getInvestment()
		{

		return author.salary;
		}

	}
