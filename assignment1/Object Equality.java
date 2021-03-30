public class ObjectEquality

  public static void main (String[] args){

    Integer x1 = new Integer( 5 ) ;
    Integer x2 = x1 ;
    Integer x3 = new Integer( 5 ) ;
    if( x1 == x2 ) System.out.println("x1 eq x2" );
    if( x2 == x3 ) System.out.println("x2 eq x3" );
  }
}  
