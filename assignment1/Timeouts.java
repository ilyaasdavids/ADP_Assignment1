  
public class TimeoutTest{
  @Test
  @Timeout(6)
  public static void main (String[] args){
  
  Thread.sleep(5000);
  System.out.println("Test passed within the time");  
  
  }
} 
