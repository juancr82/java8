package co.edu.java.lambda;

import java.util.Arrays;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {
		
		Arrays.asList( "a", "b", "d" ).forEach( e -> System.out.println( e ) );
		
		List<String> listString = Arrays.asList( "a", "x", "d" );
		listString.forEach( ( String e ) -> System.out.println( e ) );
		
		Arrays.asList( "a", "b", "d" ).forEach( e -> {
		    System.out.print( e );
		    System.out.print( e );
		} );
		
		String separator = ",";
		Arrays.asList( "a", "b", "d" ).forEach( 
		    ( String e ) -> System.out.print( e + separator ) );
		
		listString.sort( ( e1, e2 ) -> e1.compareTo( e2 ) );
		listString.forEach( ( String e ) -> System.out.println( e ) );
		
		Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> {
		    int result = e1.compareTo( e2 );
		    return result;
		} );
		
		carryOutDefault(new Functional() {
			
			@Override
			public void doWork() {
				System.out.println("Do work in SimpleFun impl...");
			}
		});
		carryOutDefault(() -> System.out.println("JC"));
		
	}
	
//	public static void carryOutDefault(Functional func){
//		func.defaultMethod();
//	}
	
	public static void carryOutDefault(Functional func){
		func.doWork();
	}

}
