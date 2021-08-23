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
public class App2 {

	public static void main(String[] args) throws InterruptedException {
		// System.out.println(Thread.currentThread().getName());

		/*
		 * Thread thread = new Thread(new Runnable() {
		 * 
		 * @Override public void run() { System.out.println("Thread"); } });
		 */

		Thread thread = new Thread(() -> {
			System.out.println("Thread:" + Thread.currentThread().getName());

			try {
				Thread.sleep(3000L);
			} catch (InterruptedException e) {
				throw new IllegalStateException(e);
			}
		});
		thread.start();

		System.out.println("hello");
		thread.join();
		System.out.println(thread + "is finished");
	}
}
