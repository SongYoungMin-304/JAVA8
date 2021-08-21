package Chapter6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();
		names.add("song");
		names.add("song2");
		names.add("kong3");
		names.add("song4");
		
		names.forEach(System.out::println); 

		Spliterator<String> spliterator = names.spliterator();
		Spliterator<String> spliterator1 = spliterator.trySplit();
		
		/*while(spliterator.tryAdvance(System.out::println));
		System.out.println("============================");
		while(spliterator1.tryAdvance(System.out::println));*/
		
		/*long k = names.stream().map(String::toUpperCase)
				.filter(s -> s.startsWith("S")).count();
		
		System.out.println("송영민 "+k);*/
		
		names.removeIf(s -> s.startsWith("s"));
		
		names.forEach(System.out::println);
		
		
		
		names.sort(String::compareToIgnoreCase);
		
		Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
		
		names.sort(compareToIgnoreCase.reversed());
		
		// 스프링 5 java 8
		// 인터페이스 -> 상속 클래스(override 용) -> 구현체
		// 현재는 인터페이스에서 기본 메소드 가능
		
 	}

}
