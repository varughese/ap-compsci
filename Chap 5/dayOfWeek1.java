public class dayOfWeek1 
{
   public static void main(String[] args)
   {
   
      // First day in January
      int dayOfWeek1 = 0;


      // Actual day wished to find weekday of      
      int day = 13;
      
      
      // Since computers start counting at 0, we subtract 1 from day to convert it into "computer speak"
      
      // Account for what the first day was by adding it
      
      // Divide by 7 and get the remainder, which will be a number from 0 through 6, representing day of week
      
      int dayOfWeek = (day - 1 + dayOfWeek1)%7 ;
      
      
      System.out.print(dayOfWeek);
   
   
   }


}