import java.util.Scanner;

public class Problem17 
{
   public static double getOrderTotal(int bp, int nb)
   {
      int numOfCopies = bp + nb;
      
      if(numOfCopies >= 12) {
         return 16.00 * numOfCopies;
      } else if (numOfCopies >= 3) {
         return 16.95 * numOfCopies;
      } else {
         return 20.95 * bp + 21.95 * nb;
      }
   }



   public static void main(String[] args) {
   
      Scanner kbd = new Scanner(System.in);
      
      System.out.print("Be Prepared ");
      int bp = Integer.parseInt(kbd.nextLine());
      
      System.out.print("Next Best ");
      int nb = Integer.parseInt(kbd.nextLine());

      double total = getOrderTotal(bp, nb);
      
      System.out.println("Total order is " + total);
   
   }


}

