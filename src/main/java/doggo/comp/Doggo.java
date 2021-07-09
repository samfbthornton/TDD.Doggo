package doggo.comp;

import java.util.ArrayList;
import java.util.List;

public class Doggo {

	public List<String> returnList(int dog) {

		List<String> doggos = new ArrayList<String>();

		dog = 11;

		for (int i = 1; i < 101; i++) {
			if (i == dog) {
				continue;
			} else if (i > 10 && i < 14) {
				doggos.add(i + "th");
			} else if (i % 10 == 1) {
				doggos.add(i + "st");
			} else if (i % 10 == 2) {
				doggos.add(i + "nd");
			} else if (i % 10 == 3) {
				doggos.add(i + "rd");
			} else {
				doggos.add(i + "th");
			}

		}
		return doggos;

	}

	public static void main(String[] args) {

	}

}
