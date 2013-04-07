/**
 * 
 */
package sk.seges.itxp.assistant;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author ladislav.gazo
 */
public class Assistant {
	private List<Task> taskList;
	
	public Assistant() {
		taskList = new ArrayList<Task>();
		
		// nice and clean task list entries
		addTask("09.04.2013", "call Darth Vader");
		addTask("10.04.2013", "program R2D2");
		addTask("12.04.2013", "talk to Jabba");
		addTask("14.04.2013", "jump into the Heart of Gold");
		addTask("15.04.2013", "don't forget your towel");
		
	}
	
	public Assistant(String dueDate, String... taskList) {
		this.taskList = new ArrayList<Task>();
		
		// all provided tasks are assigned to the same date
		for(String text : taskList) {
			addTask(dueDate, text);
		}
	}
	
	public List<Task> whatShouldIDo(Date when) {
		if(when.before(new Date())) {
			return taskList.subList(0, 3);
		} else {
			return taskList.subList(3, 5);
		}
	}

	public void addTask(String dueDate, String text) {
		// and util class used here
		Task task = new Task(Util.readWhen(dueDate), text);
		taskList.add(task);
	}
}
