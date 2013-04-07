/**
 * 
 */
package sk.seges.itxp.assistant;

import java.util.Date;

/**
 * @author ladislav.gazo
 */
// our first POJO
public class Task {
	// fields of the class
	private Date dueDate;
	private String text;
	private boolean done;
	
	// non-default constructor - use generator as well
	public Task(Date dueDate, String text) {
		super();
		this.dueDate = dueDate;
		this.text = text;
	}
	
	// and generate getters and setters
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	
	// try to generate toString as well
	@Override
	public String toString() {
		return "Task [dueDate=" + dueDate + ", text=" + text + ", done=" + done
				+ "]";
	}
}
