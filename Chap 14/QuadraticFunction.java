import java.util.*;

public class QuadraticFunction implements Comparable<QuadraticFunction> {
   public int a, b, c;
   
   public QuadraticFunction(int a, int b, int c) {
      this.a = a;
      this.b = b;
      this.c = c;
   }
   
   public double valueAt(double x) {
      return a * x * x + b * x + c;
   }
   
   public String toString() {
      return a+"x^2+"+b+"x+"+c;
   }
   
   public boolean equals(Object other) {
      if(other != null) {
         return ((QuadraticFunction)other).a == a &&
                ((QuadraticFunction)other).b == b &&
                ((QuadraticFunction)other).c == c; 
      } else {
         return false;
      }
   }
   
   public int compareTo(QuadraticFunction other) {
      int adiff = a - other.a;
      int bdiff = b - other.b;
      int cdiff = c - other.c;
      
      if(adiff == 0) {
         if(bdiff == 0) {
            return cdiff;
         } else {
            return bdiff;
         }
      } else {
         return adiff;
      }
   }
}