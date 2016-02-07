package Movies;

import java.util.ArrayList;
import java.util.List;

public class RentManager
	{
	public static void main(String[] args)
		{
		Book a_game_of_thrones = new Book();
		Person george_r_r_martin = new Person("George", "R. R. Martin", Gender.MALE, 89000);
		a_game_of_thrones.setAuhtor(george_r_r_martin);

		Book the_little_prince = new Book();
		Person antoine_de_saint_exupery = new Person("Antoine", "de Saint Exupery", Gender.MALE, 22000);
		the_little_prince.setAuhtor(antoine_de_saint_exupery);

		Person kate_winslet = new Person("Kate", "Winslet", Gender.FEMALE, 1200000);
		Person leonardo_dicaprio = new Person("Leonardo", "DiCaprio", Gender.MALE, 1813330);
		Person keanu_reeves = new Person("Keanu", "REeves", Gender.MALE, 890000);
		Person carrieanne_moss = new Person("Carrie-Anne", "Moss", Gender.FEMALE, 345000);
		Person marion_cotillard = new Person("MArion", "Cotillard", Gender.FEMALE, 1200000);

		List<Person> titanic_cast = new ArrayList<Person>();
		titanic_cast.add(kate_winslet);
		titanic_cast.add(leonardo_dicaprio);
		Movie titanic = new Movie("Titanic", Genre.ROMANTIC, 200, 4.8, titanic_cast, 120);

		List<Person> the_matrix_cast = new ArrayList<Person>();
		the_matrix_cast.add(keanu_reeves);
		the_matrix_cast.add(carrieanne_moss);
		Movie the_matrix = new Movie("The Matrix", Genre.SCI_FI, 140, 5.0, the_matrix_cast, 90);

		List<Person> inception_cast = new ArrayList<Person>();
		inception_cast.add(leonardo_dicaprio);
		inception_cast.add(marion_cotillard);
		Movie inception = new Movie("Inception", Genre.SCI_FI, 160, 5.0, inception_cast, 80);

		Person jim_john = new Person("Jim", "John", Gender.MALE, 45000);
		Person katie_jordan = new Person("Katie", "Jordan", Gender.FEMALE, 29000);
		Person tom_thompson = new Person("Tom", "Thompson", Gender.MALE, 22000);
		Person ellie_taylor = new Person("Ellie", "Taylor", Gender.FEMALE, 145000);
		Person jack_north = new Person("Jack", "North", Gender.MALE, 15000);

		List<Person> the_killer_staff = new ArrayList<Person>();
		the_killer_staff.add(jim_john);
		the_killer_staff.add(jack_north);

		List<Person> the_logic_monkey_staff = new ArrayList<Person>();
		the_logic_monkey_staff.add(ellie_taylor);
		the_logic_monkey_staff.add(tom_thompson);
		the_logic_monkey_staff.add(katie_jordan);

		Game the_killer = new Game(false, the_killer_staff, 220);
		Game the_logic_monkey = new Game(true, the_logic_monkey_staff, 500);

		System.out.println(the_killer.getInvestment());
		System.out.println(the_logic_monkey.getInvestment());
		System.out.println(the_little_prince.getInvestment());
		System.out.println(a_game_of_thrones.getInvestment());
		System.out.println(inception.getInvestment());
		System.out.println(the_matrix.getInvestment());
		System.out.println(titanic.getInvestment());

		}

	public long getSummarizedPrice(List<Buyable> products)
		{
		long summarize = 0;
		for (Buyable product : products)
			{
			summarize += product.getPrice();
			}
		return summarize;
		}

	}
