/**
 * 
 */
package sk.seges.itxp.assistant;

/**
 * @author ladislav.gazo
 */
public class Assistant {
	public String[] whatShouldIDo() {
		return new String[] { "call Darth Vader", "program R2D2", "drink Ol'Janx Spirit" }; 
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("What should I do?");
		
		Assistant assistant = new Assistant();
		String[] taskList = assistant.whatShouldIDo();
		
		for(String task : taskList) {
			System.out.println("* " + task);
		}
	}

}
