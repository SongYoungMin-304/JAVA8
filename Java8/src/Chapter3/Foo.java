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
	
	// scope �� �ٸ�. 
	private void run() {
	 int baseNumer = 10;
		
		/*class LocalClass{
			int baseNumber = 11;
			
			void printBaseNumber() {
				int baseNumber = 11;
				System.out.println("����Ŭ����"+baseNumber);
			}
		}
		
		Consumer<Integer> integerConumer = new Consumer<Integer>() {

			int baseNumber = 11;
			
			@Override
			public void accept(Integer baseNumber) {
				System.out.println("�͸�Ŭ����"+baseNumber);
			}
			
		};*/
		
		IntConsumer printInt = (baseNumber) -> {
			System.out.println("�͸�Ŭ����"+(baseNumber + baseNumer));
		};
		
		printInt.accept(10);
	}

}
