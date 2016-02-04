public class Pair {
   private double first, second;
   
   public Pair(double a, double b) {
      first = a;
      second = b;
   }
   
   public void swap() {
      double temp = first; first = second; second = temp;
   }
   
   public Pair swapPair() {
      return new Pair(second, first);
   }
}