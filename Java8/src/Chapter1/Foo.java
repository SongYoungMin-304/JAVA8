package Chapter1;

public class Foo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RunSomething runSomething = new RunSomething() {

			@Override
			public void doSomething() {
				// TODO Auto-generated method stub
				System.out.println("�ۿ���");
			}
		};

		
		RunSomething runSomething2 = () ->System.out.println("�ۿ���2");
		
		runSomething.doSomething();
		runSomething2.doSomething();
		
	}

}
