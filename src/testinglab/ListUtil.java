package testinglab;

/**
 * Find the unique element in the list
 * @author Dechabhol Kotheeranurak
 */

import java.util.ArrayList;
import java.util.List;

public class ListUtil {
	/**
	 * Count the number of distinct elements in a list. The list may be empty but
	 * not null.
	 *
	 * @param list
	 *            a list of elements
	 * @return the number of distinct elements in list
	 */
	public static int countUnique(List<?> list) {
		List<Object> tmp = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			if (!tmp.contains(list.get(i))) {
				tmp.add(list.get(i));
			}
		}
		return tmp.size();
	}

}
