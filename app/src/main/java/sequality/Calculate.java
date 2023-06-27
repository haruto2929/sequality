package sequality;

public class Calculate {
  public int sum(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      sum = sum + i;
    }
    return sum;
  }

  public double average(int x, int y) {
    double sum = 0.0;
    for (int i = x; i <= y; i++) {
      sum = sum + i;
    }

    double kosu = 0.0;
    kosu = y - x + 1;

    return sum / kosu;
  }

  public int sumodd(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 1) {
        sum = sum + i;
      }
    }
    return sum;
  }

  public int sumeven(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 0) {
        sum = sum + i;
      }
    }
    return sum;
  }
}
