package Movies;

public class Person
	{

	String firstName = "";
	String lastName = "";
	Gender gender = null;
	int salary = 0;

	public Person(String firstName, String lastName, Gender gender, int salary)
		{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.salary = salary;
		}

	public Person(String firstName, String lastName, Gender gender)
		{

		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		}

	public String getFirstName()
		{
		return firstName;
		}

	public void setFirstName(String firstName)
		{
		this.firstName = firstName;
		}

	public String getLastName()
		{
		return lastName;
		}

	public void setLastName(String lastName)
		{
		this.lastName = lastName;
		}

	public Gender getGenre()
		{
		return gender;
		}

	public void setGenre(Gender genre)
		{
		this.gender = genre;
		}

	public void setSalary(int salary)
		{
		this.salary = salary;
		}

	public int getSalary()
		{
		return salary;
		}

	public String toXMLString()
		{
		StringBuffer toXML = new StringBuffer();
		toXML.append("<person>");
		toXML.append("<firstName>");
		toXML.append(firstName);
		toXML.append("</firstName>");
		toXML.append("<lastName>");
		toXML.append(lastName);
		toXML.append("</lastName>");
		toXML.append("<gender>");
		toXML.append(gender);
		toXML.append("</gender>");
		toXML.append("<salary>");
		toXML.append(salary);
		toXML.append("</salaey>");
		toXML.append("</person>");

		// return "<person>" + "<firstName>" + firstName + "</firstName>" +
		// "<lastName>" + lastName + "</lastName>"
		// + "<gender>" + gender + "</gender>" + "<hasOscar>" + hasOscar +
		// "</hasOscar>" + "<hasGoldenGlobe>"
		// + hasGoldenGlobe + "</hasGoldenGlobe>" + "</person>";
		return toXML.toString();
		}
	}
