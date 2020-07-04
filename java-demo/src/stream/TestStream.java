package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class TestStream {
	public static void main(String[] args){
		
		List<String> list = new ArrayList();
		list.add("12123");
		list.add("asdasd");
		list.add("erwer");
		
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println(filtered.toString());
		
		Random random = new Random();
		random.ints().limit(10);
		random.ints().limit(10).forEach(System.out::println);
		System.out.println(random.ints().limit(10).getClass());
		Arrays.asList( "a", "b", "d" ).forEach( e -> System.out.println( e ) );
		Arrays.asList( "a", "b", "d" ).forEach( ( String e ) -> System.out.println( e ) );
		Arrays.asList( "a", "b", "d" ).forEach( e -> {
		    System.out.print( e );
		    System.out.print( e );
		} );
		
	}
	
	
}
