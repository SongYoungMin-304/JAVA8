package Chapter7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 82108
 * Stream Api 
 *
 */
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();
		
		names.add("song");
		names.add("kang");
		
		// 중계형 오퍼레이트, 종료형 오퍼레이트
		//Stream<String> stringStream = 
		List<String> collect = names.stream().map((s) ->{
			System.out.println(s);
			return s.toUpperCase();
		}).collect(Collectors.toList());
		
		collect.forEach(System.out::println);
		
		System.out.println("+++++++++++++++++++++++++++++++");
		
		for(String name : names) {
			if(name.startsWith("s")) {
				System.out.println("킹"+name.toUpperCase());
			}else {
				System.out.println("킹"+name);
			}
		}
		
		System.out.println("+++++++++++++++++++++++++++++++");
		
		// 병렬적 처리가 아니ㅏㄷ.
		List<String> collect2 = 
		names.parallelStream()
		.map(String::toUpperCase)
		.collect(Collectors.toList());
		
		collect2.forEach(System.out::println);

	}

}
