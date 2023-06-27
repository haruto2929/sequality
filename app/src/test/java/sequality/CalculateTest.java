package sequality;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testSumodd() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.sumodd(1, 10));
  }

  @Test
  public void testSumeven() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.sumeven(1, 10));
  }

  @Test
  public void testAve() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.average(2, 3), 0.0);
  }
}
