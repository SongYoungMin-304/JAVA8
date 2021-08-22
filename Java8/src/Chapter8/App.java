package Chapter8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class App {
	
	public static void main(String[] args) {
		
		List<OnlineClass> springClasses = new ArrayList<>();
		springClasses.add(new OnlineClass(1, "spring1", true));
		springClasses.add(new OnlineClass(2, "spring2", true));
		springClasses.add(new OnlineClass(3, "spring3", false));
		springClasses.add(new OnlineClass(4, "spring4", false));
		springClasses.add(new OnlineClass(5, "Rest spring1", false));
	
		System.out.println("Spring ���� �����ϴ� ����");
		springClasses.stream()
     		.filter(oc -> oc.getTitle().startsWith("spring"))
	    	.forEach(oc -> System.out.println(oc.getId()));
		
		System.out.println("close ���� ���� ����");
		springClasses.stream()
				.filter(oc -> oc.isClosed())
	         	//.filter(Predicate.not(OnlineClass::isClosed))
				.forEach(oc -> System.out.println(oc.getId()));
		
		System.out.println("���� �̸��� ��Ƽ� ��Ʈ�� �����");
		springClasses.stream()
		.map(oc -> oc.getTitle())
		//.forEach(s -> System.out.println(s));
		.forEach(System.out::println);
	
		
		
		List<OnlineClass> javaClasses = new ArrayList<>();
		javaClasses.add(new OnlineClass(6, "java1", true));
		javaClasses.add(new OnlineClass(7, "java2", true));
		javaClasses.add(new OnlineClass(8, "java3", false));
		
		List<List<OnlineClass>> events = new ArrayList<>();
		events.add(springClasses);
		events.add(javaClasses);
		
		System.out.println("�� ���� ��Ͽ� ����ִ� ��� ���� ���̵� ���");
		events.stream().flatMap(list -> list.stream())
		.forEach(oc -> System.out.println(oc.getId()));
		
		System.out.println("10���� 1�� �����ϴ� ������ ��Ʈ�� �߿��� �տ� 10�� ���� �ִ� 10�� ������");
		Stream.iterate(10, i -> i+1)
		.skip(10)
		.limit(10)
		.forEach(System.out::println);
			
		
		System.out.println("�ڹ� ���� �߿� Test�� ����մ� ������ �ִ� �� Ȯ��");
		boolean TEST = javaClasses.stream().anyMatch(oc -> oc.getTitle().contains("java"));
		System.out.println(TEST);
		
		System.out.println("������ ���� �߿� ���� spring�� �� ���� ��Ƽ� List�� �����");
		List<String> spring = springClasses.stream().filter(oc -> oc.getTitle().contains("spring"))
		.map(oc -> oc.getTitle())
		.collect(Collectors.toList());
		
		spring.forEach(System.out::println);
		
	
		
	}
}
