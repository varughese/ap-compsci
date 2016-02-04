public class Prob9 {

   public static boolean uniqueCharChecker(String s) {
   
      String original = s;
      
      int len = s.length();
   
    
      char firstLetter = s.charAt(0);
      char lastLetter = s.charAt(len -1);
      
      
      s = "" + lastLetter + "" + firstLetter + s.substring(1, len-1);
      
      System.out.println(s);
      
      int x = original.compareTo(s);
      System.out.println(x);

      return x == 0;
   
   }


   public static void main(String[] args) {
        
      System.out.print(uniqueCharChecker("AAAAAAAAAAAAAAAAAAAbA"));
   
   }

}