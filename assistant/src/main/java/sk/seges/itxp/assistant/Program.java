/**
 * 
 */
package sk.seges.itxp.assistant;

import java.util.Date;
import java.util.List;

/**
 * @author ladislav.gazo
 */
public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("What should I do intergalactic commander?");
		
		Assistant galacticAssistant = new Assistant();
		galacticAssistant.addTask("03.05.2013", "start the engine");
		
		showMeTasks(galacticAssistant);
		
		System.out.println("What should I do my duke?");
		
		// look at the principle of varargs here
		Assistant fantasyAssistant = new Assistant("05.05.2013", "call Robert Baratheon", "prepare tournament",
				"talk to Daenerys", "jump into the ship",
				"don't forget your sword");
		
		showMeTasks(fantasyAssistant);
	}
	
	private static void showMeTasks(Assistant galacticAssistant) {
		// calling util's method also from here
		Date when = Util.readWhen("02.12.2013");
		
		List<Task> taskList = galacticAssistant.whatShouldIDo(when);
		
		// our Task's toString method will produce nice output as well
		for(Task task : taskList) {
			System.out.println("* " + task);
		}
	}


}
