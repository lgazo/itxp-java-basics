/**
 * 
 */
package sk.seges.itxp.assistant;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ladislav.gazo
 */
// Ctrl + Shift + o organizes imports
public class Assistant {
	private List<String> taskList;
	
	public Assistant() {
		// convert String array to list
		taskList = Arrays.asList(new String[] { "call Darth Vader", "program R2D2",
				"talk to Jabba", "jump into the Heart of Gold",
				"don't forget your towel" });
	}
	
	public Assistant(String... taskList) {
		// introduced different type of list
		this.taskList = new LinkedList<String>(Arrays.asList(taskList));
	}
	
	// used list's method
	public List<String> whatShouldIDo(Date when) {
		if(when.before(new Date())) {
			return taskList.subList(0, 3);
		} else {
			return taskList.subList(3, 5);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("What should I do intergalactic commander?");
		
		Assistant galacticAssistant = new Assistant();
		// Ctrl+1 helps with method creation
		galacticAssistant.addTask("start the engine");
		
		showMeTasks(galacticAssistant);
		
		System.out.println("What should I do my duke?");
		
		Assistant fantasyAssistant = new Assistant("call Robert Baratheon", "prepare tournament",
				"talk to Daenerys", "jump into the ship",
				"don't forget your sword");
		
		showMeTasks(fantasyAssistant);
	}

	// do not forget to name parameters reasonably!
	private void addTask(String task) {
		// other method of List... put it as a first element
		taskList.add(0, task);
	}

	private static void showMeTasks(Assistant galacticAssistant) {
		Date when = readWhen();
		
		List<String> taskList = galacticAssistant.whatShouldIDo(when);
		
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
