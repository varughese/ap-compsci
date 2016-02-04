import java.util.Scanner;

public class LunchTime {
   public static int minutesUntilLunch(int hours, int mins) {
      
      //numbers of hours left
      int hoursTil = 12 - hours;

      //numbers of minutes left
      int minsTil = 60 - mins;

      //60 minutes in an hours + the minutes left      
      return hoursTil * 60 + minsTil;     
   }
   
   public static void main(String[] args) {
      Scanner kbd = new Scanner(System.in);
      
      System.out.print("Current Time ? " );
      
      String s = kbd.nextLine();
      
     
      int i = s.indexOf(":");
      int hours = Integer.parseInt(s.substring(0, i));
      int mins = Integer.parseInt(s.substring(i+1));   

      // calls the method
      int minsUntilLunch = minutesUntilLunch(hours,mins);
      
      kbd.close();

      System.out.print(minsUntilLunch + " minutes left until lunch !");
   }
}