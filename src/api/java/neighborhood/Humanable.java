/**
 * 
 */
package neighborhood;

import java.util.ArrayList;

import com.teo.neighborhood.Human;

/**
 * @author Goshko
 * 
 */
public interface Humanable {
	public int getAge();

	public String getName();

	public float getMiddleAge();

	public ArrayList<com.teo.neighborhood.Language> getLanguages();

	public ArrayList<Human> getLanguageSpeakers(
			com.teo.neighborhood.Language lang);
	// TODO: Implement human destroy - instanceCount--

}
