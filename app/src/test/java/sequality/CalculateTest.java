package sequality;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals("Hello World!", calculate.getGreeting());
    assertEquals(expected, calculate.sum(2, 3));
  }
}
