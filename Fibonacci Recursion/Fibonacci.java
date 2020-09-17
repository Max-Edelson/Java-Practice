class Fibonacci {

  static int recursiveFibonacci(int n) {
    if (n == 0)
      return 0;
    else if (n == 1)
      return 1;

    return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
  }

  public static void main(String args[]) {
    for (int i = 0; i < 12; i++) {
      System.out.println(recursiveFibonacci(i));
    }
  }
}
