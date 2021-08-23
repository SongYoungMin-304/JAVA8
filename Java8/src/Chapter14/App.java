package Chapter14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


// Concurrent 프로그래밍
// 멀티 스레드
public class App {
	
	public static void main(String[] args) throws InterruptedException {
		//ExecutorService executorService = Executors.newSingleThreadExecutor();
		/*ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		executorService.submit(() -> System.out.println("Thread"+Thread.currentThread().getName()));
		executorService.submit(() -> System.out.println("Thread"+Thread.currentThread().getName()));
		executorService.submit(() -> System.out.println("Thread"+Thread.currentThread().getName()));
		executorService.submit(() -> System.out.println("Thread"+Thread.currentThread().getName()));
		executorService.submit(() -> System.out.println("Thread"+Thread.currentThread().getName()));
		
		//executorService.shutdown();
		executorService.shutdownNow();
		*/
		ScheduledExecutorService executorService2 = Executors.newSingleThreadScheduledExecutor();
		executorService2.scheduleAtFixedRate(getRunnalbe("hello"), 1, 2, TimeUnit.SECONDS);
	
		
	}
	private static Runnable getRunnalbe(String message) {
		return () -> System.out.println(message + Thread.currentThread().getName());
	}
	
}
