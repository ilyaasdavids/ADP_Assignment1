public class FailingTest{
@Test
  public void FailTest {
   
    Integer x1 = new Integer( 5 ) ;
    Integer x2 = x1 ;
    Integer x3 = new Integer( 5 ) ;
   
     if(x1 == null) {
        fail("x1 should not be null");
     }
     if(x2 == null) {
        fail("x2 should not be null");
     }
     if(x3 == null) {
        fail("x3 should not be null");
     }
  }
}  
