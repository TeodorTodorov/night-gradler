package neighborhood.impl;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Goshko
 * 
 */
public class Start {

	public Start() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		ArrayList<Language> lang1 = new ArrayList<>();
		lang1.add(Language.BABY);
		lang1.add(Language.BULGARIAN);
		lang1.add(Language.ITALY);

		// TODO: NOT HANDLING REPEATING LANGUAGES
		ArrayList<Language> lang2 = new ArrayList<>();
		lang2.add(Language.BULGARIAN);
		lang2.add(Language.DRUNK);
		lang2.add(Language.ITALY);

		//
		HumanFactory factory = new HumanFactory();
		Baby baby = (Baby) factory.getHumanInstance("Bebe", 4, lang1);
		Student student = (Student) factory.getHumanInstance("Student", 19,
				lang1);
		Human hum = (Human) factory.getHumanInstance("Human", 55, lang2);
		// TODO: Use StringBuilder insted string +
		// Bulgarian speakers test output
		Human schoolBoy = (Human) factory.getHumanInstance(
				"Ivancho Beladjiiski", 16, lang2);
		ArrayList<Human> speakers = baby
				.getLanguageSpeakers(Language.BULGARIAN);
		System.out.print("Bulgarian speakers are:");
		for (Iterator<Human> iterator = speakers.iterator(); iterator.hasNext();) {
			Human human = (Human) iterator.next();
			System.out.print(human.getName() + ", ");

		}
		// Baby speakers test output
		ArrayList<Human> speakers2 = baby
				.getLanguageSpeakers(Language.BULGARIAN);
		System.out.println("Baby speakers are:");
		for (Iterator<Human> iterator = speakers2.iterator(); iterator.hasNext();) {
			Human human = (Human) iterator.next();
			System.out.print(human.getName()+ ", ");

		}
		
		
		
		
		System.out.println("middle age is:");
		System.out.println(baby.getMiddleAge());

	}

}
