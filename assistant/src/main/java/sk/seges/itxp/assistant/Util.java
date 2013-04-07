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
// introduced util class
public class Util {
	
	public static Date readWhen(String date) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		Date when;
		try {
			when = formatter.parse(date);
		} catch (ParseException e) {
			throw new RuntimeException("Houston ...", e);
		}
		return when;
	}
	
}
