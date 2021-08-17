package Chapter3;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

public class Foo {

	public static void main(String[] args) {
		Foo foo = new Foo();
		foo.run();
		
		/*Supplier<Integer> get10 = () -> 10;
		BiFunction<Integer, Integer, Integer> get20 = (a, b) -> a+b;*/
		
		
		//System.out.println(get10.get());
		//System.out.println(get20.apply(10, 20));
	}
	
	// scope 이 다름. 
	private void run() {
	 int baseNumer = 10;
		
		/*class LocalClass{
			int baseNumber = 11;
			
			void printBaseNumber() {
				int baseNumber = 11;
				System.out.println("내부클래스"+baseNumber);
			}
		}
		
		Consumer<Integer> integerConumer = new Consumer<Integer>() {

			int baseNumber = 11;
			
			@Override
			public void accept(Integer baseNumber) {
				System.out.println("익명클래스"+baseNumber);
			}
			
		};*/
		
		IntConsumer printInt = (baseNumber) -> {
			System.out.println("익명클래스"+(baseNumber + baseNumer));
		};
		
		printInt.accept(10);
	}

}
