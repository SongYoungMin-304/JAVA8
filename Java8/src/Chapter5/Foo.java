package Chapter5;

public interface Foo {
	
	void printName();
	
	default void printNameUpperCase() {
		System.out.println(getName().toUpperCase());
	};
	
	String getName();
	
	static void printSong() {
		System.out.println("song");
	}

}
