package Chapter10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;


/**
 * @author 82108
 * Optional Ã³¸®
 */
public class App {
	public static void main(String[] args) {
		List<OnlineClass> springClasses = new ArrayList<>();
		springClasses.add(new OnlineClass(1, "spring1", true));
		springClasses.add(new OnlineClass(2, "spring2", true));
		springClasses.add(new OnlineClass(3, "spring3", false));
		springClasses.add(new OnlineClass(4, "spring4", false));
		springClasses.add(new OnlineClass(5, "Rest spring1", false));
		
		Optional<OnlineClass> spring = springClasses.stream()
		.filter(oc -> oc.getTitle().startsWith("qw"))
		.findFirst();
		
		if(spring.isPresent()) {
			OnlineClass onlineClass1 = spring.get();
		}
		
		spring.ifPresent(oc -> System.out.println(oc.getTitle()));
		
		/*OnlineClass onlineClass1 = spring.orElse(createNewClass());*/
		
		OnlineClass onlineClass1 = spring.orElseGet(App::createNewClass);
		
		Optional<OnlineClass> onlineClass2 = spring.filter(oc -> !oc.isClosed());
		
		System.out.println(onlineClass2.isPresent());
		
		
		
		
		/*System.out.println(onlineClass1.getTitle());
		
		boolean present = spring.isPresent();
		System.out.println(present);*/
	}
	
	private static OnlineClass createNewClass() {
		System.out.println("NEW KING");
		return new OnlineClass(10, "new class", false);
	}
}
