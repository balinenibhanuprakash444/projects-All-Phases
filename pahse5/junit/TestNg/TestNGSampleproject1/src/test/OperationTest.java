package test;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import com.service.Operation;

public class OperationTest {
  @Test
  public void f() {
	  Operation op = new Operation();
	  int result = op.add(10,20);
	  assertEquals(result,30);
  }
  @Test
  public void testSub() {
	  Operation op = new Operation();
	  int result = op.sub(10,5);
	  assertEquals(result,2);
  }
	  
  @Test
  public void testMult() {
	  Operation op = new Operation();
	  int result = op.sub(10,5);
	  assertEquals(result,2);
  }
  @Test
  public void testadd() {
	  Operation op = new Operation();
	  int result = op.sub(10,5);
	  assertEquals(result,2);
  }
  @Test
  public void testdiv() {
	  Operation op = new Operation();
	  int result = op.sub(10,5);
	  assertEquals(result,2);
  }


	  
}
