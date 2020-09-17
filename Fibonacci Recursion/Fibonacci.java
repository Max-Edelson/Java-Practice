class Fibonacci {

  static void recursiveFibonacci(int lower, int higher) {
    if (lower + higher >= 100) { return; }

    System.out.println(lower + higher);
    recursiveFibonacci(higher, lower + higher);
  }

  public static void main(String args[]) {
      System.out.println("0" + "\n1");
      recursiveFibonacci(0,1);
  }
}
