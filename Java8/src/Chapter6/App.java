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
		
		System.out.println("�ۿ��� "+k);*/
		
		names.removeIf(s -> s.startsWith("s"));
		
		names.forEach(System.out::println);
		
		
		
		names.sort(String::compareToIgnoreCase);
		
		Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
		
		names.sort(compareToIgnoreCase.reversed());
		
		// ������ 5 java 8
		// �������̽� -> ��� Ŭ����(override ��) -> ����ü
		// ����� �������̽����� �⺻ �޼ҵ� ����
		
 	}

}
