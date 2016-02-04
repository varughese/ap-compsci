public class Prob7 {

   public static String convertName(String s) {
   
      int indexOfComma = s.indexOf(',');
      
      String first = s.substring(indexOfComma+1);
      
      String last = s.substring(0, indexOfComma);
   
   
      return (first + " " + last).trim();
   }

   public static void main(String[] args) {

      System.out.print(convertName("Varughese, mathew"));
   
   }

}