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
	// introduced class field
	private String[] taskList;
	
	// introduced constructor
	public Assistant() {
		taskList = new String[] { "call Darth Vader", "program R2D2",
				"talk to Jabba", "jump into the Heart of Gold",
				"don't forget your towel" };
	}
	
	// notice we introduced new class type - java.util.Date
	public String[] whatShouldIDo(Date when) {
		if(when.before(new Date())) {
			return copyRange(0, 2);
		} else {
			return copyRange(3, 4);
		}
	}
	
	// introduced private method
	private String[] copyRange(int from, int to) {
		// verify input
		if(from < 0 || from >= taskList.length) {
			throw new IllegalArgumentException("From does not fit into the actual task list");
		}
		if(to < 0 || to < from || to >= taskList.length) {
			throw new IllegalArgumentException("To does not fit into the actual task list or is below from");
		}
			
		String[] result = new String[to - from + 1];
		
		int j = 0;
		for(int i = from; i <= to; i++) {
			result[j++] = taskList[i];
		}
		
		return result;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("What should I do?");
		
		Assistant assistant = new Assistant();
		
		// refactored to separate method + it is static because read from main
		Date when = readWhen();
		
		String[] taskList = assistant.whatShouldIDo(when);
		
		for(String task : taskList) {
			System.out.println("* " + task);
		}
	}

	private static Date readWhen() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		Date when;
		try {
			when = formatter.parse("02.12.2004");
		} catch (ParseException e) {
			throw new RuntimeException("Houston ...", e);
		}
		return when;
	}

}
