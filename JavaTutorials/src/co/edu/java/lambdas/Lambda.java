package co.edu.java.lambdas;

import java.util.Arrays;

public class Lambda {

	public static void main(String[] args) {
		
		Arrays.asList( "a", "b", "d" ).forEach( e -> System.out.println( e ) );
		
		Arrays.asList( "a", "b", "d" ).forEach( ( String e ) -> System.out.println( e ) );
		
		Arrays.asList( "a", "b", "d" ).forEach( e -> {
		    System.out.print( e );
		    System.out.print( e );
		} );
		
		String separator = ",";
		Arrays.asList( "a", "b", "d" ).forEach( 
		    ( String e ) -> System.out.print( e + separator ) );
		
		Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> e1.compareTo( e2 ) );
		
		Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> {
		    int result = e1.compareTo( e2 );
		    return result;
		} );
		
	}

}
