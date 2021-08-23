package Chapter16;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


// Concurrent 프로그래밍
// 멀티 스레드
public class App {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(4);
		Future<String> future = executorService.submit(()->"hello");
		/*
		// TODO
		future.get();*/
		
		/*CompletableFuture<String> future = new CompletableFuture<>();
		future.complete("min");
		*/
		
		CompletableFuture<String> future1 = CompletableFuture.supplyAsync(()->{
			System.out.println("hello"+ Thread.currentThread().getName());
			return "Hello";
		}, executorService).thenApply((s) ->{
			System.out.println(Thread.currentThread().getName());
			return s.toUpperCase();
		});
		
		System.out.println(future1.get());
	}
	
	
	
}
