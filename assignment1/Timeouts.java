  
public class TimeoutTest{
  @Test
  @Timeout(6)
  public void timeout{
  
  Thread.sleep(5000);
  System.out.println("Test passed within the time");  
  
  }
} 
