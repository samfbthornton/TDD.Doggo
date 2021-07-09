package doggo.comp;

import java.util.ArrayList;

public class Doggo {

	public String returnList(int dog) {

		ArrayList<String> doggos = new ArrayList<String>();

		dog = 7;

		for (int i = 1; i < 101; i++) {
			if (i == dog) {
				i = dog;
			} else if (i > 3 && i < 21) {
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
		return "";
	}

	public static void main(String[] args) {

	}

}
