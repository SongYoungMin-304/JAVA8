package Chapter17;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;


// Concurrent 프로그래밍
// 멀티 스레드
public class App {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		/*ExecutorService executorService = Executors.newFixedThreadPool(4);
		Future<String> future = executorService.submit(()->"hello");
		*/
		
		CompletableFuture<String> hello = CompletableFuture.supplyAsync(()->{
			System.out.println("hello"+ Thread.currentThread().getName());
			return "Hello";
		});
		
		CompletableFuture<String> world = CompletableFuture.supplyAsync(()->{
			System.out.println("world"+ Thread.currentThread().getName());
			return "World";
		});
		
		List<CompletableFuture> futures = Arrays.asList(hello, world);
		
		CompletableFuture[] futureArray = futures.toArray(new CompletableFuture[futures.size()]);
				
		CompletableFuture<Object> future =
				CompletableFuture.allOf(futureArray)
				.thenApply(v -> {
					return futures.stream()
							.map(CompletableFuture::join)
							.collect(Collectors.toList());
				});
		
		//CompletableFuture<String> future = hello.thenCombine(world, (h, w)-> h + " " + w);
		System.out.println(future.get());
		
		
		
		
		//CompletableFuture<String> world = getWorld();
		
		//hello.get();
		//world.get();
		/*CompletableFuture<String> future = 
		hello.thenCompose(App::getWorld);
		
		System.out.println(future.get());
		*/
	}

	/*private static CompletableFuture<String> getWorld(String message) {
		return CompletableFuture.supplyAsync(()->{
			System.out.println(message+ Thread.currentThread().getName());
			return message + "World";
		});
	}*/
	
	
	
}
