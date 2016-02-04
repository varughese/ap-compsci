public class Rounder {

   public static String round(double x) {
      int intPart = (int)x;
      
      double decPart = x - intPart;
      
      double decDigits = decPart * 100;
      
      int rest = (int)(decDigits + 0.5);
      
      return "" + intPart + "." + rest;
   }      
   public static void main(String[] args) {
      
      System.out.print( round(76.00456) );
   } 
}