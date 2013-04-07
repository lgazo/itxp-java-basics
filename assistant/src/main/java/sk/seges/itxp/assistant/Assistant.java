/**
 * 
 */
package sk.seges.itxp.assistant;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ladislav.gazo
 */
public class Assistant {
	// notice we introduced new class type - java.util.Date
	public String[] whatShouldIDo(Date when) {
		if(when.before(new Date())) {
			return new String[] { "call Darth Vader", "program R2D2", "talk to Jabba" };
		} else {
			return new String[] { "jump into the Heart of Gold", "don't forget your towel" };
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("What should I do?");
		
		Assistant assistant = new Assistant();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		Date when;
		try {
			when = formatter.parse("02.12.2014");
		} catch (ParseException e) {
			throw new RuntimeException("Houston ...", e);
		}
		
		String[] taskList = assistant.whatShouldIDo(when);
		
		for(String task : taskList) {
			System.out.println("* " + task);
		}
	}

}
