/**
 * 
 */
package sk.seges.itxp.assistant;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author ladislav.gazo
 */
public class Assistant {
	private String[] taskList;
	
	public Assistant() {
		taskList = new String[] { "call Darth Vader", "program R2D2",
				"talk to Jabba", "jump into the Heart of Gold",
				"don't forget your towel" };
	}
	
	// non-default constructor
	public Assistant(String... taskList) {
		// introduced "this"
		this.taskList = taskList;
	}
	
	// used Java's Arrays class
	public String[] whatShouldIDo(Date when) {
		if(when.before(new Date())) {
			return Arrays.copyOfRange(taskList, 0, 3);
		} else {
			return Arrays.copyOfRange(taskList, 3, 5);
		}
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("What should I do intergalactic commander?");
		
		// rename function...
		Assistant galacticAssistant = new Assistant();
		
		showMeTasks(galacticAssistant);
		
		System.out.println("What should I do my duke?");
		
		// second instance
		Assistant fantasyAssistant = new Assistant("call Robert Baratheon", "prepare tournament",
				"talk to Daenerys", "jump into the ship",
				"don't forget your sword");
		
		showMeTasks(fantasyAssistant);
	}

	private static void showMeTasks(Assistant galacticAssistant) {
		Date when = readWhen();
		
		String[] taskList = galacticAssistant.whatShouldIDo(when);
		
		for(String task : taskList) {
			System.out.println("* " + task);
		}
	}

	private static Date readWhen() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		Date when;
		try {
			when = formatter.parse("02.12.2014");
		} catch (ParseException e) {
			throw new RuntimeException("Houston ...", e);
		}
		return when;
	}

}
