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
	
		System.out.println("Spring 으로 시작하는 수업");
		springClasses.stream()
     		.filter(oc -> oc.getTitle().startsWith("spring"))
	    	.forEach(oc -> System.out.println(oc.getId()));
		
		System.out.println("close 되지 않은 수업");
		springClasses.stream()
				.filter(oc -> oc.isClosed())
	         	//.filter(Predicate.not(OnlineClass::isClosed))
				.forEach(oc -> System.out.println(oc.getId()));
		
		System.out.println("수업 이름만 모아서 스트림 만들기");
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
		
		System.out.println("두 수업 목록에 들어있는 모든 수업 아이디 출력");
		events.stream().flatMap(list -> list.stream())
		.forEach(oc -> System.out.println(oc.getId()));
		
		System.out.println("10부터 1씩 증가하는 무제한 스트림 중에서 앞에 10개 뺴고 최대 10개 까지만");
		Stream.iterate(10, i -> i+1)
		.skip(10)
		.limit(10)
		.forEach(System.out::println);
			
		
		System.out.println("자바 수업 중에 Test가 들어잇는 수업이 있는 지 확인");
		boolean TEST = javaClasses.stream().anyMatch(oc -> oc.getTitle().contains("java"));
		System.out.println(TEST);
		
		System.out.println("스프링 수업 중에 제목에 spring이 들어간 제목만 모아서 List로 만들기");
		List<String> spring = springClasses.stream().filter(oc -> oc.getTitle().contains("spring"))
		.map(oc -> oc.getTitle())
		.collect(Collectors.toList());
		
		spring.forEach(System.out::println);
		
	
		
	}
}
