package Chapter5;

public interface Bar{
	
	default void printNameUpperCase() {
		System.out.println("hi");
	};

}
