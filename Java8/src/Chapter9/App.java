package Chapter9;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;


/**
 * @author 82108
 * Optional 처리
 */
public class App {
	public static void main(String[] args) {
		List<OnlineClass> springClasses = new ArrayList<>();
		springClasses.add(new OnlineClass(1, "spring1", true));
		springClasses.add(new OnlineClass(2, "spring2", true));
		springClasses.add(new OnlineClass(3, "spring3", false));
		springClasses.add(new OnlineClass(4, "spring4", false));
		springClasses.add(new OnlineClass(5, "Rest spring1", false));
		
		//OptionalInt.of(10);
		
		
		OnlineClass spring_boot = new OnlineClass(1, "spring boot", true);
		Optional<Progress> progress = spring_boot.getProgress();
		
		//Duration duration = progress.getStudyDuration();
		
		
		//System.out.println(duration);
	
		// Collection map Stream 등은 optional 으로 감싸지 말것
	}
}
