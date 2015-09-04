package neighborhood.impl;

import java.util.ArrayList;

import com.teo.neighborhoodInterfaces.Humanable;

public class HumanFactory {

	public HumanFactory() {

	}

	/**
	 * @param name
	 * @param age
	 * @param language
	 * @return
	 * @throws Exception
	 */
	public Humanable getHumanInstance(String name, int age,
			ArrayList<Language> language) throws Exception {
		if (age < 6 && age >= 0) {
			Humanable result = (Humanable) new Baby(name, age, language);
			return result;
		} else if (age <= 18 && age >= 6) {
			Humanable result = (Humanable) new SchoolBoy(age, name, language);
			return result;
		} else if (age <= 25 && age > 18) {
			Humanable result = (Humanable) new Student(name, age, language);
			return result;
		} else if (age <= 60 && age > 25) {
			Humanable result = (Humanable) new NormalHuman(age, name, language);
			return result;
		} else if (age > 60) {
			Humanable result = (Humanable) new Pension(age, name, language);
			return result;
		} else {
			throw new Exception(
					"OOps it's impossible to have human with that age");

		}

	}
}
