package Chapter11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class App {
	
	public static void main(String[] args) throws InterruptedException {
		/*Date date = new Date();
		long time = date.getTime();
		System.out.println(date);
		System.out.println(time);

		Thread.sleep(1000 * 3);
		
		Date date2 = new Date();
		long time2 = date.getTime();
		
		
		Calendar calendar = new GregorianCalendar();
		SimpleDateFormat dateFormat = new SimpleDateFormat();*/
		
		Calendar birth = new GregorianCalendar(1982,Calendar.JULY,15);
	
		System.out.println(birth.getTime());
		
		
		
	}
}
