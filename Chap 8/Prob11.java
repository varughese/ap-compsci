public class Prob11 {

   public static String cutOut(String s, String cut) {
   
      return s.substring(0, s.indexOf(cut)) + s.substring(s.indexOf(cut) + cut.length());
   
   
   }
   
   public static void main(String[] args) {
   
   
      System.out.print(cutOut("Hi-ho, hi-ho", "-ho"));
   
   }

}