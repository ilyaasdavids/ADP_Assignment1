public class ObjectEquality{
@Test
  public static void main (String[] args){
   
    Integer x1 = new Integer( 5 ) ;
    Integer x2 = x1 ;
    Integer x3 = new Integer( 5 ) ;
    if(x1.equals(x1)){
      System.out.println(x1 eq x1);// true
    }  
    if(x1.equals(x2)){
      System.out.println(x1 eq x2);// true
    }

    if(x1.equals(x3){
      System.out.println(x1 eq x3);// false 
     }
  }
}  
