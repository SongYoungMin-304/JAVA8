package Chapter4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Function<Integer, String> intTotString = (i) -> "number";
		
		UnaryOperator<String> hi = (s) -> "hi" + s;
		
		// ����ƽ �޼ҵ� ���
		UnaryOperator<String> hi2 = Greeting::hi;

		Greeting greeting = new Greeting();
		
		// �ν��Ͻ� �޼ҵ� ���
		UnaryOperator<String> hi3 = greeting::hello;
		hi3.apply("sym");
		
		// ������
		Supplier<Greeting> newGreeting = Greeting::new;
		newGreeting.get();
		
		// �Ű����� �޴� ������
		Function<String, Greeting> greeting2 = Greeting::new;
		Greeting song = greeting2.apply("song");
		System.out.println(song.getName());
		
		String[] names = {"song1","song2", "song3"};
		
		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		
		Arrays.sort(names, String::compareToIgnoreCase);
	}

}
