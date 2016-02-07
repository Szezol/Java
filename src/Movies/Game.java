package Movies;

import java.util.ArrayList;
import java.util.List;

public class Game extends Product implements Buyable
	{
	private boolean preOrdered = false;
	private List<Person> staff = new ArrayList<Person>();
	private int price = 0;

	public Game(boolean preOrdered, List<Person> staff, int price)
		{
		super();
		this.preOrdered = preOrdered;
		this.staff = staff;
		this.price = price;
		}

	public boolean isPreOrdered()
		{
		return preOrdered;
		}

	public void setPreOrdered(boolean preOrdered)
		{
		this.preOrdered = preOrdered;
		}

	public List<Person> getStaff()
		{
		return staff;
		}

	public void setStaff(List<Person> staff)
		{
		this.staff = staff;
		}

	public int getPrice()
		{
		return price;
		}

	public void setPrice(int price)
		{
		this.price = price;
		}

	long getInvestment()
		{
		long investment = 0;
		for (Person person : staff)
			{
			investment += person.getSalary();
			}
		// if (preOrdered)
		// {
		// investment *= 0.8;
		// }
		return investment;
		}

	}
