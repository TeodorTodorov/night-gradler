package neighborhood.impl;

import java.util.ArrayList;
import java.util.EnumMap;
import com.teo.neighborhoodInterfaces.Humanable;

public abstract class  Human implements Humanable {
	private int age = 0;
	private static int ageSum = 0;
	private static int instanceCount = 0;
	private String name = null;
	private ArrayList<Language> language;
	private static EnumMap<Language, ArrayList<Human>> speakers = new EnumMap<Language, ArrayList<Human>>(
			Language.class);

	/**
	 * @param age
	 * @param name
	 * @param language
	 */
	public Human(int age, String name, ArrayList<Language> language) {

		this.age = age;
		this.name = name;
		this.language = language;
		Human.setAgeSum(Human.getAgeSum() + age);
		Human.setInstanceCount(Human.getInstanceCount() + 1);
		putInLanguageCollection();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.teo.neighborhoodInterfaces.Humanable#getAge()
	 */
	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return this.age;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.teo.neighborhoodInterfaces.Humanable#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.teo.neighborhoodInterfaces.Humanable#getLanguageSpeakers(com.teo.
	 * neighborhood.Language)
	 */
	@Override
	public ArrayList<Human> getLanguageSpeakers(Language lang) {
		return speakers.get(lang);

	}

	/**
	 * 
	 */
	private void putInLanguageCollection() {
		for (Language objectl : this.getLanguages()) {
			if (!speakers.containsKey(objectl)) {
				ArrayList<Human> arr = new ArrayList<Human>();
				arr.add(this);
				speakers.put(objectl, arr);
			} else if (speakers.containsKey(objectl)) {
				ArrayList<Human> arr = speakers.get(objectl);
				if (!arr.contains(this)) {
					arr.add(this);
				}

			}

		}

	}

	@Override
	public ArrayList<Language> getLanguages() {
		return this.language;
	}

	@Override
	public  float getMiddleAge() {
		// TODO Auto-generated method stub
		return (Human.getAgeSum() / Human.getInstanceCount());
	}

	public static int getInstanceCount() {
		return instanceCount;
	}

	public static void setInstanceCount(int instanceCount) {
		Human.instanceCount = instanceCount;
	}

	public static int getAgeSum() {
		return ageSum;
	}

	public static void setAgeSum(int ageSum) {
		Human.ageSum = ageSum;
	}

	// TEST POINT HERE

}
