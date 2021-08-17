package Chapter2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Foo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Plus10 plus = new Plus10();
		System.out.println(plus.apply(1));*/

		/*Function<Integer, Integer> plus10 = (i) -> {
			return i+10;
		};*/

		Function<Integer, Integer> plus10 = (i) -> i+10;
		Function<Integer, Integer> multiply = (i) -> i*2;
		
		//System.out.println(multiply.apply(1));
		
		Function<Integer, Integer> multiplyAndPlus10 = plus10.compose(multiply);
		
		Function<Integer, Integer> multiplyAndPlus11 = plus10.andThen(multiply);
		
		System.out.println(multiplyAndPlus10.apply(2));
		
		System.out.println(multiplyAndPlus11.apply(2));
		
		
		
		//Comnumse
		Consumer<Integer> printT = (i) -> System.out.println(i);
		printT.accept(10);

		
		//BiFunction T U
		//BiFunction<T, U, R>
		
		
		//Supplier
		Supplier<Integer> get10 = () -> 10;
		System.out.println(get10.get());
		
		//Predicate
		Predicate<String> startsWithSym = (s) -> s.startsWith("song");
		Predicate<Integer> isEven = (i) -> i%2 == 0;

		//startsWithSym.and(isEven);
		
		System.out.println(startsWithSym.test("songYoung"));
		System.out.println(startsWithSym.test("son"));
		
		System.out.println(isEven.test(2));
		
		
		// UnaryOperator
		UnaryOperator<Integer> plus102 = (i) -> i+10;
		
		System.out.println(plus102.apply(2));
		
		
		
		
		
		
	}

}
