import java.util.Comparator;

public class QuadraticFunctionComparator implements Comparator<QuadraticFunction> {
   private double val;
   
   public QuadraticFunctionComparator() {
      this(0);
   }
   
   public QuadraticFunctionComparator(double v) {
      val = v;
   }
   
   public int compare(QuadraticFunction n1, QuadraticFunction n2) {
      return (int)(n1.valueAt(val) - n2.valueAt(val) +.5);
   }

}