package Movies;

import java.util.HashMap;
import java.util.List;

public class Tools {

	public static HashMap<Person, Integer> countMoviesPerPerson(List<Movie> movies) {
		HashMap<Person, Integer> actingCounter = new HashMap<Person, Integer>();
		for (Movie movie : movies) {
			for (Person person : movie.getCast()) {
				if (!actingCounter.containsKey(person)) {
					actingCounter.put(person, 0);
				}
				actingCounter.put(person, actingCounter.get(person) + 1);

			}

		}
		return actingCounter;

	}

	public static String[] getMovieTitles(List<Movie> movies) {
		String[] titles = new String[movies.size()];
		for (int i = 0; i < titles.length; i++) {

			titles[i] = movies.get(i).getTitle();

		}
		return titles;
	}

	public static String toXMLTag(String tagName, String value) {
		return String.format("<%s>%s</%s>", tagName, value, tagName);

	}
}
