package Chapter15;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


// Concurrent 프로그래밍
// 멀티 스레드
public class App {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		Callable<String> hello = () ->{
			Thread.sleep(2000L);
			return "Hello";
		};
		
		Callable<String> java = () ->{
			Thread.sleep(3000L);
			return "java";
		};
		
		Callable<String> min = () ->{
			Thread.sleep(1000L);
			return "min";
		};
		
		//List<Future<String>> futures= executorService.invokeAll(Arrays.asList(hello, java, min));
		
		String s = executorService.invokeAny(Arrays.asList(hello, java, min));
		
		System.out.println(s);
		
		/*for(Future<String>f : futures ) {
			System.out.println(f.get());
		}*/
		
		executorService.shutdown();
		
		/*Future<String> submit = executorService.submit(hello);
		System.out.println(submit.isDone());
		System.out.println("Hello");
		
		
		submit.cancel(false);
		submit.cancel(submit.isDone());
		
		submit.get();
		
		System.out.println(submit.isDone());
		System.out.println("End");
		executorService.shutdown();*/
		
	}
	
	
	
}
