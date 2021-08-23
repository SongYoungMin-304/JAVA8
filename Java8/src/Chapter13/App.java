package Chapter13;

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


// Concurrent 프로그래밍
// 멀티 스레드
public class App {
	
	public static void main(String[] args) throws InterruptedException {
		//System.out.println(Thread.currentThread().getName());
		
		MyThread myThread = new MyThread();
		myThread.start();
		
		System.out.println("Hello");
		
		
	}
	
	static class MyThread extends Thread{
		@Override
		public void run() {
			System.out.println("Hello"+Thread.currentThread().getName());
		}
	}
	
}
