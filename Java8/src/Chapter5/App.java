package Chapter5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {

	public static void main(String[] args) {
		
		Foo foo = new DefaultFoo("song");
		
		foo.printName();
		foo.printNameUpperCase();
		
		Foo.printSong();
	}

}
