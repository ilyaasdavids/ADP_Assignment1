public class ObjectIdentity{
  @Test
  public static void main (String[] args){

    Integer x1 = new Integer( 5 ) ;
    Integer x2 = x1 ;
    Integer x3 = new Integer( 5 ) ;
    if(x1 == x1){
      System.out.println("x1 eq x1");// true
    }  
    if(x1 == x2){
      System.out.println("x1 eq x2");// true
    }

    if(x1 == x3){
      System.out.println("x1 eq x3");// false 
     }
  }
} 
