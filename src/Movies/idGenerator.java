package Movies;

import java.util.HashSet;
import java.util.Set;

public class idGenerator
	{
	static String generate(Product product)
		{
		Set<StringBuffer> identifiers = new HashSet<StringBuffer>();

		StringBuffer id = new StringBuffer();
		int number = 0;
		if (product instanceof Movie)
			{
			id.append("MOV");
			}
		if (product instanceof Book)
			{
			id.append("BOO");
			}
		if (product instanceof Game)
			{
			id.append("GAM");
			}
		id.append(Integer.toString(number));
		while (!identifiers.add(id))
			{
			number++;
			id.replace(3, id.length(), Integer.toString(number));
			}

		return id.toString();

		}

	}
