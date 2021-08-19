package Chapter5;

public class DefaultFoo implements Foo, Bar{

	String name;
	
	public DefaultFoo(String name) {
		this.name = name;
	}
	
	// 재정의를 해야함
	@Override
	public void printNameUpperCase() {
		System.out.println(getName().toUpperCase());
	}

	@Override
	public void printName() {
		// TODO Auto-generated method stub
		System.out.println(this.name);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
