package Chapter12;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;



public class App {
	
	public static void main(String[] args) throws InterruptedException {
		Instant instant = Instant.now();
		//System.out.println(instant); // 기준시 UTC, GMT
		//System.out.println(instant.atZone(ZoneId.of("UTC"))); // 기준시 UTC, GMT
		
		
		ZoneId zone = ZoneId.systemDefault();
		//System.out.println(zone);
		
		ZonedDateTime zoneDateTime = instant.atZone(ZoneId.systemDefault());
		//System.out.println(zoneDateTime);
		
		
		LocalDateTime now = LocalDateTime.now();
		//System.out.println(now);
		
		LocalDateTime birthDay =
				LocalDateTime.of(1982, Month.JULY,15,0,0,0);
		
		ZonedDateTime nowInKorea = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		//System.out.println(nowInKorea);
		
		LocalDate today = LocalDate.now();
		LocalDate today2 = LocalDate.of(2020, Month.JULY,15);
		
		Period period = Period.between(today, today2);

		System.out.println(period.getDays());
		
		Period until = today.until(today2);
		System.out.println(until.get(ChronoUnit.DAYS));
		
		//LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter MMddyyyy = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		System.out.println(now.format(MMddyyyy));
		
		LocalDate parse = LocalDate.parse("07/15/1982", MMddyyyy);
		System.out.println(parse);
		
		Date date2 = new Date();
		Instant instant2 = date2.toInstant();
		
	}
	
	
}
